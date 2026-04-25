public class twinSum {
    public static class Node{
        int data ;
        Node next ;
        Node(int data){
            this.data=data;
        }
    }
    public static Node reverse (Node head){
        Node curr = head;
        Node agla = null;
        Node prev = null;
        while (curr.next!=null){
            agla = curr.next;
            curr.next= prev;
            prev = curr;
            curr = agla;
        }
        return prev;
    }
    public static int TwinSum(Node head){
        Node fast = head;
        Node slow = head;
        while (fast.next.next != null){
            slow= slow.next;
            fast = fast.next.next;
        }
        Node p1 = head;
        Node p2 = slow.next;
        Node temp = reverse(slow.next);
        int maxsum = 0;

        while (p2!=null){
            int sum = p1.data+p2.data;
            if(maxsum<sum){
                maxsum=sum;
                p1 = p1.next;
                p2=p2.next;
            }
        }
        return maxsum;
    }
    public static void main(String[] args){

    }
}
