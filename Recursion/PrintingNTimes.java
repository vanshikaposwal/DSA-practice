package Recursion;

public class PrintingNTimes {
    public static void main(String[] args) {
        // String str = "Vanshika";
        // String result = printName(str, 10);
        // System.out.println(result);

        // printNumbers(1,10);
        int result2 = printSum(3);
        System.out.println(result2);
    }

    static int printSum(int n){
        int sum =0;
        if(n==0){
            return sum;
        }else{
            sum  = n + printSum(--n);
            
        }
        return sum;
    }

    static void printNumbers(int n, int num){
        if(n > num){
            return;
        }else{
            System.out.println( n );
            printNumbers(++n,num);
        }
    }

    static String printName(String s, int n){
        String name = null;
        if(n == 1){
            return s;
        }else{
            name = s + n+"\n"+printName(s, n-1);
        }
        return name;
    }
}
