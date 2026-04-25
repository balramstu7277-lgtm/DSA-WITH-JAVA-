import java.lang.classfile.instruction.NewMultiArrayInstruction;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class Singllylinkedlist{
    Node head ;
        public void insert_data(int data ){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return ;
            }
            Node temp = head ;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        public void display(){
            Node temp = head ;
            while (temp != null){
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }

    }

public class insertatioAtend {
    public static void main(String[] args){
        Singllylinkedlist list = new Singllylinkedlist();
        list.insert_data(10);
        list.insert_data(20);
        list.insert_data(30);
        list.insert_data(40);

        list.display();


    }
}
