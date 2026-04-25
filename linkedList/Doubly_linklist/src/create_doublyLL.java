import com.sun.source.tree.WhileLoopTree;

public class create_doublyLL {
    public static class Node {
        int data;
        Node  next ;
        Node prev;
        Node(int data){
            this.data= data;
        }
    }
    public static Void Display(Node head){
        Node temp = head;
        while (temp!= null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        return null;
    }
    public static Void Displayrev(Node tail){
        Node temp = tail;
        while (temp!= null){
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        return null;
    }
    public static Void Display2(Node random){
        Node temp = random;
        // move this temp backword to the head
        while (temp.prev!= null){
            temp = temp.prev;
        }
        System.out.println(" ");
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
        Node d =  new Node(4);
        Node e = new Node(5);
        a.next= b;
        b.prev = a;
        b.next =c;
        c.prev = b;
        c.next= d;
        d.prev = c;
        d.next= e;
        e.prev = d;
        e.next= null;
        Displayrev(e);
        Display2(c);
    }
}
