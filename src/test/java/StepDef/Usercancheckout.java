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


public class Usercancheckout {
    WebDriver driver;
    String baseUrl = "https://www.saucedemo.com";

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("user add products to cart")
    public void userAddProductsToCart() {
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

    @When("user click the cart")
    public void userClickTheCart() {
        By.id("add-to-cart-sauce-labs-backpack").findElement(driver).click();
    }

    @Then("user click checkout button")
    public void userClickCheckoutButton() {
        driver.findElement(By.className("shopping_cart_badge")).isDisplayed();
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.id("checkout")).click();

    }

    @And("user click continue button")
    public void userClickContinueButton() {
        By.id("first-name").findElement(driver).sendKeys("Rara");
        By.id("last-name").findElement(driver).sendKeys("Atmaja");
        By.id("postal-code").findElement(driver).sendKeys("12345");
        By.id("continue").findElement(driver).click();
    }

    @Then("user click the finish button")
    public void userClickTheFinishButton() {
        By.id("finish").findElement(driver).click();

    }
}
