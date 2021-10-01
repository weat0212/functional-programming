package programming;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FP02Functional {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 35, 35, 2, 4);
        java.util.List<Integer> doubledNums = doubleList(nums);

        int sum = addListFunctional(nums);
        System.out.println("蝮賢���" + sum);

        System.out.println(sumOfSquaredNumOfList(nums));
        System.out.println("======================");
        System.out.println(sumOfCubeNumOfList(nums).get());
        System.out.println("======================");
        System.out.println(sumOfOddNums(nums).get());
        System.out.println("======================");
        distinctList(nums);
        System.out.println("======================");
        sortList(nums);
        System.out.println("======================");
        sortDistinctList(nums);
        System.out.println("======================");
        System.out.println(doubledNums);
        System.out.println("======================");
        System.out.println(evenNumList(nums));
    }

    private static int sum(int aggregate, int nextNumber) {
        System.out.println("蝝舐��:" + aggregate + " / 銝��:" + nextNumber);
        return aggregate + nextNumber;
    }

    private static int addListFunctional(List<Integer> nums) {
        // Combine all nums of list into one result
//        return nums.stream().reduce(0, FP02Functional::sum);
//        return nums.stream().reduce(0, (x, y) -> x + y);
        return nums.stream().reduce(0, Integer::sum);
    }

    // EX7
    public static Integer sumOfSquaredNumOfList(List<Integer> nums) {
//        return nums.stream().map(n -> n * n).reduce(Integer::sum);
        return nums.stream().reduce(0, (x, y) -> x * x + y * y);
    }

    // EX8
    public static Optional<Integer> sumOfCubeNumOfList(List<Integer> nums) {
        return nums.stream().map(n -> n * n * n).reduce(Integer::sum);
    }

    // EX9
    public static Optional<Integer> sumOfOddNums(List<Integer> nums) {
        return nums.stream().filter(x -> x % 2 != 0).reduce(Integer::sum);
    }

    public static void distinctList(List<Integer> nums) {
        nums.stream().distinct().forEach(System.out::println);
    }

    public static void sortList(List<Integer> nums) {
        nums.stream().sorted().forEach(System.out::println);
    }

    public static void sortDistinctList(List<Integer> nums) {
        nums.stream().distinct().sorted().forEach(System.out::println);
    }

    private static java.util.List<Integer> doubleList(List<Integer> nums) {
        return nums.stream().map(n -> n * n).collect(Collectors.toList());
    }

    // EX10
    public static java.util.List<Integer> evenNumList(List<Integer> nums) {
        return nums.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
    }
}
