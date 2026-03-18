import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        String str = "sadbutstdadaccefsadcefsadcefsadefop";
        String pattern = "sadcefsadef";
        System.out.println(strStr(str, pattern));
    }
    public static int strStr(String haystack, String needle) {

        // first find LSP

        int[] lsp = new int[needle.length()];
        lsp[0] = 0;
        int left =0;
        for(int right=1; right<needle.length(); right++ ){
            if(needle.charAt(right) == needle.charAt(left)){
                left++;
                lsp[right] = left;
            }else if(needle.charAt(right) != needle.charAt(left)){
                if(left!=0){
                    left = lsp[left-1];
                }
            }else{
                lsp[right] = left;
            }
        }
        System.out.println(Arrays.toString(lsp));

        // ocurances of patterns in string
        int[] arr = new int[haystack.length()];
        int j=0, i=0;
        while( i<arr.length){
            if(j == needle.length()){
                j=0;
            }
            if(needle.charAt(j) == haystack.charAt(i)){
                arr[i] = j;
                j++;
                i++;
            }else if(needle.charAt(j) != haystack.charAt(i)){
                if(j!=0){
                    j = lsp[j-1];
                }else{
                    i++;
                }
            }else{
                arr[i] = j;
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));

        // find first occurance of pattern
        int l = needle.length()-1;// last index 0f pattern
        boolean flag = false;

        for(int k=0; k<arr.length; k++){
            if(arr[k] == l){ // check whether last index of pattern occur in arr(string) or not
                l = k;
                flag = true;
                break;
            }
        }
        System.out.println(l);
        int result =-1;
        if(flag){
            result =  l-(lsp.length)+1; // index of pattern's first char
        }

        return result;
    }
}
