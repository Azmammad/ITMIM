package Task6_PrintMaxAndMinNumberStreamLambda;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class MaxAndMin {
    public static void main(String[] args) {
        //Ededlerin cemini,minimum ve maximum tapilmasi

        List<Integer> numbers = Arrays.asList(1,2,6,7,11,14,21);
        int sum = numbers.stream().reduce(0,(result,i)->result+i);
        Integer max = numbers.stream().reduce(Integer.MIN_VALUE,(first,second)->first>second?first:second);

        //mapToInt integer tipindeki deyeri int tipine cevirir
        int min = numbers.stream().mapToInt(Integer::intValue).min().orElseThrow();
        System.out.println("Sum = " + sum + "\nMax = " + max + "\nMin = " + min);

    }
}
