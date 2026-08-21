# Optimised solution by claude

- Hashmap is datastructure which stores data in a key-value pair
- run a loop through the array
- on every iteration, store `target - nums[i]` in complement, and check if it exists in the hashmap(which it wont in the first few iterations)
- if it doesnt, store the element and the index
- if it does then return the value of the key holding the element(ie, its index) along with the index of the current element
