package HardOnes;

public class LC1014 {
    static void main() {
        int[] arr = {1,0,0,0,1,0,1};
        System.out.println(maxDistToClosest(arr));
    }

//    public int maxScoreSightseeingPair(int[] A) {
//        int len  = A.length;
//        int ans = 0;
//        for (int i = 0; i < len-1; i++) {
//            for (int j = i+1; j < len; j++) {
//                int cal = A[i]+A[j]+i-j;
//                ans = Math.max(ans,cal);
//            }
//        }
//        return ans;
//    }

    public static int maxDistToClosest(int[] seats) {
        int index = 0, maximum = 0;
        int distance = 0;
        for(int i=0; i<seats.length; i++){
            distance++;
            if(distance > maximum){
                maximum = distance;
            }
            if(seats[i] == 1){
                if(distance > maximum){
                    maximum = (maximum+1)/2;
                }
                distance = 0;
            }
        }
        return maximum;
    }
}
