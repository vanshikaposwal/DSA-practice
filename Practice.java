public class Practice {
    public static void main(String[] args) {
        int n=5;
        char ch;
        for(int i=1; i<n; i++){
            for(int j=1; j<(n-i);j++ ){
                System.out.print(" ");
            }
            ch ='A';
            for(int j=0; j<i; j++){
                System.out.print(ch);
                ch++;
            }
            ch--;
            for(int k=i-1; k >0; k--){
                ch--;
                System.out.print(ch);
                
            }
            System.out.println();
        }
            System.out.println();
            System.out.println();
            System.out.println();

            for(int i=1; i<=n; i++){
                for(int j=1; j<2*n; j++){
                    if(j<=i||j>=2*n-i){
                        System.out.print(n+1-j);
                    }else{
                        System.out.print(n+1-i);
                    }
                }
                System.out.println();
            }

        
    }
}
