import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.Test;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Login{
    @Test
    public void open_browser(){
        WebDriver driver;
        String baseUrl = "https://www.saucedemo.com/";

        WebDriverManager.chromedriver().setup();


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);


        //input email
        //driver.fineElement(By.id("email").sendKeys(
    }
}