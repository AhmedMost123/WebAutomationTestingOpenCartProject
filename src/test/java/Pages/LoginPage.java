package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
 WebDriver driver;
 Select select;
 public LoginPage(WebDriver driver){
     this.driver=driver;
 }
    By emailTextBoxLocator=By.name("email");
    By passwordTextBoxLocator=By.name("password");
    By loginButtonLocator=By.xpath("//button[text()='Login']");

    By alertMessageLocator=By.id("alert");
    public boolean isAlertDisplayed() {
        return driver.findElements(alertMessageLocator).size() > 0;
    }
    public void setEmail(String email){
        driver.findElement(emailTextBoxLocator).sendKeys(email);
    }
    public void setPassword(String password){
        driver.findElement(passwordTextBoxLocator).sendKeys(password);
    }
    public AccountPage clickLoginButton(){
        driver.findElement(loginButtonLocator).click();
        return new AccountPage(driver);
    }






}
