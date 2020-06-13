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
        public static Map<String, Double> ex = new HashMap<>();
        static {
            ex.put("big", 70.0);
            ex.put("medium", 30.0);
            ex.put("small", 5.0);
            ex.put("tiny", 0.5);
        };
        public static Map<String, Double> deviation = new HashMap<>();
        static {
            deviation.put("big", 20.0);
            deviation.put("medium", 10.0);
            deviation.put("small", 2.5);
            deviation.put("tiny", 0.3);
        }
        public static final String FORMAT = "%.1f%%";
    }

    public static class USD {
        public static final double EX = 75;
        public static final double DEVIATION = 10;
        public static final String FORMAT = "%.0f0.000 USD";
    }

    public static class VND {
        public static final double EX = 2.0;
        public static final double DEVIATION = 1.0;
        public static final String FORMAT = "%.1f tỷ đồng";
    }

    public static class StockAmount {
        public static final double EX = 500;
        public static final double DEVIATION = 250;
        public static final String FORMAT = "%.0f.000 đơn vị";
    }

    public static class PreviousAmount {
        public static final double EX = 250;
        public static final double DEVIATION = 100;
        public static final String FORMAT = "%.0f.000 đơn vị";
    }

    public static class LaterAmount {
        public static final double EX = 600;
        public static final double DEVIATION = 200;
        public static final String FORMAT = "%.0f.000 đơn vị";
    }

    public static class TransactionValue {
        public static final double EX = 10.0;
        public static final double DEVIATION = 5.0;
        public static final String FORMAT = "%.1f tỷ đồng";
    }
}
