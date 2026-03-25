package Strings;

public class RemoveOuterMostParantheses {
    public static void main(String[] args){
        String s = "()(()()(()))(())";
        System.out.println(removeOuterParentheses(s));
    }

    static String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int left=0;
        int count=0;

        for(int right=0; right<s.length(); right++){

            // for "("
            if(s.charAt(right) == '('){
                count++;
            }else if(s.charAt(right) == ')'){
                count--;
            }
            if (count==0) {
                sb.append(s, left + 1, right);
                System.out.println(sb);
                left = right + 1;

            }
        }
        return sb.toString();
    }
}
