import javax.management.Query;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Collections;
import java.util.Stack;

public class QueueQuestion {
    public static void main(String[] args){
        Queue<String> list = new LinkedList<>();
        list.offer("balram");
        list.offer("kumar");
        list.offer("rana");
        System.out.println(list);
        System.out.println(list.poll());
        System.out.println(list);

    }
}
