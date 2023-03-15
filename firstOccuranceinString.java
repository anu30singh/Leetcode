public class firstOccuranceinString {
    public static int strStr(String haystack , String needle) {
        return haystack.indexOf(needle);
        
    }
    public static void main(String[] args) {
        String haystack = "Anushka is a frontend developer";
        String needle = "Anu";
        System.out.println(strStr(haystack, needle));
    }
}
