package programming;

import java.util.List;
import java.util.function.Predicate;

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

    }
}
