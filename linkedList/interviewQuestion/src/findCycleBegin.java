public class findCycleBegin {
    static class Node {
        int data ;
        Node next ;
        Node(int data){
            this.data = data;
        }
    }
    public static Node NodeBegin(Node head){
        Node fast = head;
        Node slow = head ;
        while (fast != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast ==slow){
                break;
            }
        }
        Node temp  = head ;
        while (temp != slow){
            temp = temp.next;
            slow = slow.next;

        }
        return slow;
    }
    public static void main(String [] args){
        Node a = new Node(3);
        Node b = new Node(2);
        Node c = new Node(0);
        Node d = new Node(-4);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b;

        Node result = NodeBegin(a);
        System.out.println(result.data);









    }
}
