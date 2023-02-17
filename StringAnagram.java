//Given two strings s and t, return true if t is an anagram of s, and false otherwise.

//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all
// the original letters exactly once.  
import java.util.Arrays;
public class StringAnagram {
    public static String sortS (String str) {
        char c [] = str.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
    public static boolean checkAnagram (String s , String t) {
        s = sortS(s);
        t= sortS(t);
        if (s.length()!= t.length()) {
            return false;
        }
        for (int i=0 ; i< s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) return false;
        }
        return true;
    }
     public static void main(String[] args) {
        String s = "ABCDE";
        String t = "EDCBA";
        System.out.println(checkAnagram(s, t));
    }
}