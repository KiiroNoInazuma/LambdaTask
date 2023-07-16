import tasks.*;
import java.util.function.Predicate;

public class Launcher {

    public static void main(String[] args) {
        /*Задание #1
         * Проверка на положительное и отрицательное число*/
        System.out.println("Задание #1");
        PositiveNumber positiveNumberFirst = new PositiveNumber(10);
        PositiveNumber positiveNumberSecond = new PositiveNumber(-1);
        System.out.println(positiveNumberFirst.getPositive().test(positiveNumberFirst));//через анонимный класс
        System.out.println(positiveNumberSecond.getPositiveLambda().test(positiveNumberSecond));//через лямбду
        /*----------------------------------------------------------------------------------------------------------*/
        /*Задание #2
         * Приветственное сообщение*/
        System.out.println("-----------------------------------------------------------------------------\nЗадание #2");
        Welcome welcome = new Welcome();
        welcome.consumer("Роман").accept(welcome);//через анонимный класс
        welcome.consumerLambda("Евгений").accept(welcome);//через лямбду
        /*----------------------------------------------------------------------------------------------------------*/
        /*Задание #3
         * Из double в long*/
        System.out.println("-----------------------------------------------------------------------------\nЗадание #3");
        Numbers numbersFirst = new Numbers(25.3);
        Numbers numbersSecond = new Numbers(14.3463463464363);
        System.out.println(numbersFirst.getNumbersLongFunctionLambda().apply(numbersFirst));//через анонимный класс
        System.out.println(numbersSecond.getNumbersLongFunctionLambda().apply(numbersSecond));//через лямбду
        /*----------------------------------------------------------------------------------------------------------*/
        /*Задание #4
         * Случайное число от 0 до 100*/
        System.out.println("-----------------------------------------------------------------------------\nЗадание #4");
        RandomNumber randomNumber = new RandomNumber();
        System.out.println(randomNumber.getResultRandom().get());//через анонимный класс
        System.out.println(randomNumber.getResultRandomLambda().get());//через лямбду
        /*----------------------------------------------------------------------------------------------------------*/
        /*Задание #5
         * Значение true или false о числу*/
        System.out.println("-----------------------------------------------------------------------------\nЗадание #5");
        System.out.println(HardTask.ternaryOperatorLambda((Predicate<Integer>) o -> o > 0, o -> "Положительное число", o -> "Отрицательное число").apply(-1));
        System.out.println(HardTask.ternaryOperatorLambda((Predicate<Integer>) o -> o > 0, o -> "Положительное число", o -> "Отрицательное число").apply(10));
        System.out.println(HardTask.ternaryOperator(t -> t.equals("Привет"), t -> "Одинаковые слова", t -> "Разные слова").apply("Привет"));//Без лямбды
        System.out.println(HardTask.ternaryOperator(t -> t.equals("Привет"), t -> "Одинаковые слова", t -> "Разные слова").apply("Пока"));//Без лямбды

    }
}

