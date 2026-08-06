class Solution {

  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int mergedLen = 0;
    if (nums1.length > 0) {
      mergedLen = nums1.length % 2 == 0 ? mergedLen + 2 : mergedLen + 1;
    }
    if (nums2.length > 0) {
      mergedLen = nums2.length % 2 == 0 ? mergedLen + 2 : mergedLen + 1;
    }
    int[] merged = new int[mergedLen];
    double median = 0.00000;
    int tempIndex = 0;
    if (nums1.length > 1) {
      if (nums1.length % 2 == 0) {
        merged[0] = nums1[(nums1.length / 2) - 1];
        merged[1] = nums1[nums1.length / 2];
        tempIndex = 2;
      } else if (nums1.length % 2 != 0) {
        merged[0] = nums1[nums1.length / 2];
        tempIndex = 1;
      }
    } else if (nums1.length == 1) {
      merged[0] = nums1[0];
      tempIndex = 1;
    } else {
      tempIndex = 0;
    }

    if (nums2.length > 1) {
      if (nums2.length % 2 == 0) {
        merged[tempIndex] = nums2[(nums2.length / 2) - 1];
        tempIndex += 1;
        merged[tempIndex] = nums2[nums2.length / 2];
      } else if (nums2.length % 2 != 0) {
        merged[tempIndex] = nums2[nums2.length / 2];
      }
    } else if (nums2.length == 1) {
      merged[tempIndex] = nums2[0];
    }

    if (merged.length > 1) {
      // sort array
      for (int i = 0; i < merged.length - 1; i++) {
        if (merged[i] > merged[i + 1]) {
          int temp = merged[i];
          merged[i] = merged[i + 1];
          merged[i + 1] = temp;
        }
      }
      if (merged.length % 2 == 0) {
        median = (merged[(merged.length / 2) - 1] + merged[(merged.length / 2)]) / 2.0;
      } else if (merged.length % 2 != 0) {
        median = merged[(merged.length / 2)];
      }
    } else if (merged.length == 1) {
      median = merged[0];
    } else {
      median = 0;
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
