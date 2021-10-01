package programming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03FunctionalInterfaces {

    public static void main(String[] args) {
        List<Integer> nums = List.of(5,1,8,12,45,3,6,32,12,15);

        Predicate<? super Integer> isEvenPredicate = x -> x % 2 == 0 ;
        Function<? super Integer, ? extends Integer> squareFunction = x -> x * x ;
        Consumer<Integer> sysoutConsumer = System.out::println;

        nums.stream()
                .filter(isEvenPredicate)
                .map(squareFunction)
                .forEach(sysoutConsumer);
    }
}
