package programming;


import com.sun.tools.javac.util.List;

public class FP01Exercises {

    public static List<String> courses = List.of("Spring", "Spring Boot", "API",
            "Microservices", "AWS", "PCF", "Azure", "Docker", "K8s");

    public static void main(String[] args) {
        printAllCourses(courses);
        printSpringCourses(courses);
        print4WordMoreCourses(courses);
        printLengthOfCourseName(courses);
    }

    // Ex2
    public static void printAllCourses(List<String> courses) {
        courses.stream().forEach(System.out::println);
        System.out.println("======================");
    }

    // Ex3
    public static void printSpringCourses(List<String> courses) {
        courses.stream().filter(s -> s.contains("Spring")).forEach(System.out::println);
        System.out.println("======================");
    }

    // Ex4
    public static void print4WordMoreCourses(List<String> courses) {
        courses.stream().filter(s -> s.length() >= 4).forEach(System.out::println);
        System.out.println("======================");
    }

    // Ex6
    public static void printLengthOfCourseName(List<String> courses) {
        courses.stream()
//                .map(String::length)
                .map(c -> c + ": " + c.length())
                .forEach(System.out::println);
        System.out.println("======================");
    }
}
