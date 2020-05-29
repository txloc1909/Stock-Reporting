package rule;

import java.util.ArrayList;
import java.util.Arrays;

public class Terms {
    public static final ArrayList<String> GAUSSIAN_DISTRIBUTED = new ArrayList<>(Arrays.asList(
            "StockPrice", "StockPriceVariation", "Score", "ScoreVariation",
            "BigPercentage", "MediumPercentage", "SmallPercentage", "TinyPercentage", "USD"
    ));

    public static final ArrayList<String> UNIFORM_DISTRIBUTED = new ArrayList<>(Arrays.asList(
            "StockCode", "Country", "StockExchange", "Index", "Press", "Fund", "President",
            "Company", "Ratio", "Hour", "Date", "Month"
    ));
}
