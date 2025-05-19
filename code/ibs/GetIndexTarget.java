package code.ibs;


import java.util.Arrays;

/**
 * Given a string input and a target string target,
 * write a Java method that returns all starting indices where a permutation of target appears as a contiguous substring in input.
 */
public class GetIndexTarget {
    static void findPermutation(String str, String target){
        int targetLen = target.length();
        char[] targertChar =  target.toCharArray();
        java.util.Arrays.sort(targertChar);
        for(int i = 0; i < str.length() - (targetLen - 1); i++){
            char[] combo = str.substring(i, i + targetLen).toCharArray();
            java.util.Arrays.sort(combo);
            if(Arrays.equals(combo, targertChar)){
                System.out.println(i  + " ");
            }
        }
    }

    public static void main(String[] args) {
        String input = "xyzabbcrtyuiobcabcbbabbacb";
        String target = "abcb";
        findPermutation(input, target);
    }

}
