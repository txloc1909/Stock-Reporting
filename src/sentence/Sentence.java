package sentence;

import generator.GaussianGenerator;
import generator.UniformGenerator;
import rule.Terms;

import java.util.StringTokenizer;

public class Sentence {
    private String template;
    private static String delim = "|";
    private StringBuffer strbuf = new StringBuffer("");
    private StringTokenizer strtok;

    Sentence() {
        // load sentence from file
    }

    public String build() {
        strtok = new StringTokenizer(template, delim);
        while(strtok.hasMoreTokens()) {
            try {
                String token = strtok.nextToken();
                if (Terms.GAUSSIAN_DISTRIBUTED.contains(token))
                    strbuf.append(GaussianGenerator.generate(token));
                else if (Terms.UNIFORM_DISTRIBUTED.contains(token))
                    strbuf.append(UniformGenerator.generate(token));
                else
                    strbuf.append(token);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return strbuf.toString();
    }
}
