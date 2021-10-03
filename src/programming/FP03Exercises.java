package programming;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

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
    }
}
