package tasks;

import java.util.function.Function;

public class Numbers {
    private final double numDouble;

    public Numbers(double numDouble) {
        this.numDouble = numDouble;
    }

    private double getNumDouble() {
        return numDouble;
    }

    public Function<Numbers, Long> getNumbersLongFunction() {
        return new Function<>() {
            @Override
            public Long apply(Numbers numbers) {
                return Math.round(numbers.getNumDouble());
            }
        };
    }

    public Function<Numbers, Long> getNumbersLongFunctionLambda() {
        return numbers -> Math.round(numbers.numDouble);
    }
}
