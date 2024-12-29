class Solution {
    public String reverseVowels(String s) {
        char[] str = s.toCharArray();
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int i = 0;
        int j = s.length() - 1;

        // Main loop to process the entire string
        while (i < j) {
            // Move `i` to the next vowel
            while (i < j && !vowels.contains(str[i])) {
                i++;
            }
            // Move `j` to the previous vowel
            while (i < j && !vowels.contains(str[j])) {
                j--;
            }

            // Swap the vowels if `i` and `j` are still valid
            if (i < j) {
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                i++;
                j--;
            }
        }

        return new String(str);
    }
}
