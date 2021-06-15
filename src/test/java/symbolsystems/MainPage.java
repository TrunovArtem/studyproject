package symbolsystems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MainPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public MainPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    String BaseUrl = "http://www.symbolsystems.com.ua/";
    private By sectionScaners = By.xpath("//td[@rel='68']");
    private By loginPagePath = By.xpath("//li[@class='htm_id183']");
    private By sectionTSD = By.xpath("//td[@rel='69']");
    private By sectionPrinter = By.xpath("//td[@rel='10002']");
    private By sectionComplex = By.xpath("//td[@rel='10027']");
    private By sectionSoftware = By.xpath("//td[@rel='67']");
    private By sectionLable = By.xpath("//td[@rel='10009']");
    private By showSearchForm = By.xpath("//a[@class='show_search_form']");
    private By searchString = By.xpath("//input[@id='searchstring']");
    private By searchSubmit = By.xpath("//input[@id='searchsubmit']");
    private By naviPadding = By.xpath("//div[@class='navi']/a");
    private By bannerActive = By.xpath("//div[@class='item active']");
    private By headerMenu = By.xpath("//div[@class='header_menu']/ul/li");


    public void getMainPage() {
        driver.get(BaseUrl);
    }

    public GoodsPageList getSectionPrinters() {
        driver.findElement(sectionPrinter).click();
        GoodsPageList goodsPageList = new GoodsPageList(driver, wait);
        return goodsPageList;
    }

    public GoodsPageList getSectionScaners() {
        driver.findElement(sectionScaners).click();
        GoodsPageList goodsPageList = new GoodsPageList(driver, wait);
        return goodsPageList;
    }

    public GoodsPageList getSectionTSD() {
        driver.findElement(sectionTSD).click();
        GoodsPageList goodsPageList = new GoodsPageList(driver, wait);
        return goodsPageList;
    }

    public GoodsPageList getSectionComlex() {
        driver.findElement(sectionComplex).click();
        GoodsPageList goodsPageList = new GoodsPageList(driver, wait);
        return goodsPageList;
    }

    public GoodsPageList getSectionSoftware() {
        driver.findElement(sectionSoftware).click();
        GoodsPageList goodsPageList = new GoodsPageList(driver, wait);
        return goodsPageList;
    }

    public GoodsPageList getSectionLabel() {
        driver.findElement(sectionLable);
        GoodsPageList goodsPageList = new GoodsPageList(driver, wait);
        return goodsPageList;
    }

    public GoodsPage getBanner(int padNumber) {
        List<WebElement> BannerPadding = driver.findElements(naviPadding);
        WebElement getBannerPadding = BannerPadding.get(padNumber);
        getBannerPadding.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(bannerActive));
        driver.findElement(bannerActive).click();
        GoodsPage goodsPage = new GoodsPage(driver, wait);
        return goodsPage;
    }



    public LoginPage getLoginPage() {
        driver.findElement(loginPagePath).click();
        LoginPage loginPage = new LoginPage(driver, wait);
        return loginPage;

    }

    public GoodsPageList setSearchData(String searchData) {
        driver.findElement(showSearchForm).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchString));
        driver.findElement(searchString).sendKeys(searchData);
        driver.findElement(searchSubmit).click();
        GoodsPageList goodsPageList = new GoodsPageList(driver, wait);
        return goodsPageList;

    }
    public InfoPage getInfoPage (int indexHeaderBtn){
        List <WebElement> headerMenuList = driver.findElements(headerMenu);
        headerMenuList.get(indexHeaderBtn).click();
    return new InfoPage(driver, wait);
    }


}
