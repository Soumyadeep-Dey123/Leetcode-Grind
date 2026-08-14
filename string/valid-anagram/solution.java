import java.util.*;

class solution {
    public boolean isAnagram(String s, String t) {
        s = s.replace(" ", "");
        t = t.replace(" ", "");
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> charFrequency = new HashMap<>();
        // Iterating over s
        for (int i = 0; i < s.length(); i++) {
            charFrequency.merge(s.charAt(i), 1, Integer::sum);
        }

        // Iterating over t
        for (int i = 0; i < t.length(); i++) {
            charFrequency.merge(t.charAt(i), -1, Integer::sum);
        }

        // Checking if all the values are zero or not
        boolean allZero = charFrequency.values().stream().allMatch(v -> v == 0);
        return allZero;
    }

    public static void main(String[] args) {
        solution sol = new solution();

        String[][] testCases = {
                { "listen", "silent" },
                { "hello", "world" },
                { "anagram", "nagaram" },
                { "rat", "car" },
                { "a gentleman", "elegant man" }
        };

        for (String[] testCase : testCases) {
            String s = testCase[0];
            String t = testCase[1];
            boolean result = sol.isAnagram(s, t);
            System.out.println("s=\"" + s + "\", t=\"" + t + "\" -> isAnagram: " + result);
        }
    }
}