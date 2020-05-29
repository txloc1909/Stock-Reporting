package rule;

import java.util.*;

public class Config {
    public static class StockPrice {
        public static final double EX = 500;
        public static final double DEVIATION = 200;
        public static final String FORMAT = "%.0f00 đồng";
    }

    public static class PriceVariation {
        public static final double EX = 15;
        public static final double DEVIATION = 7.5;
        public static final String FORMAT = "%.0f00 đồng";
    }

    public static class Score {
        public static final double EX = 500;
        public static final double DEVIATION = 500;
        public static final String FORMAT = "%.1f điểm";
    }

    public static class ScoreVariation {
        public static final double EX = 5;
        public static final double DEVIATION = 4;
        public static final String FORMAT = "%.1f điểm";
    }

    public static class Percentage {
        public static Map<String, Double> ex = Map.of(
                "big", 70.0,
                "medium", 30.0,
                "small", 5.0,
                "tiny", 0.5
        );
        public static Map<String, Double> deviation = Map.of(
                "big", 20.0,
                "medium", 10.0,
                "small", 2.5,
                "tiny", 0.3
        );
        public static final String FORMAT = "%.1f%%";
    }

    public static class USD {
        public static final double EX = 75;
        public static final double DEVIATION = 10;
        public static final String FORMAT = "%.0f0.000 USD";
    }


}
