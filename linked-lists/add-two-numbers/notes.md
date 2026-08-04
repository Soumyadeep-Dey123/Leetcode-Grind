# Problem : Add two numbers

You are given two **non-empty** linked lists representing two non-negative integers. The digits are stored in **reverse order**, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

**Example 1:**
![Linked List image](./addtwonumber1.jpg)

> Input: l1 = [2,4,3], l2 = [5,6,4]
> Output: [7,0,8]
> Explanation: 342 + 465 = 807.

**Example 2:**

> Input: l1 = [0], l2 = [0]
> Output: [0]

**Example 3:**

> Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
> Output: [8,9,9,9,0,0,0,1]

**Constraints:**

- The number of nodes in each linked list is in the range `[1, 100]`.
- `0 <= Node.val <= 9`
- It is guaranteed that the list represents a number that does not have leading zeros.

---

## Brainstorming

- All values in the nodes need to be single digit
- While traversing the two linked lists and adding in the values, one var named `carry`, will be the resultant of (num1+num2)/10. So, if the resultant is 12, then carry will contain 1
- And for safety purposes, lets go with `resultant=(num1+num2)%10`. In case there is a number exceeding 9, then dividing it by 10 will give us the one's digit value.

## Approach

- First check which is the larger in length, l1 or l2, traverse accordingly
- Put up a checker for when the smaller list runs out of value, to add 0 to it
- Add all the values together, if there is nothing to carry, 0 will be added anyways
- Carry should be a global variable, so that its scope never creates issue
- Go to the next of the resultant linked list, and the other two arrays as well
- If, after looping through, carry contains any value bigger than 0, create a new node to add the value

> this was a tricky one, so many things to take care of, plus then there is java restrictions
