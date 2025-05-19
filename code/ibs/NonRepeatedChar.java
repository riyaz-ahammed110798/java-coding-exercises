package code.ibs;

import java.util.HashMap;
import java.util.Map;

/**
 * Find the First Non-Repeated Character in a String
 *
 */
public class NonRepeatedChar {
    static char nonRepeated(String str){
        HashMap<Character, Integer> map =  new HashMap<>();
        for(char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1)
                return entry.getKey();
        }
        return '!';
    }
    public static void main(String[] args) {
        String str = "aabbccdd";
        System.out.println(nonRepeated(str));
    }
}
