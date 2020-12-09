package FibonacciSeries;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {

    public static void main(String[] args) {
        System.out.println(noRecursion(10));
    }

    public static List<Integer> noRecursion(Integer limit) {
        List<Integer> result = new ArrayList<>();
        Integer n = 0;
        for (int i = 0; i < limit; i++) {
            result.add(i + n);
            n = i;
        }
        return result;
    }
}
