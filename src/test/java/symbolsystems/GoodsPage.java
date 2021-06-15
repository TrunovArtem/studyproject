package symbolsystems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoodsPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By productName = By.xpath("//h1[@class='product_name']");
    private By cartButton = By.xpath("//div[@class='pb_add2cart_button pi_add2cart_button']");

    public GoodsPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public String isValidPage (){
                return driver.findElement(productName).getText();
    }
    public Cart addToCart(){
        driver.findElement(cartButton).click();
        Cart cart = new Cart(driver, wait);
        return cart;
    }

}
