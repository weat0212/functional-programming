package programming;

import com.sun.tools.javac.util.List;

public class FP01Functional {

    public static final List<Integer> NUMS = List.of(1, 2, 3, 4, 35);

    public static void main(String[] args) {

        printAllNumbersInListFunction(NUMS);
        printEvenNumbersInListFunction(NUMS);
        printSquaresOfEvenNum(NUMS);
        printCubesOfOddNum(NUMS);
    }

//    private static void print(int num) {
//        System.out.println(num);
//    }

//    private static boolean isEven(int number) { return number % 2 == 0; }

    private static void printAllNumbersInListFunction(List<Integer> nums) {

        //Method Reference
//        nums.stream().forEach(FP01Functional::print);
        nums.stream().forEach(System.out::println);
        System.out.println("============================");
    }

    private static void printEvenNumbersInListFunction(List<Integer> nums) {
        //Method Reference
//        nums.stream().filter(FP01Functional::isEven).forEach(System.out::println);
        nums.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
        System.out.println("============================");
    }

    private static void printSquaresOfEvenNum(List<Integer> nums) {
        nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .forEach(System.out::println);
        System.out.println("============================");
    }

    // Ex5
    public static void printCubesOfOddNum(List<Integer> nums) {
        nums.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * n * n)
                .forEach(System.out::println);
        System.out.println("============================");
    }
}
