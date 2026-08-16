# Group Anagrams

Given an array of strings `strs`, group the anagrams together. You can return the answer in `any order`.

**Example 1:**

> Input: strs = ["eat","tea","tan","ate","nat","bat"]  
> Output: [["bat"],["nat","tan"],["ate","eat","tea"]]  
> **Explanation:**
>
> - There is no string in strs that can be rearranged to form `"bat"`.
> - The strings `"nat"` and `"tan"` are anagrams as they can be rearranged to form each other.
> - The strings `"ate"`, `"eat"`, and `"tea"` are anagrams as they can be rearranged to form each other.

**Example 2:**

> Input: strs = [""]  
> Output: [[""]]

**Example 3:**

> Input: strs = ["a"]  
> Output: [["a"]]

**Constraints:**

- `1 <= strs.length <= 10^4`
- `0 <= strs[i].length <= 100`
- `strs[i]` consists of lowercase English letters.

## Brainstorming

- We already know what an anagram is, its two words, which have the same set of letters, which may or may not be in ordered fashion. Eg: pat, tap
- If i sort the characters of a string, and store the sorted string as key of a hashmap, and the original word in the value..... on the next iteration, i can check if the sorted value of the next word is also present in the key
- If present, ill add it in the array, if not, ill create another set of key value pair, with the sorted value as the key and original value as the first element of the array
- At last, all i have to do, is to make a list of all the array values and return it

## Approach

- Create a hashmap with key:string, value:array(or list) of strings
- Create a function to sort string values
- On every iteration, check if the sorted value of that string exist as a key.
- If it doesnt, create a new key with the original text as the value's array element
- If it does exist, append the original string to the array
- Finally, create a list of all the list of strings and return it
