public class find_intersetion {

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node findIntesectio(Node head1 , Node head2){

        Node temp1 = head1;
        Node temp2 = head2;

        int length1 = 0;
        int length2 = 0;

        while(temp1 != null){
            length1++;
            temp1 = temp1.next;
        }

        while(temp2 != null){
            length2++;
            temp2 = temp2.next;
        }

        temp1 = head1;
        temp2 = head2;

        if(length1 > length2){
            for(int i = 0; i < length1-length2; i++){
                temp1 = temp1.next;
            }
        }else{
            for(int i = 0; i < length2-length1; i++){
                temp2 = temp2.next;
            }
        }

        while(temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return temp1;
    }

    // Function to print list
    public static void printList(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args){

        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(10);
        Node d = new Node(12);
        Node e = new Node(16);

        Node f = new Node(19);
        Node g = new Node(20);
        Node h = new Node(21);

        // First Linked List
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // Second Linked List
        f.next = g;
        g.next = h;
        h.next = c;

        // Print lists
        System.out.print("List 1: ");
        printList(a);

        System.out.print("List 2: ");
        printList(f);

        Node intersection = findIntesectio(a , f);

        System.out.println("Intersection Node Data: " + intersection.data);
    }
}