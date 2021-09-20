package programming;


import com.sun.tools.javac.util.List;

import java.util.Comparator;
import java.util.stream.Collectors;

public class FP02Exercises {

    public static List<String> courses = List.of("Spring", "Spring Boot", "API",
            "Microservices", "AWS", "PCF", "Azure", "Docker", "K8s");

    public static void main(String[] args) {
        sortCourses(courses);
        System.out.println("======================");
        sortCoursesAsc(courses);
        System.out.println("======================");
        sortCoursesDesc(courses);
        System.out.println("======================");
        lengthSortedCourses(courses);
        System.out.println("======================");
        System.out.println(ListOfLengthOfCourses(courses));
    }

    public static void sortCourses(List<String> courses) {
        courses.stream().sorted().forEach(System.out::println);
    }

    public static void sortCoursesAsc(List<String> courses) {
        courses.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
    }

    public static void sortCoursesDesc(List<String> courses) {
        courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    public static void lengthSortedCourses(List<String> courses) {
//        courses.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);
        courses.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }

    // EX11
    public static java.util.List<String> ListOfLengthOfCourses(List<String> courses) {
        return courses.stream().sorted(Comparator.comparing(String::length))
                .map(s -> s + ": " + s.length()).collect(Collectors.toList());
    }
}
