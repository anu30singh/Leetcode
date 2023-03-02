public class pivotIndex {
    public static int pivot (int []nums ) {
        int leftsum=0;
        int totalsum=0;
        int index=-1;
        for (int i=0; i<nums.length ; i++) {
            totalsum+= nums[i];
        }
        for (int i=0; i<nums.length ; i++) {
            totalsum = totalsum-nums[i];
            if (leftsum== totalsum) {
                index= i;
                break;

            } 
            leftsum+=nums[i];

        }
        if(index == -1) {
            return -1;
        }
        return index;

    }
    public static void main(String[] args) {
        int arr[] = { 7,2, 1,5,4};
        int ans = pivot(arr);
        System.out.println(ans);
    }
}
