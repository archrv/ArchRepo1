package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinitions.Hook;

public class ProfilePage {
	public ProfilePage() {
		PageFactory.initElements(Hook.driver, this);
	}
	
	@FindBy(xpath="//span[@class='t-16 t-black t-bold']")
	private WebElement txt_ProfileName;

	public WebElement getTxt_ProfileName() {
		return txt_ProfileName;
	}

}
