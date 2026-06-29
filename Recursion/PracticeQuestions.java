package Recursion;

public class PracticeQuestions {

    static void main() {
        // factorial of n
        System.out.println(productofN_numbers(5));

        // Sum of numbers N to 1
        System.out.println(sumNto1(5));

        //Sum of digits of a numbers
        System.out.println(sumOfDigits(1342));

        //Product of digits of a numbers
        System.out.println(productOfDigits(4568));

        // Reverse  the number
        System.out.println(reverseTheNumber(123485));
    }

    static int productofN_numbers(int n){
        if(n==1){
            return 1;
        }
        return n*productofN_numbers(n-1);
    }

    static int sumNto1(int n){
        if(n==0){
            return 0;
        }
        return n+sumNto1(n-1);
    }

    static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        int digit = n%10;
        return digit+sumOfDigits(n/10);
    }

    static int productOfDigits(int n){

        if(n%10 == n){
            return n;
        }

        return (n%10) * productOfDigits(n/10);
    }

    static int countDigits(int n){
        if(n%10 == n){
            return 1;
        }
        return 1+countDigits(n/10);
    }

    static int reverseTheNumber(int n){
        int count = countDigits(n);
        if(count == 1){
            return n%10;
        }
        return (n%10) *Math.powExact(10,count-1) + reverseTheNumber(n/10);
    }

}