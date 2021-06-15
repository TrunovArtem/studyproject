package symbolsystems;


import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

public class TestingData extends BasePage{
    @Parameters
    public static Collection<Object[]> data1() {
        return Arrays.asList(new Object[][] {
                { "244", "Принтер этикеток TSC TTP-244 Pro"},
                { "370", "Принтер чеков-этикеток Xprinter XP-370B"},
                { "L2k", "Терминал сбора данных Sunmi L2K"},
                { "IT800", "Блок питания для терминала (без кабеля питания) - IT800"},
                { "TSC TTP 244", "Принтер этикеток TSC TTP-244 Pro",},
                { "DA200", "Принтер этикеток TSC DA200",}
        });
    }
    @Parameter
    public String searchData;
    @Parameter(1)
    public String expectedResult;

}
