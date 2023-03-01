public class MoveZeros {

    public static void MoveZero(int nums[]) {
        int n = nums.length;
        int insertpos=0;
        for (int i=0; i<n; i++) {
         if (nums[i] != 0) {
            nums[insertpos] = nums[i];
            insertpos++;
         }

        }
        while (insertpos < n) {
            nums[insertpos] =0;
            insertpos++;
        }
        
        
    }
    
}
