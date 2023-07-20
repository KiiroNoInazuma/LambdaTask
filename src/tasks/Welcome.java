package tasks;

import java.util.function.Consumer;

public class Welcome {
    private String name;


    private String getName() {
        return name;
    }

    public Consumer<Welcome> consumer(String name) {
        this.name = name;
        return new Consumer<>() {
            @Override
            public void accept(Welcome welcome) {
                System.out.println(welcome.getName()+" привет!");
            }
        };
    }
    public Consumer<Welcome> consumerLambda(String name) {
        this.name = name;
        return welcome -> System.out.println(welcome.getName()+" привет!");
    }
}
