package sentence;

import generator.RandomGenerator;
import generator.Generator;

import java.util.StringTokenizer;

public class Sentence {
    private final String template;
    private static final String DELIMITER = "|";
    private StringBuffer result;
    private StringTokenizer tokenizer;
    private Generator generator;

    public Sentence(String template) {
        this.template = template;
    }

    public String build() {
        tokenizer = new StringTokenizer(template, DELIMITER);
        result = new StringBuffer();
        generator = new RandomGenerator();
        while(tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            try {
                result.append(generator.generate(token));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return result.toString();
    }
}
