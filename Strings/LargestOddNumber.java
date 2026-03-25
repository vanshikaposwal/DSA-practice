package Strings;

public class LargestOddNumber {
    public static void main(String[] args){
        String s = "000020014638";
        System.out.println(largestOddNumber2(s));
    }

    static String largestOddNumber(String num) {
        StringBuilder sb = new StringBuilder();

        int left=0, odd=-1;
        int zeros=0;

        for(int right=0; right<num.length(); right++){
            int number = num.charAt(right)-'0';
//            System.out.print(number+" ");
            if(number==0){
                zeros++;
//                System.out.print(zeros+" ");
            }
            if(zeros == right+1){

                left = right+1;

            }else if(number%2 != 0){
                odd = right;
                sb.append(num, left, odd+1);
                left=odd+1;
            }
//            System.out.print(left+" "+odd);
//            System.out.println(sb);

        }

        return sb.toString();
    }


    static String largestOddNumber2(String num) {
        StringBuilder sb = new StringBuilder();
        int zeros=0;

        for(int right=0; right<num.length(); right++) {
            int number = num.charAt(right) - '0';
//            System.out.print(number+" ");
            if (number != 0 ) {
                break;
//                System.out.print(zeros+" ");
            }
            zeros++;
        }

        for(int i=num.length()-1; i>=0; i--){
            if((num.charAt(i)-'0')%2 == 1){
                sb.append(num,zeros, i+1);
                break;
            }
        }

        return sb.toString();
    }

}
