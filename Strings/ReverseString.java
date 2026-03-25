package Strings;

public class ReverseString {
    public static void main(String[] args){
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }

    static String reverseWords(String s) {
        StringBuilder sb =new StringBuilder();

        int right=s.length()-1;

        for (int left=s.length()-1; left>=0; left--){
            if(s.charAt(right) ==' '){
                right = left;
            }
            if(s.charAt(right) != ' ' && s.charAt(left)==' '){
                sb.append(s, left+1, right+1);
                sb.append(' ');
                right=left;
            }
            if(left==0){
                if(s.charAt(right) != ' ' && s.charAt(left)!=' '){
                    sb.append(s, left, right+1);
                    sb.append(' ');
                }
            }
        }
        sb.deleteCharAt(sb.length()-1);

        return sb.toString();
    }
}
