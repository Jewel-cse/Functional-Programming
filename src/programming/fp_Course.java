package programming;

import java.util.List;

public class fp_Course {
    public static void main(String[] args) {
        List<String> courses = List.of("spring", "spring boot", "api", "Microservice", "AWS");
        //printCourse(courses);
        printCouseFourLetters(courses);
    }

    private static void printCouseFourLetters(List<String> courses) {
        courses.stream()
                .filter(course ->course.length()>= 4)
                .forEach(System.out::println);
    }

    private static void printCourse(List<String> courses) {
        courses.stream()
                .filter(course -> course.contains("spring"))
                .forEach(System.out::println);
    }
}
