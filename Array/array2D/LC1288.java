package Array.array2D;

import java.util.*;

public class LC1288 {

    public int removeCoveredIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a,b)-> {
            if(a[0] == b[0]){
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });

        List<Integer> start = new ArrayList<>();
        List<Integer> end = new ArrayList<>();

        for (int[] interval : intervals) {
            start.add(interval[0]);
            end.add(interval[1]);
        }

        int i=0;
        while ( i < start.size()-1) {
            if (Objects.equals(start.get(i), start.get(i + 1))){
                start.remove(i);
                end.remove(i);
            }else{
                if (end.get(i)>end.get(i+1)){
                    start.remove(i+1);
                    end.remove(i+1);
                }else{
                    i++;
                }
            }
        }
        return start.size();
    }
}
