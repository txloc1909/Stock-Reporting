package generator;

import rule.Terms;

public class DataGenerator implements Generator {
//    public boolean evaluateInputValidity(String input) {
//        return Terms.UNIFORM_DISTRIBUTED.contains(input) ||
//                Terms.GAUSSIAN_DISTRIBUTED.contains(input);
//    }


    public String generate(String term) throws Exception {
//        if (!evaluateInputValidity(term))
//            throw new Exception("The term " + term + " is not found!");

        if (Terms.GAUSSIAN_DISTRIBUTED.contains(term))
            return GaussianDistribution.generate(term);
        else if (Terms.UNIFORM_DISTRIBUTED.contains(term))
            return UniformDistribution.generate(term);
        else
            return term;
//        else
//            throw new Exception("The term " + term + " is not found");
    }
}
