package symbolsystems;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.BasicHttpContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

import static org.apache.commons.io.FileUtils.copyInputStreamToFile;

public class InfoPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By linkDownload = By.xpath("//a[@href='/prices/price.xls']");

    public InfoPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public void DownloadLink ()  {
        try {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(driver.findElement(linkDownload).getAttribute("href"));
        HttpResponse response = httpClient.execute(httpGet, new BasicHttpContext());
        copyInputStreamToFile(response.getEntity().getContent(), new File("C:\\Users\\TemaT\\Downloads\\Лист Microsoft Excel.xls"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
