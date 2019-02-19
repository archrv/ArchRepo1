package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinitions.Hook;

public class SignInPage {
	public SignInPage() {
		PageFactory.initElements(Hook.driver, this);
	}
		
		@FindBy(id="login-email")
		private WebElement txt_Email;
		
		@FindBy(id="login-password")
		private WebElement txt_Password;
		
		@FindBy(xpath="//input[@value='Sign in']")
		private WebElement btn_SignIn;

		public WebElement getTxt_Email() {
			return txt_Email;
		}

		public WebElement getTxt_Password() {
			return txt_Password;
		}

		public WebElement getBtn_SignIn() {
			return btn_SignIn;
		}

}
