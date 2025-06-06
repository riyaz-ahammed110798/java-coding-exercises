package code.ibs;

/**
 * Given two binary strings a and b, return their sum as a binary string.
 * Example 1:
     * Input: a = "11", b = "1"
     * Output: "100"
 * Example 2:
     * Input: a = "1010", b = "1011"
     * Output: "10101"
 */
public class AddBInary {
    public static String addBinary(String a, String b) {
        int maxLength = Math.max(a.length(), b.length()) + 1;
        char[] result = new char[maxLength];
        int i = a.length() - 1, j = b.length() - 1, k = maxLength - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int bitA = (i >= 0) ? a.charAt(i--) - '0' : 0;
            int bitB = (j >= 0) ? b.charAt(j--) - '0' : 0;

            int sum = bitA + bitB + carry;
            result[k--] = (char) ((sum % 2) + '0');
            carry = sum / 2;
        }
        return new String(result, k + 1, maxLength - k - 1);
    }

    public static void main(String[] args) {
        System.out.print(addBinary("1010", "1011"));
    }
}

