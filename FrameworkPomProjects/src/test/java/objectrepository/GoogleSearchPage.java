package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import googlesearchstepdefinitions.Hook;

public class GoogleSearchPage {
	public GoogleSearchPage() {
		PageFactory.initElements(Hook.driver, this);
	}
	
	@FindBy (name="q")
	private WebElement txt_searchfield;
	
	public WebElement getTxt_searchfield() {
		return txt_searchfield;
	}


}
