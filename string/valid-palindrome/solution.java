class solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;

        }
        return true;

    }

    public static void main(String[] args) {

        solution sol = new solution();

        String[] testCases = {
                "A man, a plan, a canal: Panama",
                "race a car",
                " ",
                "madam",
                "hello",
                "No lemon, no melon",
                "Was it a car or a cat I saw?",
                "12321",
                "12345",
                "a",
                "",
                ".,!"
        };

        for (String test : testCases) {

            boolean result = sol.isPalindrome(test);

            System.out.println(
                    "Input: \"" + test + "\" -> " + result);
        }
    }

}