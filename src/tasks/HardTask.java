package tasks;

import java.util.function.Function;
import java.util.function.Predicate;

public class HardTask {
    public static <T, U> Function<T, U> ternaryOperatorLambda(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return t -> condition.test(t) ? ifTrue.apply(t) : ifFalse.apply(t);
    }

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return new Function<>() {
            @Override
            public U apply(T t) {
                if (condition.test(t)) return ifTrue.apply(t);
                return ifFalse.apply(t);
            }
        };
    }
}

