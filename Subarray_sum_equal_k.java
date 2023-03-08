//Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.


public class Subarray_sum_equal_k {
    public static int subarraySum(int nums[] , int k) {
        int n = nums.length;
       
        int count =0;
        for (int i=0; i <n ; i++) {
            int sum=0;
            for (int j=i ; j< n ; j++ ) {
                sum+= nums[j]; 
               
            if (sum==k) count++;

            }
            

        }
        return count;

    }
    public static void main(String[] args) {
        int nums [] = {12, 3, 6,7,8,9};
        int k = 9;
        System.out.println(subarraySum(nums, k));
    }
}
