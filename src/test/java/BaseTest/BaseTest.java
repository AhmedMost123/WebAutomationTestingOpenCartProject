package BaseTest;

import Pages.AccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
protected WebDriver driver;
protected HomePage homePage;
protected LoginPage loginPage;
protected AccountPage accountPage;
    /*@BeforeClass
    public void setup(){
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        homePage=new HomePage(driver);
    }*/
    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);

        driver.get("http://localhost/opencartproject/");
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
