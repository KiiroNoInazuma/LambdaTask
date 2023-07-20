package tasks;

import java.util.Random;
import java.util.function.Supplier;

public class RandomNumber {
    private int getRandNum() {
        return new Random().nextInt(0, 101);
    }

    public Supplier<Integer> getResultRandom() {
        return new Supplier<>() {
            @Override
            public Integer get() {
                return getRandNum();
            }
        };
    }

    public Supplier<Integer> getResultRandomLambda() {
        return this::getRandNum;
    }
}
