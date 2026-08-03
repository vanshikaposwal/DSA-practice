package Strings;

public class LC1678 {
    public String interpret(String command) {

        StringBuilder ans = new StringBuilder();
        StringBuilder current = new StringBuilder();
        for(char ch:command.toCharArray()){
            if(ch == 'G'){
                ans.append("G");
                current.delete(0,current.length());
            }else{
                current.append(ch);
                if(current.toString().equals("()")){
                    ans.append("o");
                    current.delete(0,current.length());
                }else if(current.toString().equals("(al)")){
                    ans.append("al");
                    current.delete(0,current.length());
                }
            }
        }
        return ans.toString();
    }
}
