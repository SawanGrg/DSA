package org.example;

public class MergeTwoList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
            next = null;
        }

        ListNode(int value) {
            val = value;
            next = null;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode(); // Dummy head for the merged list
        ListNode current = dummyHead; // Pointer to construct the new list

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1; // Link to the smaller node
                list1 = list1.next; // Move to the next node in list1
            } else {
                current.next = list2; // Link to the smaller node
                list2 = list2.next; // Move to the next node in list2
            }
            current = current.next; // Move the current pointer forward
        }

        // If any nodes are left in either list, link them
        if (list1 != null) {
            current.next = list1; // Link remaining nodes of list1
        } else {
            current.next = list2; // Link remaining nodes of list2
        }

        return dummyHead.next; // Return the merged list starting after the dummy head
    }

    public static void main(String[] args) {
        MergeTwoList mergeTwoList = new MergeTwoList();

        ListNode firstList = new ListNode(1, new ListNode(3, new ListNode(5)));
        ListNode secondList = new ListNode(1, new ListNode(2, new ListNode(6)));

        ListNode mergedList = mergeTwoList.mergeTwoLists(firstList, secondList);
        printList(mergedList);
    }

    // Helper method to print the linked list
    private static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}
