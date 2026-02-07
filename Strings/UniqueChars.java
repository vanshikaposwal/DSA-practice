package Strings;

public class UniqueChars {
    public static void main(String[] args) {
        System.out.println(uncommonChars("gled","jdhf"));
    }

    static String uncommonChars(String s1, String s2) {
        // code here
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(int ch : s1.toCharArray()){
            arr1[ch-'a']++;
        }

        for(int ch : s2.toCharArray()){
            arr2[ch-'a']++;
        }

        StringBuilder sb =new StringBuilder();
        for(int i=0; i<26 ; i++){
            if((arr1[i] == 0 && arr2[i]>=1) || (arr2[i] == 0 && arr1[i]>=1)){
                sb.append((char)(i+'a'));
            }
        }
        return sb.toString();
    }
}
