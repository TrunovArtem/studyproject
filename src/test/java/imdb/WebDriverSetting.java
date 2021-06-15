package imdb;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverSetting {
    public ChromeDriver driver;
    public WebDriverWait wait;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);

    }
    @After
    public void exit(){
        driver.close();
    }

}
