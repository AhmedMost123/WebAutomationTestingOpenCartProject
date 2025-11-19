package BaseTest;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
protected WebDriver driver;
protected HomePage homePage;
    @BeforeClass
    public void setup(){
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        homePage=new HomePage(driver);
    }
    @BeforeMethod
    public void goToHomePage(){
        driver.get("http://localhost/opencartproject/");

    }
    @AfterClass
    public void teardown(){
        driver.quit();
    }
}
