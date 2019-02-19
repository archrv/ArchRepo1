package googlesearchstepdefinitions;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import objectrepository.GoogleResultsPage;

public class GoogleResultsSteps {

	@Then("user should land in search results page that displays number of results")
	public void user_should_land_in_search_results_page_that_displays_number_of_results() throws InterruptedException {
	    GoogleResultsPage obj_googleresultspage = new GoogleResultsPage();
	    String actualResult = obj_googleresultspage.getSearchresults().getText();
	    Assert.assertEquals("Tools", actualResult);
	    	
	}

}
