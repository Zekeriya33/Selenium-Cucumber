package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoPage {
    public DemoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//*[@id='item-1'])[2]")
    public WebElement alertWE;

    @FindBy (xpath = "(//*[@id='timerAlertButton'])")
    public WebElement onButtonAlert;

    @FindBy (xpath = "//*[@id='enableAfter']")
    public WebElement enable;
}
