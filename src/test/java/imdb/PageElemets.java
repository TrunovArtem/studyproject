package imdb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PageElemets {
    private WebDriver driver;
    private WebDriverWait wait;
    public PageElemets(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }


    WebElement MenuBTN() {
        WebElement menuBTN = driver.findElement(By.xpath("//nav/div[2]/label[2]/div[@class='ipc-button__text']"));
        return (menuBTN);
    }

    WebElement TopChartLink(){
        WebElement topChartLink = driver.findElement(By.xpath("//a[@href='/chart/top/?ref_=nv_mv_250']"));
        return (topChartLink);
    }
    List <WebElement> Rating (){

        List <WebElement> c = driver.findElements(By.xpath("//*//table/tbody[@class]/tr/td[3]"));
        return (c) ;
    }
    List <WebElement> NameFilm (){
        List <WebElement> d = driver.findElements(By.xpath("//*//table/tbody[@class]/tr/td[@class='titleColumn']"));
        return (d) ;
    }
}
