# Two Sum II - Input Array Is Sorted

Given a **1-indexed** array of integers `numbers` that is already **_sorted in non-decreasing order_**, find two numbers such that they add up to a specific `target` number. Let these two numbers be `numbers[index1]` and `numbers[index2]` where `1 <= index1 < index2 <= numbers.length`.

Return _the indices of the two numbers `index1` and `index2`, each incremented by one, as an integer array `[index1, index2]` of length 2_.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.

**Example 1:**

> Input: numbers = [2,7,11,15], target = 9  
> Output: [1,2]  
> Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].

**Example 2:**

> Input: numbers = [2,3,4], target = 6
> Output: [1,3]
> Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].

**Example 3:**

> Input: numbers = [-1,0], target = -1  
> Output: [1,2]  
> Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].

**Constraints:**

- `2 <= numbers.length <= 3 * 10^4`
- `-1000 <= numbers[i] <= 1000`
- `numbers` is sorted in **non-decreasing order**.
- `-1000 <= target <= 1000`
- The tests are generated such that there is **exactly one solution**.

## Brainstorming

- create a hashmap, with integer and integer.
- loop through the array
- on every iteration, subtract the value of that index from target and see if it exists in the hashmap or not as a key
- if it doesnt (which it wont in the first iteration), store the value of that index as key and the index+1 as the value in the hashmap
- if it does exist, return an int array with the value of that element(which is basically its index+1) and the index+1 of the current value (ik, confusing, lets try it)
