class Solution {
    public boolean isPalindrome(String s) {
        char[] letters = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
        if(letters.length == 1 || letters.length == 0) return true;
        
        for(int i = 0; i <= letters.length / 2; i++) {
            if(letters[i] != letters[letters.length - 1 - i]) return false;
        }
        return true;
    }
}