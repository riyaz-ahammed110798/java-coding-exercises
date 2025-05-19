package code.ibs;


/**
 * Check if a String is a Palindrome
 * Check if a int is a Palindrome
 */


public class Palindrome {
    static Boolean palindrome(String str){
        int i = 0, j = str.length() - 1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j))
                return false;
            i++; j--;
        }
        return true;
    }
    static Boolean palindrome(int x){
        int temp = 0,
            last = 0,
            org = x;
        if(x < 0)
            return false;
        while (x != 0) {
            temp =  x % 10;
            last = (last * 10) + temp;
            x = x / 10;
        }
        return org == last;
    }
    public static void main(String[] args) {
        String input = "riyaz";
        int inpt = 21;
        System.out.println(palindrome(inpt));
    }
}
