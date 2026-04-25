import java.util.ArrayList;
import java.util.Arrays;

public class arraylistQuestion {
    static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
//        for(int val : list){
//            System.out.println(val);
//        }
        for(int i = 0 ; i< list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
