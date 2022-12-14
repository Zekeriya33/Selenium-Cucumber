package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PracticeFormPage {


    public PracticeFormPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy (xpath = "//*[@name='username']")
    public WebElement username;

    @FindBy (xpath = "//*[@name='password']")
    public WebElement password;

    @FindBy (xpath = "//*[@name='comments']")
    public WebElement textArea;

    @FindBy (xpath = "//input[@name='filename']")
    public WebElement chooseFile;

    @FindBy (xpath = "//*[@name='checkboxes[]'][1]")
    public WebElement checkbox1;

    @FindBy (xpath = "//*[@name='checkboxes[]'][2]")
    public WebElement checkbox2;

    @FindBy (xpath = "//*[@name='checkboxes[]'][3]")
    public WebElement checkbox3;

    @FindBy (xpath = "//*[@name='radioval'][2]")
    public WebElement radio2Button;

    @FindBy (xpath = "//*[@value='ms3']")
    public WebElement selectItem3;

    @FindBy (xpath = "//*[@name='dropdown']")
    public WebElement dropdown;

    @FindBy (xpath = "(//*[@name='submitbutton'])[2]")
    public WebElement submitButton;

    @FindBy (xpath = "//*[@id='_valuefilename']")
    public WebElement fileName;
}
