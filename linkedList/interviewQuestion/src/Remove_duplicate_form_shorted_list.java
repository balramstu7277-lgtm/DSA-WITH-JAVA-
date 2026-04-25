import java.awt.*;

public class Remove_duplicate_form_shorted_list {
    // create node
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data= data;
        }
    }
    public static Node remove_duplicate(Node head){
        Node temp = head ;
        while (temp!=null&& temp.next!=null){
            if(temp.data == temp.next.data){
                temp.next= temp.next.next;
            }
            if(temp.next==null){
                return head;
            }
            if(temp.next.data != temp.data){
                temp= temp.next;
            }
        }
        return head;
    }
    public static void Display(Node head){
        Node temp = head ;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println( );
    }

    static void main(String[] args) {
        Remove_duplicate_form_shorted_list.Node a = new Node(1);
        Remove_duplicate_form_shorted_list.Node b = new Node(1);
        Remove_duplicate_form_shorted_list.Node c = new Node(2);
        Remove_duplicate_form_shorted_list.Node d= new Node(2);
        Remove_duplicate_form_shorted_list.Node e = new Node(3);
        Remove_duplicate_form_shorted_list.Node f = new Node(3);
        Remove_duplicate_form_shorted_list.Node g = new Node(4);
        Remove_duplicate_form_shorted_list.Node h = new Node(4);
        Remove_duplicate_form_shorted_list.Node i = new Node(5);
        Remove_duplicate_form_shorted_list.Node j = new Node(5);
        //connection a node
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        h.next=i;
        i.next=j;
        j.next=null;
        a =  remove_duplicate(a);
        Display(a);


    }


}
