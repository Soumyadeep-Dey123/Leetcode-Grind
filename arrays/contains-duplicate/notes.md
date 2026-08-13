# Contains Duplicate

Given an integer array `nums`, return `true` if any value appears at least twice in the array, and return `false` if every element is distinct.

**Example 1:**

> Input: nums = [1,2,3,1]  
> Output: true  
> Explanation:  
> The element 1 occurs at the indices 0 and 3.

**Example 2:**

> Input: nums = [1,2,3,4]  
> Output: false  
> Explanation:  
> All elements are distinct.

**Example 3:**

> Input: nums = [1,1,1,3,3,4,3,2,4,2]  
> Output: true

**Constraints:**

- `1 <= nums.length <= 10^5`
- `-10^9 <= nums[i] <= 10^9`

## Brainstorming

**Take 1:**

- HASHTABLE!
- Iterate through the array
- On every iteration, check if the element exists in the hashtable
- If it doesnt, add it to the hashtable and keep on iterating. If it does, program returns true and breaks out
