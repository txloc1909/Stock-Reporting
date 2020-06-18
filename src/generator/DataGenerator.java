package generator;

import rule.Terms;

public class DataGenerator implements Generator {

    public String generate(String term) throws Exception {
        if (Terms.GAUSSIAN_DISTRIBUTED.contains(term))
            return GaussianDistribution.generate(term);
        else if (Terms.UNIFORM_DISTRIBUTED.contains(term))
            return UniformDistribution.generate(term);
        else
            return term;
    }
}
