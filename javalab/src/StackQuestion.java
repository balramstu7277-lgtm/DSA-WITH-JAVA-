import java.util.Stack;

public class StackQuestion {
    public static void main(String[]args){
        Stack<String> list = new Stack<>();
        list.push("balram");
        list.push("kumar");
        list.push("rana");
        System.out.println(list);
        list.pop();
        System.out.println(list);
        System.out.println(list.peek());
    }
}
