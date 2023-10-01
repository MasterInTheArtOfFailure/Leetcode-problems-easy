class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if (s.length() == 1) {
            return false;
        }
        for (int i = 1; i <= s.length() / 2; i++) {
            if (s.length() % i == 0) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < s.length() / i; j++) {
                    sb.append(s.substring(0, i));
                }
                if (sb.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }
}