package Day_26;

import java.util.Scanner;

public class Leetcode876 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter node values:");

        ListNode head = null;
        ListNode tail = null;

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            ListNode newNode = new ListNode(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        ListNode middle = middleNode(head);

        System.out.print("Middle node onwards: ");

        while (middle != null) {
            System.out.print(middle.val + " ");
            middle = middle.next;
        }

        sc.close();
    }
}
