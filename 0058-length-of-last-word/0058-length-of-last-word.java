class Solution {
    public int lengthOfLastWord(String s) {
        String trimmed = s.trim();
        if (!trimmed.contains(" ")) {
            return trimmed.length();
        }
        int len = 0;
        int index = trimmed.length() - 1;
        while (trimmed.charAt(index) != ' ' && index > 0) {
            len++;
            index--;
        }
        return len;
    }
}