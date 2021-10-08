package programming;

import java.util.List;
import java.util.function.*;

public class FP03FunctionalInterfaces2 {

    public static void main(String[] args) {
        List<Integer> nums = List.of(5,1,8,12,45,3,6,32,12,15);

        Predicate<Integer> isEvenPredicate = x -> x % 2 == 0 ;

        Function<Integer, Integer> squareFunction = x -> x * x ;
        Function<Integer, String> stringOutputFunction = x -> x + " " ;

        Consumer<Integer> sysoutConsumer = System.out::println;

        BinaryOperator<Integer> sumBinaryOperator = (x, y) -> x + y;

        // No input but return a parameter
        Supplier<Integer> randomIntegerSupplier = () -> (int)(Math.random() * 100);
        System.out.println(randomIntegerSupplier.get());

        UnaryOperator<Integer> unaryOperator = (x) -> x * 3;
        System.out.println(unaryOperator.apply(10));
    }
}
