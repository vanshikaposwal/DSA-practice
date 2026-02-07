package Strings;

public class Modifies {
    public static void main(String[] args) {
        System.out.println(modify(123411223377744L));
    }

    public static long modify(long N) {
        // code here
        long modified =0L,place=1L;
        long preDigit =0, currDigit =0;
        long m =N;
        while(m>0){
            currDigit = m%10;
            if(currDigit!=preDigit){
                modified = currDigit*place +modified;
                place *= 10;
            }
            preDigit = currDigit;
            m=m/10;
        }
        return modified;
    }
}
