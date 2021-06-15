package symbolsystems;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class FirstTest extends BasePage {
    @Test
    public void TestPaddingNavigation() {

        Assert.assertEquals("Терминал сбора данных Proton PMC-2160", mainPage.getBanner(3).isValidPage());
    }
    @Test
    public void TestSearch() {
        mainPage.setSearchData("370");
    }
    @Test
    public void BuyGoods() {
        String Page = mainPage.getSectionScaners().searchGoodsElement(3).addToCart().makeOrder().PageName();
        Assert.assertEquals("Сканер штрих-кода SUNMI 2D", Page);
    }
    @Test
    public void InvalidLogin() {
        String Err = mainPage.getLoginPage().enterLogin("admin").enterPassword("admin").submit().getError();
        Assert.assertEquals("Неверный логин и/или пароль", Err);
    }
    @Test
    public void GoodsAddToCart() {
        String page = mainPage.getSectionPrinters().searchGoodsElement(1).addToCart().makeOrder().PageName();
        Assert.assertEquals("Оформление заказа", page);
    }
    @Test
    public void IncorrectSearch() {
        mainPage.setSearchData("###").goodsListIsEmpty();
    }
    @Test
    public void Download() {
        mainPage.getInfoPage(5).DownloadLink();

    }

    @Test
    @FileParameters("src/test/java/ua/com/symbolsystems/loginTestingData.csv")
    public void BuyGoodsAsLoginUser (String login, String password){
        mainPage.getLoginPage().enterLogin(login).enterPassword(password).submit();
        mainPage.getSectionScaners().searchGoodsElement(3).addToCart().makeOrder().PageName();
    }
}
