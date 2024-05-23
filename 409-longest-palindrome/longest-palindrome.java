class Solution {
    public int longestPalindrome(String s) {
       int len =0; 
       HashSet<Character>hset = new HashSet<Character> ();
       for (int i=0; i<s.length(); i++) {
        char ch = s.charAt(i);
        if(hset.contains(ch)) {
            len+=2;
            hset.remove(ch);
        } else {
            hset.add(ch);
        }
       }
       if(hset.size()>0) {
        len++;
       } 
       return len;
    }
}