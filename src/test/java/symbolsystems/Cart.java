package symbolsystems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cart {
    private WebDriver driver;
    private WebDriverWait wait;
    public Cart(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public OrderPage makeOrder (){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@id='my_frame']")));
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='my_frame']")));

        driver.findElement(By.xpath("//input[@class='btn_checkout']")).click();
        OrderPage orderPage = new OrderPage(driver, wait);
        return orderPage;
    }



}
