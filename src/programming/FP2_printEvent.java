package programming;

import java.util.List;

public class FP2_printEvent {

    public static final List<Integer> NUMBERS = List.of(1, 2, 3, 4, 5, 6);

    public static void main(String[] args) {
        //printEven(NUMBERS);
        printEvenSquare(NUMBERS);
    }

    private static void printEvenSquare(List<Integer> numbers) {
        numbers.stream()
                .filter(num ->num%2 == 0)
                .map(num ->num*num)
                .forEach(System.out::println);
    }

    private static void printEven(List<Integer> numbers) {
        numbers.stream()
                .filter(n -> n%2 == 0)   //lambda expression
                .forEach(System.out::println);
    }
}
