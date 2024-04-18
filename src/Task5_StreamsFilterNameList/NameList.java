package Task5_StreamsFilterNameList;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameList {
    public static void main(String[] args) {
        //A herfi ile baslayan adlari basqa liste yigmaq
        List<String> names = Arrays.asList("Rauf", "Murad", "Azmammad", "Hesen", "Ayxan");
        List<String> filterList = names.stream().filter(name->name.startsWith("A")).collect(Collectors.toList());
        System.out.println(filterList);
    }
}
