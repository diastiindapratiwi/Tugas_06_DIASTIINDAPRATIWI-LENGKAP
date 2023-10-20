package TestRunner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
//import net.serenitybdd.cucumber.*;
//import net.serenitybdd.*;

public class LoginNegativTestcase {
    @Given("user launch the website")
    public void userLaunchTheWebsite() {
    }

    @Then("user leave username fields blank")
    public void userLeaveUsernameFieldsBlank() {
    }

    @And("user leave  password fields blank")
    public void userLeavePasswordFieldsBlank() {
    }

    @Then("user click login button.")
    public void userClickLoginButton() {
    }
}
