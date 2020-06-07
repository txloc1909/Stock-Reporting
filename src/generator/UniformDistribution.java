package generator;

import rule.Literals;

import java.util.ArrayList;
import java.util.Random;

public class UniformDistribution {
    private static final Random rand = new Random();

    private static String sample(ArrayList<String> literal) {
        return literal.get(rand.nextInt(literal.size()));
    }

    private static String generateStockCode() {
        StringBuilder code = new StringBuilder(3);
        for (int i = 0; i < 3; i++)
            // generate uppercase characters based on their ASCII code
            code.append((char)(rand.nextInt(26)+65));
        return code.toString();
    }

    private static String generateRatio() {
        return String.format("%d", rand.nextInt(10) + 1);
    }

    private static String generateHour() {
        return String.format("%dh%d0", rand.nextInt(12)+1, rand.nextInt(6));
    }

    private static String generateDate() {
        return String.format("%d", rand.nextInt(28)+1);
    }

    private static String generateMonth() {
        return String.format("%d", rand.nextInt(12)+1);
    }

    private static String generateYear() {
        return String.format("%d", rand.nextInt(20) + 2000);
    }

    public static String generate(String term) throws Exception{
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
                throw new Exception("The term \"" + term + "\" has no generator");
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(UniformDistribution.generate("StockCode"));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
