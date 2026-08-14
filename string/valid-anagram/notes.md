# Valid Anagram

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.
_An anagram is a word or phrase formed by rearranging the letters of another word or phrase, using all the original letters exactly once._

**Example 1:**

> Input: s = "anagram", t = "nagaram"  
> Output: true

**Example 2:**

> Input: s = "rat", t = "car"  
> Output: false

**Constraints:**

- `1 <= s.length, t.length <= 5 * 10^4`
- `s` and `t` consist of lowercase English letters.

**Follow up**: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

## Brainstorming

**Take 1:**

- Remove all spaces from both the strings and check if they are not of same length. If lenght isnt same, then return false and done
- If they are, create a hashmap
- Iterate through the first string and store each char with their frequency in the hashmap
- Iterate through the second string and if char at a position is present in the keys, then frequency-1
- If all the frequencies are zero, then they are anagrams or else not
