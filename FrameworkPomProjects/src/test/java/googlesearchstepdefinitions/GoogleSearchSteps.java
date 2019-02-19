package googlesearchstepdefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import objectrepository.GoogleSearchPage;

public class GoogleSearchSteps {

	@Given("user is on Google homepage")
	public void user_is_on_Google_homepage() {
	    
	}

	@When("user searches for a phrase such as")
	public void user_searches_for_a_phrase_such_as(DataTable phrase) throws AWTException {
		List<Map<String, String>> phraseList = phrase.asMaps(String.class, String.class);
	    GoogleSearchPage obj_googlesearchpage = new GoogleSearchPage();
	    obj_googlesearchpage.getTxt_searchfield().sendKeys(phraseList.get(0).get("phrase"));
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	}

}
