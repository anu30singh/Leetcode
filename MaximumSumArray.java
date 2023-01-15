import java.util.Scanner;
public class MaximumSumArray{
//53Given an integer array nums, find the 
// subarray
// which has the largest sum and return its sum
    public static int Maxsubarray (int []nums) {
int sum=0;
int max= nums[0];
for (int i=0; i<nums.length ; i++) {
sum+=nums[i];
if (sum>max) max=sum;
if (sum<0) sum=0;
}
return max;
    }

public static void main (String [] args) {
Scanner s = new Scanner (System.in);
int arr [] = new int[6];
for (int i=0; i<6 ; i++) {
    arr[i]= s.nextInt();
}
int ans =Maxsubarray(arr);
System.out.println(ans);
}
}