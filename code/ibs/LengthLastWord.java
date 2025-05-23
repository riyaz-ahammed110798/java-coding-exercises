package code.ibs;

/**
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * A word is a maximal substring consisting of non-space characters only.
 */
public class LengthLastWord {
    static int lengthOfLastWord(String s) {
        String[] words = s.trim().split("\\s+");
        return words[words.length - 1].length();
    }
    public static void main(String[] args) {
        System.out.print(lengthOfLastWord("   fly me   to   the moon  "));
    }
}
