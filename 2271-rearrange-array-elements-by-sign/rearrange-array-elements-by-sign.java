class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList <Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            ans.add(0); 
        }
        int pos =0;
        int neg =1;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]>0) {
                ans.set(pos , nums[i]);
                pos+=2;

            } else {
                ans.set(neg , nums[i]);
                neg+=2;
            }
        }
       int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i); 
        }
        return result;
    }
}