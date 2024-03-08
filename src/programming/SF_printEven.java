package programming;

import java.util.List;

public class SF_printEven {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        printeven(numbers);
    }

    private static void printeven(List<Integer> numbers) {
        for(int num:numbers){
            if(num %2 == 0)
                System.out.println(num);
        }
    }
}
