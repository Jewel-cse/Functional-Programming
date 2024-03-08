package programming;

import java.util.List;

public class printList {
    public static void main(String[] args) {
        printElement(List.of(1,2,3,3,4,5));
    }

    //structure way
    private static void printElement(List<Integer> numbers) {
        for(int element:numbers)
            System.out.println(element);
    }
}
