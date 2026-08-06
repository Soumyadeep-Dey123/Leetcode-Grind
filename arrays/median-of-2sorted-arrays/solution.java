class Solution {

  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    double med1 = 0, med2 = 0;
    double median = 0.00000;
    int len_nums1 = nums1.length;
    int len_nums2 = nums2.length;

    // Calculating median of nums1
    if (len_nums1 % 2 == 0 && len_nums1 > 1) {
      med1 = (nums1[(len_nums1 / 2) - 1] + nums1[len_nums1 / 2]) / 2.0;
    } else if (len_nums1 % 2 != 0 && len_nums1 > 1) {
      med1 = nums1[len_nums1 / 2];
    } else if (len_nums1 == 1) {
      med1 = nums1[0];
    } else if (len_nums1 < 1) {
      med1 = 0;
    }

    // Calculating median of nums2
    if (len_nums2 % 2 == 0 && len_nums2 > 1) {
      med2 = (nums2[(len_nums2 / 2) - 1] + nums2[len_nums2 / 2]) / 2.0;
    } else if (len_nums2 % 2 != 0 && len_nums2 > 1) {
      med2 = nums2[len_nums2 / 2];
    } else if (len_nums2 == 1) {
      med2 = nums2[0];
    } else if (len_nums2 < 1) {
      med2 = 0;
    }

    if (med1 == 0) {
      median = med2;
    } else if (med2 == 0) {
      median = med1;
    } else {
      median = (med1 + med2) / 2.00000;
    }
    return median;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();

    int[][] test1 = { { 1, 3 }, { 2 } };
    int[][] test2 = { { 1, 2 }, { 3, 4 } };
    int[][] test3 = { { 0, 0 }, { 0, 0 } };
    int[][] test4 = { {}, { 1 } };
    int[][] test5 = { { 2 }, {} };
    int[][] test6 = { { 1, 3, 5 }, { 2, 4, 6 } };
    int[][] test7 = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 } };

    runTest(solution, test1[0], test1[1], "Test 1");
    runTest(solution, test2[0], test2[1], "Test 2");
    runTest(solution, test3[0], test3[1], "Test 3");
    runTest(solution, test4[0], test4[1], "Test 4");
    runTest(solution, test5[0], test5[1], "Test 5");
    runTest(solution, test6[0], test6[1], "Test 6");
    runTest(solution, test7[0], test7[1], "Test 7");
  }

  private static void runTest(Solution solution, int[] nums1, int[] nums2, String label) {
    double result = solution.findMedianSortedArrays(nums1, nums2);
    System.out.println(label + ": nums1=" + java.util.Arrays.toString(nums1)
        + ", nums2=" + java.util.Arrays.toString(nums2)
        + " -> median=" + result);
  }
}
