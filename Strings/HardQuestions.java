package Strings;

public class HardQuestions {

    public static void main(String[] args){
        System.out.println(processStr("w%",3));
    }

    public static char processStr(String s, long k) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='*'){
                sb.deleteCharAt(sb.length()-1);
            }else if(ch=='#'){
                String copy = sb.toString();// coverted to string to prevent from self loop
                sb.append(copy);
            }else if(ch=='%'){
                String reversed = new StringBuilder(sb).reverse().toString();// created new sb and then reversed
                sb.append(reversed);
            }else{
                sb.append(ch);
            }
            System.out.println(sb);
        }
        if(k>=0 && k<sb.length()){
            return sb.charAt((int)k);
        }
        return '.';
    }

    public String restoreString(String s, int[] indices) {
        char[] chars = new char[s.length()];

        for(int i=0; i<s.length(); i++){
            chars[indices[i]] = s.charAt(i);
        }

        StringBuilder sb = new StringBuilder();

        for(char ch:chars){
            sb.append(ch);
        }
        return sb.toString();
    }
}
