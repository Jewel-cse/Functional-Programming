package programming;

import java.util.List;

public class fp_printOdd {
    public static void main(String[] args) {
        printEven(List.of(1,2,3,4,5,6));
    }

    private static void printEven(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number %2 == 1)
                .forEach(System.out::println);
    }
}
