/**
 * 
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
  public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int count1 = 0;
    ListNode temp1 = l1;
    while (temp1 != null) {
      count1++;
      temp1 = temp1.next;
    }

    int count2 = 0;
    ListNode temp2 = l2;
    while (temp2 != null) {
      count2++;
      temp2 = temp2.next;
    }

    ListNode result = new ListNode(0);
    ListNode copyResult = result;
    int carry = 0;
    ListNode trav1 = l1;
    ListNode trav2 = l2;

    if (count1 > count2 || count1 == count2) {

      for (int i = 0; i < count1; i++) {
        System.out.println("When i = " + i);
        int trav2Val = trav2 != null ? trav2.val : 0;
        System.out.println("trav1.val = " + trav1.val + ", trav2Val = " + trav2Val + ", carry = " + carry);
        int res = trav1.val + trav2Val + carry;
        System.out.println("res = " + res);
        carry = res / 10;
        res = res % 10;
        copyResult.next = new ListNode(res);
        copyResult = copyResult.next;
        trav1 = trav1.next;
        if (trav2 != null) {
          trav2 = trav2.next;
        }
      }
      if (carry > 0) {
        copyResult.next = new ListNode(carry);
      }
    } else if (count2 > count1) {

      for (int i = 0; i < count2; i++) {
        System.out.println("When i = " + i);
        int trav1Val = trav1 != null ? trav1.val : 0;
        System.out.println("trav1Val = " + trav1Val + ", trav2.val = " + trav2.val + ", carry = " + carry);
        int res = trav1Val + trav2.val + carry;
        System.out.println("res = " + res);
        carry = res / 10;
        res = res % 10;
        copyResult.next = new ListNode(res);
        copyResult = copyResult.next;
        if (trav1 != null) {
          trav1 = trav1.next;
        }
        trav2 = trav2.next;
      }
      if (carry > 0) {
        copyResult.next = new ListNode(carry);
      }
    }

    ListNode head = result.next;
    System.out.print("Linked list: ");
    ListNode current = head;

    while (current != null) {
      System.out.print(current.val);
      if (current.next != null) {
        System.out.print(",");
      }
      current = current.next;
    }

    return head;

  }

  public void main(String[] args) {
    // Build l1 = 2 -> 4 -> 3 (represents 342)
    ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));

    // Build l2 = 5 -> 6 -> 4 (represents 465)
    ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

    Solution sol = new Solution();
    ListNode result = sol.addTwoNumbers(l1, l2);

    // (your addTwoNumbers already prints the list internally,
    // but if you remove that later, you can print it here instead)
    System.out.println(result);
  }
}
