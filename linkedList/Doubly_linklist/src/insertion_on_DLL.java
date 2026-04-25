import com.sun.source.tree.WhileLoopTree;

public class insertion_on_DLL {
    public static class Node{
        int data ;
        Node next ;
        Node prev ;
        Node(int data){
            this.data = data ;
        }
    }
    // insertation at head
    public static Node insetionAt_head(Node head , int data ){
        Node t = new Node(data);
        t.next = head;
        head.prev = t;
        head = t;
        return  head ;
    }
    // insertation at tail
    public static Node InsertaionAt_tail(Node head, int data){
        Node z = new Node(data);
        Node temp = head ;
        while (temp.next!= null){
            temp = temp.next;

        }
        temp.next = z;
        z.prev = temp;
        return head;
    }
    public static Node insertAtAnyIndex(Node head, int index, int data) {
        Node n = new Node(data);

        if (index == 0 || head == null) {
            n.next = head;
            if (head != null) head.prev = n;
            return n;
        }

        Node t = head;
        for (int i = 0; i < index - 1 && t.next != null; i++) {
            t = t.next;
        }

        n.next = t.next;
        if (t.next != null) t.next.prev = n;

        t.next = n;
        n.prev = t;

        return head;
    }
    public static Void Display(Node head){
        Node temp = head;
        while (temp!= null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        return null;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(6);
        a.prev =null;
        a.next = b;
        b.prev = a;
        b.next =c;
        c.prev = b;
        c.next= d;
        d.prev = c;
        d.next= e;
        e.prev = d;
        e.next= null;
        Node newHead = insetionAt_head(a,30);
        Display(newHead);
        System.out.println(" ");
        Node newTail  = InsertaionAt_tail(a, 20);
        Display(newTail);
        System.out.println("  ");
        Node any_index = insertAtAnyIndex(a, 3, 50);
        Display(any_index);
    }
}
