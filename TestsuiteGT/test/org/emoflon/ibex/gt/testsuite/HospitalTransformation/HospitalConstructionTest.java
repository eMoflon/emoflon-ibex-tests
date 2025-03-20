package org.emoflon.ibex.gt.testsuite.HospitalTransformation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import HospitalExample.Carelevel;
import hospital.gt.api.GtGtApi;
import hospital.util.HospitalRules;
public class HospitalConstructionTest extends HospitalTransformationAbstractTest {

	@Test
	public void constructHospital1() {
		GtGtApi<?> api = this.initEmpty("HospitalConstruction.xmi");
		
		// Check axiomatic rule (rules with green(++) elements only) with NACs
		assertMatchCount(1, api.hospital());
		assertApplicableAndApply(api.hospital());
		assertNotApplicable(api.hospital());
		
		terminate(api);
	}
	
	@Test
	public void constructHospital2() {
		GtGtApi<?> api = this.initEmpty("HospitalConstruction.xmi");
		
		assertApplicableAndApply(api.hospital());
		assertApplicableAndApply(api.reception());
		
		for(int i=0; i<4; i++) {
			assertApplicableAndApply(api.department(i+2, 4));
		}
		for(int i=0; i<16; i++) {
			assertApplicableAndApply(api.room(4, Carelevel.get(1)));
		}
		
		int staffID = 2;
		while(api.findDepartmentWithoutDoctor().hasMatches(true)) {
			assertApplicableAndApply(api.doctor(16, HospitalRules.firstNames[HospitalRules.firstNames.length%staffID]+" "+HospitalRules.lastNames[HospitalRules.lastNames.length%staffID], staffID++));
		}
		
		while(api.findRoomWithoutNurse().hasMatches(true)) {
			assertApplicableAndApply(api.assignNurseToRoom(HospitalRules.firstNames[HospitalRules.firstNames.length%staffID]+" "+HospitalRules.lastNames[HospitalRules.lastNames.length%staffID], staffID++));
		}
		
		int patientID = 2;
		for(int i=16; i>0; i--) {
			assertApplicableAndApply(api.patient(HospitalRules.firstNames[HospitalRules.firstNames.length%patientID]+" "+HospitalRules.lastNames[HospitalRules.lastNames.length%patientID], patientID++, Carelevel.PENDING));
		}
	
		while(api.findPatientInReception().hasMatches(true)) {
			assertApplicableAndApply(api.assignPatientToRoom());
		}
		
		// Check result:
		assertEquals(1, api.findHospital().countMatches(true));
		assertEquals(1, api.findReception().countMatches(false));
		assertEquals(4, api.findDepartment().countMatches(false));
		assertEquals(16, api.findRoom().countMatches(false));
		assertEquals(4, api.findDoctor().countMatches(false));
		assertEquals(4, api.findDocWithPatient().countMatches(false));
		assertEquals(16, api.findNurse().countMatches(false));
		assertEquals(16, api.findNurseInRoom().countMatches(false));
		assertEquals(16, api.findPatient().countMatches(false));
		assertEquals(0, api.findPatientInReception().countMatches(false));
		assertEquals(16, api.findPatientInRoom().countMatches(false));
		
		terminate(api);
	}
}
