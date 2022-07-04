package meetSky.pages;

import meetSky.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
//next step is to find the elements


}
