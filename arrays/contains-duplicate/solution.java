import java.util.HashSet;

class solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> uniqueVals = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!uniqueVals.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        solution sol = new solution();

        int[] test1 = { 1, 2, 3, 1 };
        int[] test2 = { 1, 2, 3, 4 };
        int[] test3 = {};

        System.out.println("test1 -> " + sol.containsDuplicate(test1)); // true
        System.out.println("test2 -> " + sol.containsDuplicate(test2)); // false
        System.out.println("test3 -> " + sol.containsDuplicate(test3)); // false
    }
}
