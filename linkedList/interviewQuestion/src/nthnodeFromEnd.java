public class nthnodeFromEnd {
   public static Node nthnode(Node head, int n){
       int size = 0 ;
       Node temp = head;
       while (temp != null){
           size++;
           temp = temp.next;
       }
       int m = size - n +1;
       // Mth node from start;
       temp = head;
        for(int i = 1 ; i<=m-1;i++){
            temp = temp.next;
        }
        return temp;
   }
   // second approch only one traversal;
    public static Node FindNode(Node head , int n){
       Node fast = head;
       Node slow = head;
       for(int i = 0 ; i<n ; i++){
           fast = fast.next;
       }
       while (fast!= null){
           slow = slow.next;
           fast = fast.next;
       }
       return slow;
    }

    public static class Node{
        int data ;
        Node next ;
        Node(int data){
            this.data = data;
        }
    }
    static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(10);
        Node d = new Node(12);
        Node e = new Node(16);
        Node f = new Node(19);
        Node g = new Node(20);
        Node h = new Node(21);
         a.next =b;
         b.next = c;
         c.next = d;
         d.next = e ;
         e.next = f;
         f.next =g;
         g.next = h;
        Node temp = nthnode(a,3);
        System.out.println(temp.data);
        Node temp1 = FindNode(a, 3);
        System.out.println(temp1.data);

    }
}
