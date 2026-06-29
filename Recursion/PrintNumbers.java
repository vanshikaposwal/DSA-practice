package Recursion;

public class PrintNumbers {
    public static void main() {
        printNto1(5);
        print1toN(5);
    }

    static void printNto1(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        printNto1(n-1);
    }

    static void print1toN(int n){
        if(n<1){
            return;
        }
        print1toN(n-1);
        System.out.println(n);
    }

}
