# Median of Two Sorted Arrays

Given two sorted arrays `nums1` and `nums2` of size `m` and `n` respectively, return the median of the two sorted arrays.
The overall run time complexity should be `O(log (m+n))`.

**Example 1:**

> Input: nums1 = [1,3], nums2 = [2]
> Output: 2.00000
> Explanation: merged array = [1,2,3] and median is 2.

**Example 2:**

> Input: nums1 = [1,2], nums2 = [3,4]
> Output: 2.50000
> Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

**Constraints:**

- `nums1.length == m`
- `nums2.length == n`
- `0 <= m <= 1000`
- `0 <= n <= 1000`
- `1 <= m + n <= 2000`
- `-10^6 <= nums1[i], nums2[i] <= 10^6`

## Brainstorming

- Median is basically the value at the middle most position of the array
- If there are odd number of elements in an array, there will only be one middle most element. If there are even number of elements, there will be 2 and the average of the two have to calculated
- In order to calculate the median, first, find median of array 1, and then find median of array 2 and then calcualte the average

## Approach

- Find the length of both arrays
- If the length is even, then find the average of elements at (length/2) and (length/2)+1 position
- If the length is odd, find the value of (length/2)+1 element
- Take these two values and find their average and thats the median

## Test case failure

- `nums1 = [2,2,4,4]`, `nums1 = [2,2,4,4]`, `output: 2.50000`, `expected: 2.00000`
