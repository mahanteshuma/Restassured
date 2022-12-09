package StepDefinitions;

import io.cucumber.java.*;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;


public class GoogleSteps {
    WebDriver driver;
//Hooks
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void teraDown(){
        driver.quit();

    }

    @Given("^Launch Google Home Page$")
    public void launch_google_home_page() {

        driver.get("https://www.google.com/");
        Assert.assertTrue(driver.getTitle().equals("Google"));

    }

    @Given("Open Facebook Page")
    public void openFacebookPage() {

        driver.get("https://www.facebook.com/");
        Assert.assertTrue(driver.getTitle().equals("Facebook – log in or sign up"));
    }

    @Given("Launch Application")
    public void launchApplication() {

    }

//    @And("User enters username and password")
//    public void userEntersUsernameAndPassword() {
//
//    }

    @When("User clicks on submit button")
    public void userClicksOnSubmitButton() {

    }

    @Then("User is Navigated to home page")
    public void userIsNavigatedToHomePage() {

    }

    @Given("User enters <username> and <password>")
    public void userEntersUsernameAndPassword() {

    }
}
