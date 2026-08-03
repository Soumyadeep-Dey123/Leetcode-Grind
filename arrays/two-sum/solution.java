import java.util.Arrays;

class Solution {

  public int[] twoSum(int[] nums, int target) {
    int[] answer = { 0, 0 };
    for (int i = 0; i < nums.length; i++) {
      for (int j = nums.length - 1; j > i; j--) {
        if (nums[i] + nums[j] == target) {
          answer[0] = i;
          answer[1] = j;
        }
      }
    }
    return answer;
  }

  public void main(String[] args) {
    // Solution sol = new Solution();
    int[] arr = { 2, 7, 11, 15 };
    int[] result = twoSum(arr, 9);
    System.out.println(Arrays.toString(result));
  }

}
