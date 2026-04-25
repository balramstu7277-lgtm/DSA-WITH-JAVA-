public class implementation {
    public static class Node{
        int data ;
        Node next;
        Node(int data ){
            this.data = data;
        }
    }
    public static class Linked_list{
        Node head = null;
        Node tail = null;
        // insertion at end
        void insertionAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp ;
            }else {
                tail.next = temp;

            }
            tail = temp;
        }
        // insert at head
        void insertionAtHead(int val){
            Node temp = new Node(val);

            if(head == null){  // empty list
                head = temp ;
                tail = temp ;
            }else {
                temp.next = head ;
                head = temp;
            }
        }
        // Insert element at any index
        void insertAtIndex(int index , int val){
            Node t = new Node(val);
            Node temp = head;
            if(index == Size()){
                insertionAtEnd(val);
                return;
            } else if (index == 0) {
                insertionAtHead(val);
            } else if (index < 0 ) {
                System.out.println("invalid index please give ma a correct index ");
                return;
            }
            for(int i = 1 ; i < index-1 ;i++){
                temp  = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }
        // Access element from Linked list
        int gatElement(int idx){
            Node temp = head;
            if(idx <0 || idx>Size()){
                System.out.println("Wrong index");
                return -1;
            }
            for(int i = 1 ; i <= idx-1; i++){
                temp = temp .next;

            }
            return temp.data;
        }
        //Delete Element form Linked list
        void Delete (int idx ){
            Node temp = head;
            if(idx == 0){
                head = head.next;
            }
            for(int i = 1 ; i <= idx -1 ; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
        }
        // Display method
        void Display(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        // to determine size of linklist
        int Size(){
            Node temp = head;
            int count = 0;
            while (temp!= null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
     public static void main(String[]args){
        Linked_list list = new Linked_list();
         // insert at end
        list.insertionAtEnd(5);
         list.insertionAtEnd(6);
         list.insertionAtEnd(5);
         list.insertionAtEnd(8);
         list.insertionAtEnd(9);
         list.insertionAtEnd(6);
         // insert at head
         list.insertionAtHead(10);
         // insert at any index
         list.insertAtIndex(2, 20);
         list.Display();
         list.insertAtIndex(-2, 20);
         System.out.println("length of Linkled list");
         int len = list.Size();
         System.out.println(len);
         System.out.println(list.gatElement(5));
         list.Delete(0);
         list.Display();

     }
}
