import java.util.ArrayList;
import java.util.Collections;

public class Question2 {
    public static void main(String[] args){
       final ArrayList<String> list = new ArrayList<String>();
        list.add("java");
        list.add("java");
        list.add("java");
        list.add("c");
        list.set(0, "c-sharp"); // update in arraylist
        list.get(1);

        list.remove("java");
        list.removeAll(Collections.singleton("java"));
        // for each loop
        for(String val : list){
            System.out.println(val);
        }

        final int[] arr = {1,3,4};
        arr[0] = 2;
        for(int val : arr){
            System.out.println(val);
        }




    }
}
