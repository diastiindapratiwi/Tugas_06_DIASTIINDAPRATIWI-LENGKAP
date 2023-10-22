package StepDef;

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
    WebDriver driver;
    String baseUrl = "https://www.saucedemo.com";

    @Given("user launch the website")
    public void userLaunchTheWebsite() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(this.driver, 10); // 10 seconds timeout

    }

    @Then("user leave username fields blank")
    public void userLeaveUsernameFieldsBlank() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(this.driver, 10); // 10 seconds timeout

        By.id("user-name").findElement(driver).sendKeys("");
    }

    @And("user leave  password fields blank")
    public void userLeavePasswordFieldsBlank() {
        By.id("password").findElement(driver).sendKeys("");
    }


    @Then("user click login button.")
    public void userClickLoginButton() {
        By.id("login-button").findElement(driver).click();

    }
}
