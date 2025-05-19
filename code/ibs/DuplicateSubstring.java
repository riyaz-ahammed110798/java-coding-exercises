package code.ibs;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a sentence as a string, write a Java method that removes all duplicate words, keeping only their first occurrence.
 * The remaining words should retain their original order from the input.
 */
public class DuplicateSubstring {
    static String duplicateSubstring(String str){
        String[] splitArray = str.split(" ");
        Set<String> removedDuplicated = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        for(String duplicate : splitArray){
            if(!removedDuplicated.contains(duplicate)){
                removedDuplicated.add(duplicate);
                stringBuilder.append(duplicate).append(" ");
            }
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        String input = "I love Java because Java is powerful and I love coding";
        System.out.println(duplicateSubstring(input));
    }
}
