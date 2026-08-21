import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class solutionClaude {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                return new int[] { seen.get(complement), i };
            }
            seen.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution");
    }

    public void main(String[] args) {
        // Solution sol = new Solution();
        int[] arr = { 2, 5, 9, 7 };
        int[] result = twoSum(arr, 9);
        System.out.println(Arrays.toString(result));
    }
}
