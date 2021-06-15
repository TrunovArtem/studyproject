package imdb;

import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class imdb extends WebDriverSetting{
    @Test
    public void imdb1 () {

        PageElemets pageElemets = new PageElemets(driver, wait);
        driver.get("https://www.imdb.com/");
        wait.until(ExpectedConditions.visibilityOf(pageElemets.MenuBTN()));
        pageElemets.MenuBTN().click();
        wait.until(ExpectedConditions.visibilityOf(pageElemets.TopChartLink()));
        pageElemets.TopChartLink().click();
        int x=0;
        String f;
        String rating;
        int a= pageElemets.Rating().size();
        for (x=0; x<a; x++) {
            rating = pageElemets.Rating().get(x).getText().replace(',', '.');
            double ratingnew = Double.parseDouble(rating);
            if (ratingnew >= 9.0) {
                f = pageElemets.NameFilm().get(x).getText();
                System.out.println(f +"   "+ ratingnew);
            }
            }

    }
}
