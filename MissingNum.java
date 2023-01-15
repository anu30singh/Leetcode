import java.util.Scanner;
import java.util.HashSet;
class MissingNum {
public static int missnum(int nums[]) {
    HashSet <Integer> n = new HashSet <Integer>();
    for (int i : nums ) {
        n.add (i);
    }
    for (int i=0; i<=nums.length ; i++) {
        if (!n.contains(i)) {
            return i;
        }
    }
return -1;
}
public static void main (String []args) {
    int num [] = {3,0,1};
    
    int ans =missnum(num);
    System.out.println(ans);
}
}