import java.util.*;

class solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> matchFound = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int difference = target - numbers[i];
            if (matchFound.containsKey(difference)) {
                return new int[] { matchFound.get(difference), i + 1 };
            }
            matchFound.put(numbers[i], i + 1);
        }
        return new int[] {};

    }

    public static void main(String[] args) {

        solution sol = new solution();

        // Test Case 1
        int[] numbers1 = { 2, 7, 11, 15 };
        int target1 = 9;

        int[] result1 = sol.twoSum(numbers1, target1);

        System.out.println(
                "Test Case 1: " + Arrays.toString(result1));

        // Test Case 2
        int[] numbers2 = { 3, 2, 4 };
        int target2 = 6;

        int[] result2 = sol.twoSum(numbers2, target2);

        System.out.println(
                "Test Case 2: " + Arrays.toString(result2));

        // Test Case 3
        int[] numbers3 = { 3, 3 };
        int target3 = 6;

        int[] result3 = sol.twoSum(numbers3, target3);

        System.out.println(
                "Test Case 3: " + Arrays.toString(result3));

        // Test Case 4 - No solution
        int[] numbers4 = { 1, 2, 3, 4 };
        int target4 = 10;

        int[] result4 = sol.twoSum(numbers4, target4);

        System.out.println(
                "Test Case 4: " + Arrays.toString(result4));

        // Test Case 5
        int[] numbers5 = { 1, 5, 8, 12, 20 };
        int target5 = 13;

        int[] result5 = sol.twoSum(numbers5, target5);

        System.out.println(
                "Test Case 5: " + Arrays.toString(result5));
    }
}