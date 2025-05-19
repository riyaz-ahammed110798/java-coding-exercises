package code.ibs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Sort a List of Strings Using Java Streams
 */
public class SortStream {
    static List<String> sortList(List<String> list){
        return list.stream()
                .sorted(Comparator.comparing(str -> str.length()))
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc", "zxyz", "qwerty", "ax", "a");
        System.out.println(sortList(list).toString());

    }
}
