import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] nums1={1,4,6,7,0,0,0,0,0};
        int m = 4;
        int[] nums2 = {1,2,3,4,5};
        int n = nums2.length;

        int k = m+n-1;
        int i=m-1,j=n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>=nums2[j]){
                nums1[k--] = nums1[i--];
            }
            else{
                nums1[k--] = nums2[j--];
            }
        }

        while(j>=0){
            nums1[k--] = nums2[j--];
        }
            
        System.out.println(Arrays.toString(nums1));

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = m+n;
        int[] nums = new int[length];
        int k =-1;
        int i=0,j=0;
        while(i<m && j<n){
            while(i<m && nums1[i]<nums2[j]){
                nums[++k] = nums1[i++];
            }
            while(j<n && nums2[j]<nums1[i]){
                nums[++k] = nums2[j++];
            }
        }
    }
}
