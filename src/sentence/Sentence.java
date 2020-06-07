package sentence;

import generator.DataGenerator;

import java.util.StringTokenizer;

public class Sentence {
    private final String template;
    private static final String DELIM = "|";
    private StringBuffer result;
    private StringTokenizer strtok;
    private DataGenerator dataGen;

    public Sentence(String template) {
        this.template = template;
    }

    public String build() {
        strtok = new StringTokenizer(template, DELIM);
        result = new StringBuffer("");
        dataGen = new DataGenerator();
        while(strtok.hasMoreTokens()) {
            try {
                String token = strtok.nextToken();
                result.append(dataGen.generate(token));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return result.toString();
    }
}
