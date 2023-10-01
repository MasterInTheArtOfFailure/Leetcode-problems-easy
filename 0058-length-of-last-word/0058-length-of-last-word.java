class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.trim().replaceAll(" +", " ").split(" ");
        return arr[arr.length - 1].length();
    }
}