package Strings;

public class Palindrom {
    public static void main(String[] args){
        String str = "...,,,";
        boolean result = isPalindrome(str);
        System.out.println("Is the string a palindrome? " + result);
    }

    public static boolean isPalindrome(String s){
        int length = s.length();
        int left = 0, right = length-1;

        while(left<right){
            if(!Character.isLetterOrDigit(s.charAt(right))){
                right --;
            }
            else if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            else{
                if(s.charAt(right) != s.charAt(left)){
                    return false;
                }
                else{
                    right--;
                    left++;
                }
            }
        }

        return true;
    }

}
