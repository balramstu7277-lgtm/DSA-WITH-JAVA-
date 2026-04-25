package Array_list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

// By manual method
public class reverse_array_list {
    static void reverse_list(ArrayList<Integer> list ){
        int i = 0 , j = list.size()-1;
        while (i<j){
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i , list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original list "+ list);
        Collections.reverse(list);
        System.out.println("reverse list "+ list );
        Collections.sort(list);
        System.out.println("Sorting list in ascending order"+ list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("sorting list in a descending "+list);

        // Array list string

        ArrayList<String> string_list = new ArrayList<>();
        string_list.add("My name");
        string_list.add(" is ");
        string_list.add("Balram kumar rana");
        System.out.println("Origianl list " + string_list);
        Collections.sort(string_list,Collections.reverseOrder());
        System.out.println("Sorting  list " + string_list);


    }
}
