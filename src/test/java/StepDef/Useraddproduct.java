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

public class Useraddproduct {

    WebDriver driver;
    String baseUrl = "https://www.saucedemo.com";

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("user launch to the dasboard page")
    public void userLaunchToTheDasboardPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(this.driver, 10);
        By.id("user-name").findElement(driver).sendKeys("standard_user");
        By.id("password").findElement(driver).sendKeys("secret_sauce");
        By.id("login-button").findElement(driver).click();
    }

    @When("user click the product")
    public void userClickTheProduct() {
        By.id("header_container").findElement(driver).click();
    }

    @Then("user click add to cart button")
    public void userClickAddToCartButton() {
        By.id("add-to-cart-sauce-labs-backpack").findElement(driver).click();
    }
}
