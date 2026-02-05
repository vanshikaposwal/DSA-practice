package Recursion;

public class Fibpnacci {
    public static void main(String[] args) {
        int result = fib(8);
        System.out.println(result);
    }

    static int fib(int n){
        if(n == 0 ){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
}
