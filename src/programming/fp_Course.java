package programming;

import java.util.List;

public class fp_Course {
    public static void main(String[] args) {
        List<String> courses = List.of("spring", "spring boot", "api", "Microservice", "AWS");
        printCourse(courses);
    }

    private static void printCourse(List<String> courses) {
        courses.stream()
                .forEach(System.out::println);
    }
}
