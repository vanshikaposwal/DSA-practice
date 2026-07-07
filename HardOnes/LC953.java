package HardOnes;

public class LC953 {
    static void main() {
        String[] words = {"apple","app"};
        String order = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(isAlienSorted(words, order));
    }

    public static boolean isAlienSorted(String[] words, String order) {
        int[] orderArray = new int[256];
        for (int i = 0; i < order.length(); i++) {
            char ch = order.charAt(i);
            orderArray[ch-'a'] = i;
        }
        for (int i = 0; i < words.length-1; i++) {
            int j=0;
            char[] word1 = words[i].toCharArray();
            char[] word2 = words[i+1].toCharArray();

            while (j<Math.min(word2.length,word1.length)){

                char ch1 = word1[j];
                char  ch2 = word2[j];
                if(orderArray[ch1-'a']>orderArray[ch2-'a']){
                    return false;
                }else if(orderArray[ch1-'a']<orderArray[ch2-'a']) {
                    break;
                }

                j++;
            }
            if(j==word2.length && word1.length> word2.length){
                return false;
            }
        }
        return true;
    }

}
