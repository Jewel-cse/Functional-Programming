package programming;

import java.util.List;

public class FP1_printList {
    public static void main(String[] args) {
        printListElement(List.of(1,2,3,4,5));
    }

    //Functional programming
    //what to do
    //function reference  apply
    private static void printListElement(List<Integer> numbers) {
        numbers.stream().forEach(System.out::println);
    }
}
