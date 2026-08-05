class Solution {
    public int lengthOfLongestSubstring(String s) {
        String tempS = "", subS = "";
        int flag = 0;
        for (int i = 0; i < s.length(); i++) {
            if (tempS.contains(String.valueOf(s.charAt(i))) == false) {
                tempS = tempS + s.charAt(i);
            } else if (tempS.contains(String.valueOf(s.charAt(i)))) {
                flag = tempS.indexOf(s.charAt(i));
                if (tempS.length() > subS.length()) {
                    subS = tempS;
                }
                tempS = tempS.substring(flag + 1) + s.charAt(i);
            }
        }
        if (tempS.length() > subS.length()) {
            subS = tempS;
        }
        return subS.length();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] testCases = {
                "abcabcbb",
                "bbbbb",
                "pwwkew",
                "",
                " ",
                "au",
                "dvdf",
                "1R1T7",
                "eea",
                ""
        };

        for (String test : testCases) {
            int result = sol.lengthOfLongestSubstring(test);
            System.out.println("Input: \"" + test + "\" -> Length: " + result);
        }
    }
}