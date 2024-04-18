package Task8_EvenNumberFilterInList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> oddnumbers1 = numbers.stream().filter(n->n%2!=0).limit(2).collect(Collectors.toList());
        int count =0;
        for (Integer num:numbers){
            if (num%2!=0){
                count++;
                    oddNumbers.add(num);
            }
            else if(count==2){
                break;
            }
        }
        for (Integer odd:oddnumbers1){
            System.out.println(odd);
        }
    }
}
