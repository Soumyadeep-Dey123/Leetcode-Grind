# Longest Substring Without Repeating Characters

Given a string `s`, find the length of the longest substring without duplicate characters.

**Example 1:**

> Input: s = "abcabcbb"
> Output: 3
> Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

**Example 2:**

> Input: s = "abcabcbb"
> Output: 3
> Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

**Example 3:**

> Input: s = "abcabcbb"
> Output: 3
> Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

**Constraints :**

- `0 <= s.length <= 10^5`
- `s` consists of English letters, digits, symbols and spaces.

## Brainstorming

- Start a loop, from 0 till length of string
- A var named `subS` to contain the final substring, and a var named `tempS` to contain temporary substring
- On every iteration, check if the charat that specific index is in tempS, if not then concat it
- If that charat is in tempS, then check if subS is greater than tempS or not. If it is, then `subS=tempS` and `tempS=""`
- Finally, return the length of subS
