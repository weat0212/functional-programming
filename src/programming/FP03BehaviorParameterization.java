package programming;

import java.util.List;
import java.util.function.Predicate;

public class FP03BehaviorParameterization {

    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 3, 5, 7, 9, 11, 12, 14, 20);

//        Predicate<Integer> evenPredicate = x -> x % 2 == 0;
//        filterAndPrint(nums, evenPredicate);
        filterAndPrint(nums, x -> x % 2 == 0);


//        Predicate<Integer> oddPredicate = x -> x % 2 != 0;
//        filterAndPrint(nums, oddPredicate);
        filterAndPrint(nums, x -> x % 2 != 0);
    }

    private static void filterAndPrint(List<Integer> nums, Predicate<Integer> predicate) {
        nums.stream().filter(predicate)
                .forEach(System.out::println);
    }
}
