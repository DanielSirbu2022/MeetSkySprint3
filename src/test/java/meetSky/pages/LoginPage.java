package meetSky.pages;

import meetSky.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.text.html.CSS;

public class LoginPage {

    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="user")
    public WebElement usernameInputbox;

    @FindBy(id="password")
    public WebElement passwordInputbox;

    @FindBy(id="submit-form")
    public WebElement loginButton;

    @FindBy(className="app-icon")
     public WebElement fileIcon;

    @FindBy(xpath ="//*[@class='warning wrongPasswordMsg']")
    public WebElement errorMessage;


@FindBy(css="a[class='toggle-password']")
public WebElement eyePassword;

@FindBy(xpath="//*[@id='lost-password']")
public WebElement forgotPaswword;


@FindBy(xpath="//*[@id='reset-password-submit']")
public WebElement resetPassword;


@FindBy(xpath="//input[@placeholder=('Username or email')]")
public WebElement placeholderUsername;


@FindBy(xpath="//*[@id=\"password\"]")
    public WebElement placeholderPassword;



}
