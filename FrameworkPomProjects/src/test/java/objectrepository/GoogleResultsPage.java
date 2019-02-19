package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import googlesearchstepdefinitions.Hook;

public class GoogleResultsPage {
	public GoogleResultsPage() {
		PageFactory.initElements(Hook.driver, this);
	}
	
	@FindBy (xpath = "//a[text()='Tools']")
	private WebElement searchresults;

	public WebElement getSearchresults() {
		return searchresults;
	}
	
}
