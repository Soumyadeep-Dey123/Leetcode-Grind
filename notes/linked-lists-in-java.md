- In java, there are no concept of explicit pointer to be used by devs. There are only references, which refer to the adress of the next node(or simply put object)
- It is just, like most things, just classes and objects in java. A blueprint structure has to be created of a linked list, which is basically a class, and then using that, objects are to be created which then can be used to implement the functionality of linked lists

## Syntax

```java
public class ListNode {
    int val;
    ListNode next; // declares a slot that holds a reference to a ListNode object

    ListNode(int val, ListNode next) { this.val = val; this.next = next; } //constructor in the class
}
```

---

### Java program to accpet 5 numbers from user and store them in linked lists

```java
import java.util.Scanner;

public class LinkedListDemo {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) { this.val = val; }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = scanner.nextInt();

            tail.next = new ListNode(num);
            tail = tail.next;
        }

        ListNode head = dummy.next;

        System.out.print("Linked list: ");
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }

        scanner.close();
    }
}
```
