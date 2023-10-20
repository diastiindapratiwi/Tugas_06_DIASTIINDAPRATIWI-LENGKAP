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

public class Loginsoucedemo {
    WebDriver driver;
    String baseUrl = "https://www.saucedemo.com/";

    @Given("user launches the website")
    public void userLaunchesTheWebsite() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
       // SeleniumWait.withDriver(driver).withTimeOut(15).forElementToClick(element);
        // Wait for the page to load and the "user-name" element to be visible
        //WebDriverWait wait = new WebDriverWait(driver, 60);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Then("user inputs a registered username")
    public void userInputARegisteredUser() {
        // Wait for the "user-name" input field to be clickable
      //  WebDriverWait wait = new WebDriverWait(driver, 60);
        //wait.until(ExpectedConditions.elementToBeClickable(By.id("user-name")));

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }

    @And("user inputs registered password")
    public void userInputRegisteredPassword() {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @When("user clicks login button")
    public void userClicksLoginButton() {
        driver.findElement(By.id("//input[@value='login-button']")).click();
    }
}