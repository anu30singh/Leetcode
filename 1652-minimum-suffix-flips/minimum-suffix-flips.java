class Solution {
    public int minFlips(String target) {
       int count=0; 
       char ch ='0';
       for(int i=0; i< target.length(); i++) {
        if(target.charAt(i)!=ch) {
            count++;
            ch = target.charAt(i);
            
        }
       }
       return count;
    }
}












// target = "10111"
//initial string given to us 
//we can flip the numbers after a index till end
//s = '00000'
// 
