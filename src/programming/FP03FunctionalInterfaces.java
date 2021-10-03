package programming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03FunctionalInterfaces {

    public static void main(String[] args) {
        List<Integer> nums = List.of(5,1,8,12,45,3,6,32,12,15);

        Predicate<Integer> isEvenPredicate = x -> x % 2 == 0 ;
        Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer x) {
                return x % 2 == 0;
            }
        } ;

        Function<Integer, Integer> squareFunction = x -> x * x ;
        Function<Integer, Integer> squareFunction2 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        } ;

        Consumer<Integer> sysoutConsumer = System.out::println;
        Consumer<Integer> sysoutConsumer2 = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
        Consumer<Integer> sysoutConsumer3 = integer -> System.out.println(integer);

        nums.stream()
                .filter(isEvenPredicate2)
                .map(squareFunction2)
                .forEach(sysoutConsumer2);
    }
}
