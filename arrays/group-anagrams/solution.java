import java.util.*;

class Solution {
    private String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            String key = sortString(s);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Solution solver = new Solution();

        String[] input1 = { "eat", "tea", "tan", "ate", "nat", "bat" };
        String[] input2 = { "" };
        String[] input3 = { "a" };
        String[] input4 = { "abc", "def", "ghi" };
        String[] input5 = { "listen", "silent", "enlist", "tinsel" };

        System.out.println("Test 1: " + solver.groupAnagrams(input1));
        System.out.println("Test 2: " + solver.groupAnagrams(input2));
        System.out.println("Test 3: " + solver.groupAnagrams(input3));
        System.out.println("Test 4: " + solver.groupAnagrams(input4));
        System.out.println("Test 5: " + solver.groupAnagrams(input5));

    }

}