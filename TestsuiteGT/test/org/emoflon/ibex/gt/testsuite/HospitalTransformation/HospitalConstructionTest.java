package org.emoflon.ibex.gt.testsuite.HospitalTransformation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import HospitalExample.Carelevel;
import hospital.HospitalTransformation.api.HospitalTransformationAPI;
import hospital.example.HospitalRules;

public class HospitalConstructionTest extends HospitalTransformationAbstractTest {

	@Test
	public void constructHospital1() {
		HospitalTransformationAPI api = this.init("HospitalConstruction.xmi");
		
		// Check axiomatic rule (rules with green(++) elements only) with NACs
		assertMatchCount(1, api.hospital());
		assertApplicable(api.hospital());
		assertNotApplicable(api.hospital());
	}
	
	@Test
	public void constructHospital2() {
		HospitalTransformationAPI api = this.init("HospitalConstruction.xmi");
		
		assertApplicable(api.hospital());
		assertApplicable(api.reception());
		
		for(int i=0; i<4; i++) {
			assertApplicable(api.department(i+2, 4));
		}
		for(int i=0; i<16; i++) {
			assertApplicable(api.room(4, Carelevel.get(1)));
		}
		
		int staffID = 2;
		while(api.findDepartmentWithoutDoctor().hasMatches()) {
			assertApplicable(api.doctor(16, HospitalRules.firstNames[HospitalRules.firstNames.length%staffID]+" "+HospitalRules.lastNames[HospitalRules.lastNames.length%staffID], staffID++));
		}
		
		while(api.findRoomWithoutNurse().hasMatches()) {
			assertApplicable(api.assignNurseToRoom(HospitalRules.firstNames[HospitalRules.firstNames.length%staffID]+" "+HospitalRules.lastNames[HospitalRules.lastNames.length%staffID], staffID++));
		}
		
		int patientID = 2;
		for(int i=16; i>0; i--) {
			assertApplicable(api.patient(HospitalRules.firstNames[HospitalRules.firstNames.length%patientID]+" "+HospitalRules.lastNames[HospitalRules.lastNames.length%patientID], patientID++, Carelevel.PENDING));
		}
	
		while(api.findPatientInReception().hasMatches()) {
			assertApplicable(api.assignPatientToRoom());
		}
		
		// Check result:
		assertEquals(1, api.findHospital().countMatches());
		assertEquals(1, api.findReception().countMatches());
		assertEquals(4, api.findDepartment().countMatches());
		assertEquals(16, api.findRoom().countMatches());
		assertEquals(4, api.findDoctor().countMatches());
		assertEquals(4, api.findDocWithPatient().countMatches());
		assertEquals(16, api.findNurse().countMatches());
		assertEquals(16, api.findNurseInRoom().countMatches());
		assertEquals(16, api.findPatient().countMatches());
		assertEquals(0, api.findPatientInReception().countMatches());
		assertEquals(16, api.findPatientInRoom().countMatches());
	}
}
