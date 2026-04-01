package Strings;

public class ReverseString {
    public static void main(String[] args){
        String s = "  1 4   7hgf   ";
        System.out.println(reverseString(s));
    }

    static String reverseString(String s){
        String s1 = s.trim();

        StringBuilder sb = new StringBuilder();
        int j;
        int i=s1.length()-1;
        while (i>=0){
            while(i>=0 && s1.charAt(i) == ' ') i--;

            j=i;

            while (j>=0 && s1.charAt(j) != ' ')j--;

            sb.append(s1, j+1, i+1);

            if(j>0) sb.append(' ');
            i = j-1;
        }
        return sb.toString();
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
