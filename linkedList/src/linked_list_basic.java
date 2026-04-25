public class linked_list_basic {
    public static class Node{
        int data; // value
        Node next;// address

        Node(int data){
            this.data = data;
        }
    }
    // Display finction
    public static void Display(Node head){
        while(head != null){
            System.out.print(head.data + " ");
             head = head.next;
        }
    }
    // Display using recursion
    public static void print(Node head){
        if(head == null){
            return;
        }
        System.out.print(head.data + " ");
        print(head.next);
    }
    // find length of Linked list
    public static int length(Node head){
        int count = 0 ;
        while (head != null){
            count++;
            head = head.next;
        }
        return count;
    }

    public static void main(String[]args){
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(8);
        Node d = new Node(9);
        Node e = new Node(16);
        a.next = b; // linked  a ->
        b.next = c;
        c.next = d;
        d.next = e;
        // display linked list
        Display(a);
        System.out.println(" ");
        print(a);
        System.out.println();
        System.out.println(length(a));





    }
}
