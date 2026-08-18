public class solution {
    public boolean isValid(String s) {
        int prevLength;

        do {
            prevLength = s.length();
            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
        } while (s.length() != prevLength);

        return s.isEmpty();
    }

    public static void main(String[] args) {

        solution sol = new solution();

        String[] testCases = {
                "()",
                "()[]{}",
                "(]",
                "([)]",
                "{[]}",
                "",
                "((()))",
                "([{}])",
                "((()",
                "[]{}()",
                "[(])",
                "{{{{}}}}",
                "([]{})"
        };

        for (String test : testCases) {
            boolean result = sol.isValid(test);

            System.out.println(
                    "Input: \"" + test + "\" -> " + result);
        }
    }
}
