public class DeepCopy {

    public static class Node {
        int data;
        Node next;
        Node random;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node DeepcopyRandom(Node head){
        if (head == null) return null;

        Node temp1 = head;

        // STEP 1: Insert copy nodes
        while (temp1 != null) {
            Node copy = new Node(temp1.data);
            copy.next = temp1.next;
            temp1.next = copy;
            temp1 = copy.next;
        }

        // STEP 2: Set random pointers
        temp1 = head;
        while (temp1 != null) {
            if (temp1.random != null) {
                temp1.next.random = temp1.random.next;
            }
            temp1 = temp1.next.next;
        }

        // STEP 3: Separate lists
        Node dummy = new Node(-1);
        Node temp2 = dummy;
        temp1 = head;

        while (temp1 != null) {
            Node copy = temp1.next;

            temp2.next = copy;
            temp2 = copy;

            temp1.next = copy.next;
            temp1 = temp1.next;
        }

        return dummy.next;
    }

    // 🔥 PRINT FUNCTION
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            int rand = (temp.random != null) ? temp.random.data : -1;
            System.out.println("Data: " + temp.data + " | Random: " + rand);
            temp = temp.next;
        }
    }

    // 🔥 MAIN FUNCTION
    public static void main(String[] args) {

        // Create original list
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2;
        n2.next = n3;

        // Set random pointers
        n1.random = n3; // 1 → 3
        n2.random = n1; // 2 → 1
        n3.random = n2; // 3 → 2

        System.out.println("Original List:");
        printList(n1);

        // Deep copy
        Node copyHead = DeepcopyRandom(n1);

        System.out.println("\nCopied List:");
        printList(copyHead);
    }
}