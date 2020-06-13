package generator;

import rule.Literals;

import java.util.ArrayList;
import java.util.Random;

public class UniformDistribution {
    private static Random rand = new Random();

    static String sample(ArrayList<String> literal) {
        return literal.get(rand.nextInt(literal.size()));
    }

    static String generateStockCode() {
        StringBuilder code = new StringBuilder(3);
        for (int i = 0; i < 3; i++)
            // generate uppercase characters based on their ASCII code
            code.append((char)(rand.nextInt(26)+65));
        return code.toString();
    }

    static String generateRatio() {
        return String.format("%d", rand.nextInt(10) + 1);
    }

    static String generateHour() {
        return String.format("%dh%d0", rand.nextInt(12)+1, rand.nextInt(6));
    }

    static String generateDate() {
        return String.format("%d", rand.nextInt(28)+1);
    }

    static String generateMonth() {
        return String.format("%d", rand.nextInt(12)+1);
    }

    static String generateYear() {
        return String.format("%d", rand.nextInt(20) + 2000);
    }

    public static String generate(String term) throws Exception {
        switch (term) {
            case "StockCode":
                return generateStockCode();
            case "Country":
                return sample(Literals.COUNTRIES);
            case "StockExchange":
                return sample(Literals.STOCK_EXCHANGE);
            case "Index":
                return sample(Literals.INDEX);
            case "Press":
                return sample(Literals.PRESS);
            case "Fund":
                return sample(Literals.FUNDS);
            case "President":
                return sample(Literals.PRESIDENTS);
            case "Company":
                return sample(Literals.COMPANIES);
            case "Ratio":
                return generateRatio();
            case "Hour":
                return generateHour();
            case "Date":
                return generateDate();
            case "Month":
                return generateMonth();
            case "Year":
                return generateYear();
            default:
                throw new Exception("The term " + term + " has no generator!");
        }
    }
}
