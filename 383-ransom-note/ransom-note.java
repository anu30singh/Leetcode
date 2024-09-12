class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
       HashMap <Character , Integer> map2 = new HashMap<>();
       for(char c : magazine.toCharArray() ) {
         map2.put(c, map2.getOrDefault(c,0)+1);
       }

       for(char c : ransomNote.toCharArray()) {
        if(!map2.containsKey(c) || map2.get(c)==0) return false;
        map2.put(c, map2.get(c)-1);
       }
       return true;


    
    }
}