import java.util.HashMap;

public class deepcopy_with_random {
    public static class Node {
        int data ;
        Node next ;
        Node random;
        Node(int data ){
            this.data = data;
        }
    }
    public static Node random(Node head){
        if (head == null) return null;

        HashMap<Node, Node> map = new HashMap<>();

        Node oldtemp = head;

        // STEP 1: Create copy nodes and store mapping
        while (oldtemp != null){
            Node copynode = new Node(oldtemp.data);
            map.put(oldtemp, copynode);   // ✅ correct mapping
            oldtemp = oldtemp.next;
        }

        oldtemp = head;

        // STEP 2: Set next and random pointers
        while (oldtemp != null){
            Node copynode = map.get(oldtemp);

            copynode.next = map.get(oldtemp.next);       // next set
            copynode.random = map.get(oldtemp.random);   // random set

            oldtemp = oldtemp.next;
        }

        return map.get(head);
    }
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            int rand = (temp.random != null) ? temp.random.data : -1;
            System.out.println("Data: " + temp.data + " | Random: " + rand);
            temp = temp.next;
        }
    }
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

        System.out.println(" ");
        Node copyHead = random(n1);
        printList(copyHead);
    }
}
