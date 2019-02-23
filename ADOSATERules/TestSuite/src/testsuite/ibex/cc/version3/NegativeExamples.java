package testsuite.ibex.cc.version3;

import java.io.IOException;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;
import org.junit.Assert;
import org.junit.Test;

import testsuite.ibex.util.CCTestCase;

public class NegativeExamples extends CCTestCase {
	public NegativeExamples(Supplier<IbexOptions> createOptions,
			BiConsumer<ResourceSet, OperationalStrategy> registerMetamodels, String name) {
		super(createOptions, registerMetamodels, name);
	}

	private void testForPairOfModels(String source, String target) throws IOException {
		createChecker(source, target);
		runCC();
		Assert.assertFalse(checker.modelsAreConsistent());
	}
	//adding friendship in users in source model
	@Test
	public void testForUserToUserIslandRuleOneUser() throws IOException {
		testForPairOfModels("version3/users/TwoFacebookUsersWithFriendship", "version3/users/TwoInstagramUsers2");
	}
	//adding friendship for one user
	@Test
	public void testForUserToUserIslandRuleOneUser1() throws IOException {
		testForPairOfModels("version3/users/OneFacebookUser3", "version3/users/OneInstagramUser3");
	}
	//adding more users as friends to the friendship node
	@Test
	public void testForHandleIntraNetworkFollowersWithMultipleUser() throws IOException {
		testForPairOfModels("version3/users/FacebookThreeUsers", "version3/users/InstagramThreeUsers");
	}//mutation in followers(i.e target model) relation.
	@Test
	public void testForHandleIntraNetworkFollowers() throws IOException {
		testForPairOfModels("version3/users/OneFacebookUser2", "version3/users/OneInstagramUser2");
	}
	//mapping from one to many networks.
	@Test
	public void testForHandleIntraNetworkFollowers1() throws IOException {
		testForPairOfModels("version3/networks/TwoFacebookNetwork", "version3/networks/OneInstagramNetwork");
	}
	//mutation in source model (adding friendship)
	@Test
	public void testForIgnoreInterNetworkfollowership() throws IOException {
		testForPairOfModels("version3/users/ThreeFacebookNetworksWithUsers", "version3/users/ThreeInstagramNetworksWithUsers");
	}
	//mutation in target model (no followers relation in one network). 
	@Test
	public void testForHandleIntraNetworkFollowers11() throws IOException {
		testForPairOfModels("version3/networks/TwoFacebookNetwork2", "version3/networks/TwoInstagramNetwork2");
	}
	/*--------------------------------Test case for extra relation----------------------------------*/
	//mapping from many to one user 
	@Test
	public void testForIgnoreParentRelations() throws IOException {
		testForPairOfModels("version3/users/TwoFacebbookOtherUsers", "version3/users/OneInstagramOtherUser");
	}
	
	@Test
	public void testForIgnoreSpouseRelations() throws IOException {
		testForPairOfModels("version3/users/FacebookSpouseRelationUsers", "version3/users/ThreeInstagramUsers");
	}
	@Test
	public void testForIgnoreSpouseBidirectionRelations() throws IOException {
		testForPairOfModels("version3/users/FacebookSpouseRelationBidirectionRelation","version3/users/ThreeInstagramUsers");
	}

}
