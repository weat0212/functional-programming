package programming;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Course {
    private String name;
    private String category;
    private int reviewScore;
    private int noOfStudents;

    public Course(String name, String category, int reviewScore, int noOfStudents) {
        this.name = name;
        this.category = category;
        this.reviewScore = reviewScore;
        this.noOfStudents = noOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", reviewScore=" + reviewScore +
                ", noOfStudents=" + noOfStudents +
                '}';
    }
}

public class FP04CustomClass {

    public static void main(String[] args) {

        List<Course> courses =
                List.of(
                        new Course("Spring", "Framework", 98, 100),
                        new Course("Spring Boot", "Framework", 85, 200),
                        new Course("API", "Backend", 86, 300),
                        new Course("Microservice", "Backend", 75, 1000),
                        new Course("AWS", "Cloud", 77, 1080),
                        new Course("Azure", "Cloud", 88, 1001),
                        new Course("Docker", "Cloud", 78, 350),
                        new Course("K8s", "Cloud", 86, 189)
                );

        //allMatch, nonMatch, anyMatch
        Predicate<Course> reviewScoreGreaterThan70Predicate = course -> course.getReviewScore() > 70;
        Predicate<Course> reviewScoreGreaterThan90Predicate = course -> course.getReviewScore() > 90;
        Predicate<Course> reviewScoreLessThan90Predicate = course -> course.getReviewScore() < 90;

        System.out.println(courses.stream().allMatch(reviewScoreGreaterThan70Predicate));
        System.out.println(courses.stream().noneMatch(reviewScoreGreaterThan90Predicate));
        System.out.println(courses.stream().anyMatch(reviewScoreLessThan90Predicate));

        // Sorting
        Comparator<? super Course> comparingByNoOfStudentsAsc = Comparator.comparing(Course::getNoOfStudents);
        Comparator<? super Course> comparingByNoOfStudentsDesc = Comparator.comparing(Course::getNoOfStudents).reversed();

        System.out.println(courses.stream().sorted(comparingByNoOfStudentsAsc).collect(Collectors.toList()));
        System.out.println(courses.stream().sorted(comparingByNoOfStudentsDesc).collect(Collectors.toList()));

        // More Conditions
        Comparator<? super Course> comparingByNoOfStudentsAndNoOfReviews =
                Comparator.comparing(Course::getNoOfStudents).thenComparing(Course::getReviewScore);
        System.out.println(courses.stream().sorted(comparingByNoOfStudentsAndNoOfReviews).collect(Collectors.toList()));

        // Limit
        System.out.println(
                courses.stream().sorted(comparingByNoOfStudentsAndNoOfReviews)
                        .limit(1).collect(Collectors.toList()));

        // Skip
        System.out.println(
                courses.stream().sorted(comparingByNoOfStudentsAndNoOfReviews)
                        .skip(5).collect(Collectors.toList()));

        // takeWhile
        System.out.println("************************");
        System.out.println(
            courses.stream().takeWhile(course -> course.getReviewScore() >= 80).collect(Collectors.toList()));

        System.out.println(
            courses.stream().dropWhile(course -> course.getReviewScore() >= 80).collect(Collectors.toList()));

        Stream.of("a","b","c","","e","f","","g","h").dropWhile(s-> !s.isEmpty())
                .forEach(System.out::print);
    }
}
