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

public class Loginsoucedemo {
    WebDriver driver;
    String baseUrl = "https://www.saucedemo.com";


    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("user launches the website")
    public void userLaunchesTheWebsite() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(this.driver, 10); // 10 seconds timeout

        // final String dir = System.getProperty("user.dir");
      //  System.out.println("current dir = " + dir);
      //  System.setProperty("webdriver.chrome.driver", dir+"/driver/chromedriver.exe");
      //  driver = new ChromeDriver();
      //  driver.get("https://www.saucedemo.com");
       // Thread.sleep(1000);
    }

    @When("user input a registered user")
    public void user_input_a_registered_user() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(this.driver, 10); // 10 seconds timeout

        By.id("user-name").findElement(driver).sendKeys("standard_user");

    }

    @And("user input registered password")
    public void user_input_registered_password() {

       // driver.findElement(By.id("password")).sendKeys("secret_sauce");
        By.id("password").findElement(driver).sendKeys("secret_sauce");

    }

    @Then("user click login button")
    public void user_click_login_button() {
        //driver.findElement(By.id("login-button")).click();
        By.id("login-button").findElement(driver).click();

    }
}
