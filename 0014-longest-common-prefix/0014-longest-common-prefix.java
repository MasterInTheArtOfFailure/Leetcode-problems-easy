class Solution {
    public String longestCommonPrefix(String[] strs) {
	
	String lo = Collections.min(Arrays.asList(strs));
	String hi = Collections.max(Arrays.asList(strs));
	StringBuilder sb = new StringBuilder();
	
	for (int i = 0; i < lo.length() && lo.charAt(i) == hi.charAt(i); i++) {
		sb.append(lo.charAt(i));
	}
	
	return sb.toString();
    }
}