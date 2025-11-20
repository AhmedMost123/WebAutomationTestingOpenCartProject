package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {
    WebDriver driver;
    public AccountPage(WebDriver driver){
        this.driver=driver;
    }
    By actualTitleLocator=By.xpath("//h1[text()='My Account']");
    String expectedTitleLocator="My Account";
    public String getActualTitle(){
        if (driver.findElements(actualTitleLocator).isEmpty()) {
            return null; // Avoid exception
        }
        return driver.findElement(actualTitleLocator).getText();
    }
    public String expectedTitle(){
        return expectedTitleLocator;
    }


    /*public boolean isMyAccountTitleDisplayed(){
        return !driver.findElements(By.xpath("//h1[text()='My Account']")).isEmpty();
    }*/

}


