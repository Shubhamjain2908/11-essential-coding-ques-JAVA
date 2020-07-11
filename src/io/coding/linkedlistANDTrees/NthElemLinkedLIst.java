package io.coding.linkedlistANDTrees;

public class NthElemLinkedLIst {
    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        Node current = new Node(1, null);
        for (int i = 2; i < 8; i++) {
            current = new Node(i, current);
        }
        Node head = current;
        // head = 7 -> 6 -> 5 -> 4 -> 3 -> 2 -> 1 -> (null)

        Node current2 = new Node(4, null);
        for (int i = 3; i > 0; i--) {
            current2 = new Node(i, current2);
        }
        Node head2 = current2;
        // head2 = 1 -> 2 -> 3 -> 4 -> (null)

        System.out.println(nthFromLast(head, 1)); //  should return 1.
        System.out.println(nthFromLast(head, 5)); //  should return 5.
        System.out.println(nthFromLast(head2, 2)); //  should return 3.
        System.out.println(nthFromLast(head2, 4)); //  should return 1.
        System.out.println(nthFromLast(head2, 5)); //  should return null.
        System.out.println(nthFromLast(null, 1)); //  should return null.
    }


    // Implement your function below.
    public static Node nthFromLast(Node head, int n) {
        Node slow = head;
        Node fast = head;
        // First, make sure that we have at least n items in the linked list.
        for (int i = 0; i < n; i++) {
            if (fast == null) return null;
            fast = fast.child;
        }
        while (fast != null) {
            fast = fast.child;
            slow = slow.child;
        }
        return slow;
    }


    //  NOTE: Feel free to use the following function for testing.
    //  It converts the given linked list into an easy-to-read string format.
    //  Example: 7 -> 6 -> 5 -> 4 -> 3 -> 2 -> 1 -> (null)
    public static String linkedListToString(Node head) {
        Node current = head;
        StringBuilder sb = new StringBuilder();
        while (current != null) {
            sb.append(String.valueOf(current.value));
            sb.append(" -> ");
            current = current.child;
        }
        sb.append("(null)");
        return sb.toString();
    }
}
 class Node {
    int value;
    Node child;

    Node(int value, Node child) {
        this.value = value;
        this.child = child;
    }

    // The string representation of this node.
    // Will be used for testing.
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
