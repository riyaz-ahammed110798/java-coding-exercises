package code.ibs;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 */
public class ParenthesesMatch {
    static boolean isValid(String s) {
        if(s.isEmpty() || s.length() == 1)
            return false;
        Stack<Character> parentheses =  new Stack<>();
        Map<Character, Character> paraMap = Map.of('}','{',']','[',')','(');
        for(char ch : s.toCharArray()){
            if(paraMap.containsValue(ch))
                parentheses.push(ch);
            else if (paraMap.containsKey(ch) && (parentheses.isEmpty() || !Objects.equals(parentheses.pop(), paraMap.get(ch))))
                return false;
        }
        return parentheses.isEmpty();
    }

    public static void main(String[] args) {
        String para = "({}[]{{{}[]}}())";
        System.out.print(isValid(para));
    }
}
