package programming;

import java.util.List;

public class FP2_printEvent {
    public static void main(String[] args) {
        printEven(List.of(1,2,3,4,5,6));
    }

    private static boolean isEven(int number){
        return number %2 == 0;
    }
    private static void printEven(List<Integer> numbers) {
        numbers.stream()
                .filter(FP2_printEvent::isEven)
                .forEach(System.out::println);
    }
}
