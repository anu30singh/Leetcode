import java.util.Arrays;
public class maxproductofthreenums {
    public static int maxpro(int nums[]) {
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
    }
    public static void main(String [] args) {
        int nums [] = {1,8,9,4};
        int ans = maxpro(nums);
        System.out.println(ans);
    }
}
