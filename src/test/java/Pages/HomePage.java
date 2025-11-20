package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;

    }

    By formLogin= By.xpath("//span[text()='My Account']");
    By loginLinkLocator=By.linkText("Login");
    public void clickMyAccount(){
        driver.findElement(formLogin).click();
    }
    public LoginPage clickLoginLink(){
        driver.findElement(loginLinkLocator).click();
        return new LoginPage(driver);
    }
}
