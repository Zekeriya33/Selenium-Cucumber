package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class GridTestStepDefinition {
    WebDriver driver;

    @Given("user is on the application_url {string}")
    public void userIsOnTheApplication_url(String url) throws MalformedURLException {

       driver = new RemoteWebDriver(new URL("http://192.168.1.108:4444"), new ChromeOptions());
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.manage().window().maximize();
         driver.get(url);

    }

    @Then("verify the page title is {string}")
    public void verifyThePageTitleIs(String expectedTitle) {
     String actualTitle = driver.getTitle();

        Assert.assertEquals("Title uyusmadı",expectedTitle,actualTitle);
    }

    @Then("close the remote driver")
    public void closeTheRemoteDriver() {
        driver.quit();
    }

    @Given("user is on the application_url with MicrosoftEdge {string}")
    public void userIsOnTheApplication_urlWithMicrosoftEdge(String url) throws MalformedURLException {

        driver = new RemoteWebDriver(new URL("http://192.168.1.108:4444"), new EdgeOptions());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(url);
    }
}
