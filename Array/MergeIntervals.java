package Array;

import java.util.Arrays;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr= {{1,4},{2,5},{6,9},{7,11},{10,14},{15,18}};
        System.out.println(Arrays.deepToString(merge(arr))); 
    }

    public static int[][] merge(int[][] intervals) {
        int[][] result = new int[intervals.length][2];
        int row=0,i=0;
        int start=0, end =0;
        while(row < intervals.length){
            System.out.println("Row to interval"+row);
            start = intervals[row][0];
            System.out.println(start);
            if(row<intervals.length-1 && intervals[row][1] < intervals[row+1][0]){
                end = intervals[row][1];
            }
            else{
                while( row<intervals.length-1 && intervals[row][1]>=intervals[row+1][0] ){
                row++;
                end = Math.max(end,intervals[row][1]);
            }
            
            }
            end = Math.max(end,intervals[row][1]);
            System.out.println("end Row for end interval"+row);
            System.out.println(end);
            result[i][0] = start;
            result[i][1] = end;
            System.out.println(Arrays.deepToString(result));
            i++;
            row++;
        }
        return result;
    }
}
