class Solution {
    public int[] sumZero(int n) {
        int ans[] = new int[n];
        int d = -(n/2);
        if(n%2 != 0) {
            for(int i=0; i<n; i++) {
                 ans[i]= d;
            d++;

            }
           
        } else {
            for(int i=0; i<n;i++) {
                if(d==0) {
                    d++;
                }
                ans[i] =d;
                d= d+1;
            }
        }
        return ans;

    }
}