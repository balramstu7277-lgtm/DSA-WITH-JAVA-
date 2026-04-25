public class ReverseLinklist {
    static class Node {
        int data ;
        Node next ;
        Node(int data){
            this.data = data ;
        }
    }
    public static Node revrese_using_3pointer(Node head){
        Node agla = null;
        Node prev = null;
        Node curr = head;
        while (curr !=null){
            agla = curr.next;
            curr.next= prev;
            prev=curr;
            curr = agla;
        }
        return prev;
    }
    //reverse function using recursion
    public static Node reverse(Node head){
        if(head.next==null){
            return head;
        }
        Node newHead = reverse(head.next);
        head.next.next= head; // inter changing the connection 1<-2
        head.next=null;
        return  newHead;
    }
    public static void Display(Node head){
        if(head== null){
            return;
        }
        System.out.print(head.data + "->");
        Display(head.next);
    }
    public static void RevDisplay(Node head){
        if(head== null){
            return;
        }
        RevDisplay(head.next);
        System.out.print(head.data + "->");

    }
    public static void main(String[] args){
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(2);
        Node e = new Node(4);
        a.next= b;
        b.next= c;
        c.next=d;
        d.next=e;
        e.next = null;

        Display(a);
        System.out.println("");
        //RevDisplay(a);
        Node r = reverse(a);
        Display(r);
        Node i = revrese_using_3pointer(a);
        Display(i);


    }
}
