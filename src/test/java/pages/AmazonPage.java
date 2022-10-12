package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucElementi;

    @FindBy (xpath = "(//span[@class='nav-action-inner'])[2]")
    public WebElement signinButonu;

    @FindBy (xpath = "//*[@id='ap_email']")
    public WebElement signinEMail;

    @FindBy (xpath = "//*[@id='continue']")
    public WebElement signinContiniue;

    @FindBy (xpath = "//*[text()='There was a problem']")
    public WebElement problemMessage;


    @FindBy (xpath = "//*[@class='a-expander-prompt']")
    public WebElement  needHelp;

    @FindBy (xpath = "//*[@id='auth-fpp-link-bottom']")
    public WebElement forgotPassword;

    @FindBy (xpath = "//h1")
    public WebElement passwordAssistanceText;

    @FindBy (xpath = "//a[@id='createAccountSubmit']")
    public WebElement createYourAccountButton;

    @FindBy (xpath = "//h1")
    public WebElement createAccountText;





}
