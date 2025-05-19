package code.ibs;

public class ReverseString {

    /**
     * Reverse a String Without Using Library Methods
     * @param str
     * @return
     */
    static StringBuilder reversal(String str){
        StringBuilder builder = new StringBuilder();
        for (int i = str.length() - 1 ; i >= 0; i--){
            builder.append(str.charAt(i));
        }
        return builder;
    }
    public static void main(String[] args) {
        System.out.println(reversal("riyaz"));
    }
}
