package generator;

import rule.Config;

import java.util.Random;

public class GaussianGenerator {
    private static final Random rand = new Random();

    private static double sample(double expectation, double stdDeviation) {
        return Math.abs(rand.nextGaussian() * stdDeviation + expectation);
    }

    private static String generateFormat(String format, double expectation, double stdDeviation) {
        return String.format(format, sample(expectation, stdDeviation));
    }


    public static String generate(String term) throws Exception {
        switch (term) {
            case "StockPrice":
                return generateFormat(
                        Config.StockPrice.FORMAT,
                        Config.StockPrice.EX,
                        Config.StockPrice.DEVIATION
                );
            case "StockPriceVariation":
                return generateFormat(
                        Config.PriceVariation.FORMAT,
                        Config.PriceVariation.EX,
                        Config.PriceVariation.DEVIATION
                );
            case "Score":
                return generateFormat(
                        Config.Score.FORMAT,
                        Config.Score.EX,
                        Config.Score.DEVIATION
                );
            case "ScoreVariation":
                return generateFormat(
                        Config.ScoreVariation.FORMAT,
                        Config.ScoreVariation.EX,
                        Config.ScoreVariation.DEVIATION
                );
            case "BigPercentage":
                return generateFormat(
                        Config.Percentage.FORMAT,
                        Config.Percentage.ex.get("big"),
                        Config.Percentage.deviation.get("big")
                );
            case "MediumPercentage":
                return generateFormat(
                        Config.Percentage.FORMAT,
                        Config.Percentage.ex.get("medium"),
                        Config.Percentage.deviation.get("medium")
                );
            case "SmallPercentage":
                return generateFormat(
                        Config.Percentage.FORMAT,
                        Config.Percentage.ex.get("small"),
                        Config.Percentage.deviation.get("small")
                );
            case "TinyPercentage":
                return generateFormat(
                        Config.Percentage.FORMAT,
                        Config.Percentage.ex.get("tiny"),
                        Config.Percentage.deviation.get("tiny")
                );
            case "USD":
                return generateFormat(
                        Config.USD.FORMAT,
                        Config.USD.EX,
                        Config.USD.DEVIATION
                );
            default:
                throw new Exception("The term \"" + term + "\" has no generator");
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(GaussianGenerator.generate("USD"));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

}