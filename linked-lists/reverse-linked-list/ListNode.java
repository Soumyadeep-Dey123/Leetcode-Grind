/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class solution {
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

    public ListNode reverseList(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = dummy.next;
            dummy.next = curr;
            curr = next;
        }

        return dummy.next;

    }

    public static void main(String[] args) {

        solution sol = new solution();

        // Test Case 1: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head1 = sol.new ListNode(
                1,
                sol.new ListNode(
                        2,
                        sol.new ListNode(
                                3,
                                sol.new ListNode(
                                        4,
                                        sol.new ListNode(5)))));

        ListNode result1 = sol.reverseList(head1);

        System.out.print("Test Case 1: ");
        printList(result1);

        // Test Case 2: 1 -> 2
        ListNode head2 = sol.new ListNode(
                1,
                sol.new ListNode(2));

        ListNode result2 = sol.reverseList(head2);

        System.out.print("Test Case 2: ");
        printList(result2);

        // Test Case 3: Single node
        ListNode head3 = sol.new ListNode(1);

        ListNode result3 = sol.reverseList(head3);

        System.out.print("Test Case 3: ");
        printList(result3);

        // Test Case 4: Empty list
        ListNode head4 = null;

        ListNode result4 = sol.reverseList(head4);

        System.out.print("Test Case 4: ");
        printList(result4);
    }

    public static void printList(ListNode head) {

        if (head == null) {
            System.out.println("Empty list");
            return;
        }

        ListNode curr = head;

        while (curr != null) {
            System.out.print(curr.val);

            if (curr.next != null) {
                System.out.print(" -> ");
            }

            curr = curr.next;
        }

        System.out.println();
    }
}