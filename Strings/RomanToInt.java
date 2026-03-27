package Strings;

public class RomanToInt {
    public static void main(String[] args){
        String rom = "IX";
        System.out.println(convertToInteger( rom));
    }
    static int convertToInteger( String roman){
        int number =0, i=0;
        while (i<roman.length()){
            char ch = roman.charAt(i);
            char nextCh;
            if (i!=roman.length()-1) {
                nextCh = roman.charAt(i + 1);

                int result = specialCase(ch, nextCh);
                if (result != 0) {
                    number += result;
                    i+=2;
                    continue;
                }
            }

            if(ch=='I'){
                number+=1;
            }else if(ch =='V'){
                number+=5;
            }else if(ch =='X'){
                number+=10;
            }else if(ch =='L'){
                number+=50;
            }else if(ch =='C'){
                number+=100;
            }else if(ch =='D'){
                number+=500;
            }else if(ch =='M'){
                number+=1000;
            }
            i++;

        }
        return number;
    }

    static int specialCase(char ch, char nextCh){
        int result=0;
        if(ch=='I' ){
            if(nextCh=='V'){
                result  = 4;
            }else if(nextCh=='X'){
                result =9;
            }

        }else if(ch=='X' ){
            if(nextCh=='L'){
                result  = 40;
            }else if(nextCh=='C'){
                result =90;
            }

        }else if(ch=='C' ){
            if(nextCh=='D'){
                result  = 400;
            }else if(nextCh=='M'){
                result =900;
            }

        }
        return result;
    }
}
