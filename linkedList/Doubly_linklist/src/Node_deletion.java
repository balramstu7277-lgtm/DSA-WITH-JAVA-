import javax.management.NotificationEmitter;

public class Node_deletion {
    public static class Node {
        int data ;
        Node next;
        Node prev ;
        Node(int data){
            this.data = data;
        }
    }
    public static Node headDelete(Node head){
        head = head.next;
        head.prev = null;
        return  head;
    }
    public static Node delete_tail(Node head){
        Node temp = head;
        while (temp.next != null){
            temp= temp.next;
        }
        temp= temp.prev;
        temp.next = null;
        return  head ;
    }
    public static Node delet_any_index(Node head , int index){
        if(index == 0){
            if(head != null) head = head.next;
            if(head != null) head.prev = null;
            return head;
        }
        Node temp = head;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
             temp = temp.next;
        }
        if(temp.next != null){
            temp.next = temp.next.next;

            if(temp.next != null){
                temp.next.prev = temp;
            }
        }
        return  head ;
    }
    public static void Display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[]args){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;

        Node any = delet_any_index(a, 3);
        Display(any);
        Node head = a;
        head = headDelete(head);
        System.out.println();
        Display(head);

        head = delete_tail(head);
        System.out.println();
        Display(head);





    }
}
