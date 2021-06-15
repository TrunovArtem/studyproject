package symbolsystems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;
    //String password = "admin";
   // String login = "admin";

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public LoginPage enterLogin (String login){

        driver.findElement(By.xpath("//input[@name='user_login']")).sendKeys(login);

        return this;

    }
    public LoginPage enterPassword (String password){
        driver.findElement(By.xpath("//input[@name='user_pw']")).sendKeys(password);

       return this;
    }
    public LoginPage submit (){
        driver.findElement(By.xpath("//p/input[@type='submit']")).click();

        return this;
    }
    public String getError (){
        String errorMessage = driver.findElement(By.xpath("//span[@class='error_message']")).getText();
        return errorMessage;
    }

}
