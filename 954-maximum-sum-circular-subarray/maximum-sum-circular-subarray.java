class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int curmax =0;
        int curmin =0;
        int maxsum = nums[0];
        int minsum = nums[0];
        int totalsum = 0;

        for(int num : nums) {
            curmax = Math.max(curmax ,0)+num;
            maxsum = Math.max(maxsum , curmax);

            curmin = Math.min(curmin ,0)+num;
            minsum = Math.min(minsum , curmin);
            totalsum += num;
        }
        if(totalsum == minsum) return maxsum;

        return Math.max(maxsum , totalsum- minsum);

    }
}