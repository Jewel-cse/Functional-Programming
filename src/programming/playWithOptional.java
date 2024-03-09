package programming;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class playWithOptional {
    public static void main(String[] args) {
        List<String> courses = List.of("spring", "spring boot", "api", "Microservice", "AWS");
        Predicate<? super String> predicate = course -> course.startsWith("a");

        Optional<String> optional = courses.stream()
                .filter(predicate)
                .findFirst();

        System.out.println(optional.isEmpty());
        System.out.println(optional.isPresent());
        System.out.println(optional.get());
        System.out.println(optional.getClass());

        Optional<String>  course = Optional.of("OS");
        Optional<String>  empty = Optional.empty();
        System.out.println(course);
        System.out.println(empty);
    }
}
