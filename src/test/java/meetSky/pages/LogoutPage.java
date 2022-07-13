package meetSky.pages;

import meetSky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

    public LogoutPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@src=\"/index.php/avatar/Employee73/32?v=0\"]")
    public WebElement profileIcon;

    @FindBy(xpath = "//li[@data-id='logout']")
    public WebElement logoutLink;


}




