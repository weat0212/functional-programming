package programming;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FP03Exercises {
    public static void main(String[] args) {
        List<Integer> nums = List.of(5,1,8,12,45,3,6,32,12,15);

        int sum = nums.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        // Ex.12 Functional Interface behind the second argument of the reduce method.
        int sum2 = nums.stream().reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        });

        int sum3 = nums.stream().reduce(0, (integer, integer2) -> integer + integer2);

        System.out.println(sum2);


        // Ex.13 Do Behavior Parameterization for mapping logic
//        List<Integer> squaredNumbers = nums.stream().map(x -> x * x).collect(Collectors.toList());

        System.out.println("*** Ex.13 ***");
//        Function<Integer, Integer> squareFunction = x -> x * x;
//        List<Integer> squaredNumbers = nums.stream().map(squareFunction).collect(Collectors.toList());

        mapAndCreateNewList(nums, x -> x * x).forEach(System.out::println);
        System.out.println("************************");
        mapAndCreateNewList(nums, x -> x * x * x).forEach(System.out::println);
    }

    public static List<Integer> mapAndCreateNewList(List<Integer> nums, Function<Integer, Integer> function) {
        return nums.stream().map(function).collect(Collectors.toList());
    }
}
