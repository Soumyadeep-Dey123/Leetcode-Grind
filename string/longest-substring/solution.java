class Solution {
    public int lengthOfLongestSubstring(String s) {
        String tempS = "", subS = "";
        for (int i = 0; i < s.length(); i++) {
            System.out.println("Iterating : subS = " + subS + "; tempS = " + tempS);
            if (tempS.contains(String.valueOf(s.charAt(i))) == false) {
                tempS = tempS + s.charAt(i);
                System.out.println("Adding values to tempS: " + s.charAt(i));
            } else if (tempS.contains(String.valueOf(s.charAt(i)))) {
                if (tempS.length() > subS.length()) {
                    System.out.println("Copying tempS to subS");
                    subS = tempS;
                }
                System.out.println("Assigning empty str to tempS");
                tempS = String.valueOf(s.charAt(i));
            }
        }
        if (tempS.length() > subS.length()) {
            System.out.println("Assigning subS = tempS");
            subS = tempS;
        }
        System.out.println("Final Value of subS: " + subS);
        System.out.println("Final Value of tempS: " + tempS);
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
                "eea"
        };

        for (String test : testCases) {
            int result = sol.lengthOfLongestSubstring(test);
            System.out.println("#################################################");
            System.out.println("Input: \"" + test + "\" -> Length: " + result);
            System.out.println("#################################################");
        }
    }
}