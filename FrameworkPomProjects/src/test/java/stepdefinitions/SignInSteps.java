package stepdefinitions;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import objectrepository.SignInPage;

public class SignInSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
	    Hook.driver.get("https://www.linkedin.com");
	}

	@When("user enters valid credentials as")
	public void user_enters_valid_credentials_as(DataTable credentials) {
	    List <Map<String, String>> credentialsMaps = credentials.asMaps(String.class, String.class);
	    SignInPage obj_signinpage = new SignInPage();
	    obj_signinpage.getTxt_Email().sendKeys(credentialsMaps.get(0).get("email"));
	    obj_signinpage.getTxt_Password().sendKeys(credentialsMaps.get(0).get("password"));
	}

	@When("clicks on Signin button")
	public void clicks_on_Signin_button() {
		SignInPage obj_signinpage = new SignInPage();
		obj_signinpage.getBtn_SignIn().click();
	}

	

}
