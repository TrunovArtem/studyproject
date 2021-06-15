package symbolsystems;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParameterTest extends TestingData{


    @Test
    public void Search (){
        String ActualPage = mainPage.setSearchData(searchData).searchGoodsElement(0).isValidPage();
        Assert.assertEquals(expectedResult, ActualPage);
    }
}
