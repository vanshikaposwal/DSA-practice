package Strings;



public class DepthOfNestedParentheses {
    public static void main(String[] args){
        String s = "(())(()()(()))((((()))";
        System.out.println(maxDepth(s));
    }

    static int maxDepth(String s){
        if(s.length() == 1) return 0;

        int max = 0;
        int count = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                count++;
            }
            max = Math.max(max, count);
            if(s.charAt(i) == ')'){
                count--;
            }
        }


        return max;
    }

}
