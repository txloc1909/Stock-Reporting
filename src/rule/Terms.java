package rule;

import java.util.ArrayList;
import java.util.Arrays;

public class Terms {
    public static final ArrayList<String> GAUSSIAN_DISTRIBUTED = new ArrayList<>(Arrays.asList(
            "StockPrice", "StockPriceVariation", "StockAmount", "Score", "ScoreVariation",
            "BigPercentage", "MediumPercentage", "SmallPercentage", "TinyPercentage", "USD",
            "TransactionValue", "PreviousAmount", "LaterAmount"
    ));

    public static final ArrayList<String> UNIFORM_DISTRIBUTED = new ArrayList<>(Arrays.asList(
            "StockCode", "Country", "StockExchange", "Index", "Press", "Fund", "President",
            "Company", "Ratio", "Hour", "Date", "Month", "Year"
    ));
}
