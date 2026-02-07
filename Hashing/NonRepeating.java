package Hashing;

import java.util.HashMap;
import java.util.Map;

public class NonRepeating {
    public static void main(String[] args) {
        String str = "aagttjijea";
        System.out.println(firstNonRepeatingChar(str));
    }

    public static char firstNonRepeatingChar(String str){
        char result = '.';
        HashMap<Character,Integer> map = new HashMap<>();

        // iterate
        for(int i=0; i<str.length(); i++){
            // if char exist count increases else set default as 1
            map.put(str.charAt(i) , map.getOrDefault(str.charAt(i),0)+1);
        }
        int count;
        for(Map.Entry<Character,Integer> e: map.entrySet()){
            result = e.getKey();
            count = e.getValue();
            if(count == 1){
                break;
            }
        }

        return result;
    }
}
