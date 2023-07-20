package tasks;

import java.util.function.Predicate;

public class PositiveNumber {
    private final int num;

    private int getNum() {
        return num;
    }

    public PositiveNumber(int num) {
        this.num = num;
    }

    public Predicate<PositiveNumber> getPositiveLambda() {
        return positiveNumber -> positiveNumber.getNum() > 0;
    }

    public Predicate<PositiveNumber> getPositive() {
        return new Predicate<>() {
            @Override
            public boolean test(PositiveNumber positiveNumber) {
                return positiveNumber.getNum() > 0;
            }
        };
    }
}

