package programming;

import java.util.function.*;

public class FP03BinaryOperator {
    public static void main(String[] args) {

        BiPredicate<String, Integer> biPredicate = (str, num) -> {
            return str.length() > num;
        };
        System.out.println(biPredicate.test("test", 5));


        BiFunction<String, Integer, String> biFunction = (str, num) -> {
            return str + num;
        };
        System.out.println(biFunction.apply("Age = ", 25));


        BiConsumer<String, String> biConsumer = (s1, s2) -> {
            System.out.println(s1 + s2);
        };
        biConsumer.accept("Binary ", "Consumer");


        BinaryOperator<Integer> sumBinaryOperator = (x, y) -> x + y;

        IntBinaryOperator intBinaryOperator = (x, y) -> x + y;
    }
}
