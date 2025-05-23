package code.ibs;

/**
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
 * or -1 if needle is not part of haystack.
 * Example 1:
     * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
     * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 */
public class IndexOfFirstOccurance {
    static int strStr(String haystack, String needle) {
        int needleLength = needle.length();
        for(int i = 0; i < haystack.length() - (needleLength - 1);  i++){
             String subStr =  haystack.substring(i, i + needleLength);
            if(subStr.equals(needle))
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.print(strStr("sdsubadtsad","sad"));

    }
}
