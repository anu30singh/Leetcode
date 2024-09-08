class Solution {
    public int minimumBuckets(String hamsters) {
        int buckets =0;
        int n = hamsters.length();
        char [] arr = hamsters.toCharArray();

        if (hamsters.equals("H")) return -1;


        for(int i=0; i<n; i++) {
            
            if(arr[i]== 'H') {
                 if(i< n-1 && arr[i+1]== '.') {
                    arr[i+1]= 'B';
                    buckets++;
                    i+=2;
                }
               
                else if( i>0 && arr[i-1] == '.' ) {
                    arr[i-1] = 'B';
                    buckets++;

                } 
                else return -1;
            }
        }
        return buckets;
        
    }
}