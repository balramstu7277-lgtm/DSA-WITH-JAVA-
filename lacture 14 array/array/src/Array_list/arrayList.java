package Array_list;
import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
//        Integer i = Integer.valueOf(4);
//        System.out.println(i);
//        Float f = Float.valueOf(55.5f);
//        System.out.println(f);

        // array list  syntax
        ArrayList<Integer> l1 = new ArrayList<>();
        //add new element in end of the list
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(9);
        //get an element at index
        System.out.println(l1.get(1));

        // print with for loop
//        for(int i = 0 ;i < l1.size();i++){
//            System.out.print(l1.get(i));// 5,6,7,8
//        }

        // printing array list directly

        System.out.println(l1); //[5,6,7,8]

        // add element at some  index x
        l1.add(1 , 100);
        System.out.println(l1);

        // modifying  element at index i
        l1.set(1 , 10);
        System.out.println(l1);
        // Removeing  an element at index i
        l1.remove(1);
        System.out.println(l1);

        // Remove an element e
        l1.remove(Integer.valueOf(7));
        System.out.println(l1);

        // Checking an element is exists
        boolean  ans = l1.contains(Integer.valueOf(6));
        System.out.println(ans);

        // if you don't specify  class  you  can put anything inside L
        ArrayList l2 = new ArrayList();
        l2.add("purs");
        l2.add(1);
        l2.add(true);
        System.out.println(l2);

    }

}
