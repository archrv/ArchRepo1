package stepdefinitions;

import org.junit.Assert;

import cucumber.api.java.en.Then;

import objectrepository.ProfilePage;
import objectrepository.SignInPage;

public class ProfileSteps {

	@Then("user should be navigate to profile page which displays username")
	public void user_should_be_navigate_to_profile_page_which_displays_username() {
		ProfilePage obj_profilepage = new ProfilePage();
		String actualProfileName = obj_profilepage.getTxt_ProfileName().getText();
		Assert.assertEquals("Archana V", actualProfileName);
	}
}
