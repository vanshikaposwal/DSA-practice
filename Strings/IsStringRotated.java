package Strings;

public class IsStringRotated {
    public static void main(String[] args){
        String s1 = "hello";
        String s2 = "lohelx";
        System.out.println(rotateString(s1,s2));
    }

    static boolean rotateString(String s, String goal){
        if(s.length() != goal.length()){
            return false;
        }

        if(s.equals(goal)){
            return true;
        }



        int rotations=1;
        while(rotations < s.length()+1){
            StringBuilder s1 = new StringBuilder();
            s1.append(s,0,rotations);
            System.out.print(s1+"    ");
            StringBuilder sb = new StringBuilder();
            sb.append(s, rotations,s.length());
            sb.append(s1);
            System.out.println(sb);
            if((sb.toString()).equals(goal)){
                return true;
            }

            rotations++;

        }

        return false;
    }

    static boolean rotateString2(String s, String goal) {
        return s.length()==goal.length()&&(s+s).contains(goal);
    }

}
