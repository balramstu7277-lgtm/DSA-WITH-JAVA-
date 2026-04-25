public class RemovingNthNode {
    public static Node removeNode(Node head , int val){
        Node first = head;
        Node slow = head;
        for(int i = 1 ; i<= val; i++){
            first = first.next;
        }
        if(first == null){
            head = head.next;
            return head;
        }
        while(first.next != null){
            slow = slow.next;
            first = first.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static class Node{
        int data ;
        Node next ;
        Node(int data){
            this.data = data;
        }
    }
    public static void Display(Node head){
        Node temp = head ;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println( );
    }
    public static void main(String[] args){
        RemovingNthNode.Node a = new Node(100);
        RemovingNthNode.Node b = new Node(13);
        RemovingNthNode.Node c = new Node(10);
        RemovingNthNode.Node d = new Node(12);
        RemovingNthNode.Node e = new Node(16);
        RemovingNthNode.Node f = new Node(19);
        RemovingNthNode.Node g = new Node(20);
        RemovingNthNode.Node h = new Node(21);
        a.next =b;
        b.next = c;
        c.next = d;
        d.next = e ;
        e.next = f;
        f.next =g;
        g.next = h;
        Display(a);
        a = removeNode(a,8   );
        Display(a);

    }
}
