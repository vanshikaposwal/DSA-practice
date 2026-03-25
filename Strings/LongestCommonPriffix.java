package Strings;

public class LongestCommonPriffix {
    public static void main(String[] args){
        String[] arr = {""};
        System.out.println(longestCommonPrefix(arr));
    }

    static String longestCommonPrefix(String[] strs) {
        String priffix;
        if(strs.length ==1){
            return strs[0];
        }
        priffix = commonPrefix(strs[0], strs[1]);

        if(strs.length > 2){
            int i = 2;

            while (i < strs.length) {
//            System.out.println(priffix);
                priffix = commonPrefix(priffix, strs[i]);
                if (priffix.isEmpty()) {
                    return "";
                }
                i++;
            }
        }

        return priffix;
    }

    static String commonPrefix(String str1, String str2){
        String str="";
        int index=0;
        for(int i=0; i<Math.min(str1.length(),str2.length()); i++){
//            System.out.println(str1.charAt(i) +"  "+ str2.charAt(i));
            index=i;
            if(str1.charAt(i) != str2.charAt(i)){
                index=i-1;
                break;
            }
        }
        return str = str1.substring(0,index+1);
    }

}
