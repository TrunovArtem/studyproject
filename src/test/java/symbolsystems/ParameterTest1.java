package symbolsystems;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class ParameterTest1 extends BasePage {
    @Test
    @Parameters({"admin,secretPass", "user,superPass"})
    public void login(String login, String password) {
        mainPage.getMainPage();
        String Err = mainPage.getLoginPage().enterLogin(login).enterPassword(password).submit().getError();
        Assert.assertEquals("Неверный логин и/или пароль", Err);
    }

    @Test
    @FileParameters("src/test/java/com/imdb/loginTestingData.csv")
    public void login1(String login, String password) {
        mainPage.getMainPage();
        String Err = mainPage.getLoginPage().enterLogin(login).enterPassword(password).submit().getError();
        Assert.assertEquals("Неверный логин и/или пароль", Err);
    }
}
