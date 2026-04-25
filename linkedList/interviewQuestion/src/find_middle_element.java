public class find_middle_element {
    static class Node {
        int data ;
        Node next ;
        Node( int data){
            this.data = data;
        }
    }
    public static Node middle_ele(Node head){
        Node first = head;
        Node slow = head;
        while (first.next.next != null && first != null){
            first = first.next.next;
            slow = slow.next;
        }
        return slow;
    }

    static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
       // Node g = new Node(20);
       // Node h = new Node(21);
        a.next =b;
        b.next = c;
        c.next = d;
        d.next = e ;
        e.next = f;
       // f.next =g;
       // g.next = h;
        Node temp = middle_ele(a);
        System.out.println(temp.data);

    }
}
