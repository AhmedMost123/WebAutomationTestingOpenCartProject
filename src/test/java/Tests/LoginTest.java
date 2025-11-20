package Tests;

//valid email:admin2@gmail.com
//pass:u123456U-
import BaseTest.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
   @DataProvider(name = "loginData")
   public Object[][] provideData() {
      return new Object[][]{
              {"admin2@gmail.com", "u123456U-"},
              {"!", "u123456U-"},
              {"email:admin2@gmail.com", "!"}
      };
   }


   @Test(dataProvider = "loginData")
   public void ensureLoginWithCredentials(String email, String password) {
      homePage.clickMyAccount();

      loginPage = homePage.clickLoginLink();

      loginPage.setEmail(email);


      loginPage.setPassword(password);

      accountPage = loginPage.clickLoginButton();


   }
}