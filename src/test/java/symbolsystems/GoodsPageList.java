package symbolsystems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class GoodsPageList {

    private WebDriver driver;
    private WebDriverWait wait;
    private By nothingFound = By.xpath("//div[@class='nothing_found']");
        public GoodsPageList(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public GoodsPage searchGoodsElement(int goodsNumber){
        List<WebElement> goodsList = driver.findElements(By.xpath("//a[@class='pb_product_name']"));
                WebElement goodsElement=goodsList.get(goodsNumber);
                goodsElement.click();
                GoodsPage goodsPage = new GoodsPage(driver, wait);
                return goodsPage;
    }


    public boolean  goodsListIsEmpty (){
        boolean isEmpty=false;
            if (driver.findElement(nothingFound).isDisplayed()==true) {
                isEmpty=true;
            }
     return isEmpty;
    }


}
