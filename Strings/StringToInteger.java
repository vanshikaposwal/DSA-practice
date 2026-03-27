package Strings;

public class StringToInteger {
    public static void main(String[] args){
        String s = "-91283472332";
        System.out.println(myAtoi(s));
    }

    static int myAtoi(String s){
        int i=0;
        int number = 0;
        int sign =1;
        while( i<s.length() && s.charAt(i)==' ') i++;
        if(s.charAt(i)=='+' || s.charAt(i)=='-'){
            sign = s.charAt(i)=='-'? -1:1;
            i++;
        }

        while(i<s.length() && Character.isDigit(s.charAt(i))){

            number = number*10 + s.charAt(i)-'0';

            System.out.println(number);
            System.out.println(Integer.MAX_VALUE);
            System.out.println(Integer.MIN_VALUE);

            if((sign *number) <= Integer.MIN_VALUE){
                System.out.println("hi");
                return Integer.MIN_VALUE;
            }else if((sign*number)>= Integer.MAX_VALUE){
                System.out.println("hi");
                return Integer.MAX_VALUE;
            }
            i++;
        }
        return sign*number;
    }
}
