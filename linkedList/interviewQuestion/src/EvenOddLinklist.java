import javax.lang.model.element.NestingKind;
import javax.management.NotificationEmitter;

// leetcode 328
public class EvenOddLinklist {
    public static class Node{
        int data ;
        Node next ;
        Node(int data ){
            this.data = data;
        }
    }
    public static Node EvenOddLinklist(Node head){
        Node odd = new Node(0);
        Node even = new Node(0);
        Node tempo = odd;
        Node tempe = even ;
        Node temp = head ;
        while (temp!=null){
            tempo.next = temp;
            temp = temp.next;
            tempo= tempo.next;

            tempe.next = temp;
            if(temp== null){
              break;
            }
            temp=temp.next;
            tempe = tempe.next;
        }
        odd = odd.next;
        even= even.next;
        tempo.next=even;
        tempe.next = null;

        return odd;
    }
    public static void Display(Node head){
        Node temp = head;
        while (temp!= null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public static  void main(String []args){
        Node a = new Node(10);
        Node b = new Node(11);
        Node c = new Node(1);
        Node d = new Node(4);
        Node e = new Node(6);
        Node f = new Node(5);
        a.next= b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=null;
        Node ans =  EvenOddLinklist(a);
        Display(ans);


    }
}
