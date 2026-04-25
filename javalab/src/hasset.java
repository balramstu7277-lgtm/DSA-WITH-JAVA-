import java.lang.foreign.PaddingLayout;
import java.lang.reflect.Type;
import java.time.temporal.Temporal;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class test {
    static HashSet<Integer> name = new HashSet<>();
    static HashSet<Character> name2 = new HashSet<>();
    static TreeSet<Integer> tree1 = new TreeSet<>();
    static LinkedHashSet<Integer> likset = new LinkedHashSet();
    public static LinkedHashSet<Integer> setLink(){
        likset.add(2);
        likset.add(4);
        likset.add(3);
        likset.add(7);
        likset.add(9);
        likset.add(9);

        return likset;
    }
    public static LinkedHashSet<Integer> getLink(){
        for(int val : likset){
            System.out.print(val+ " ");
        }
        return null;
    }

    public static TreeSet<Integer> setTree(){
        tree1.add(1);
        tree1.add(4);
        tree1.add(3);
        tree1.add(2);
        tree1.add(9);
        return  null;

    }
    public static TreeSet<Integer> getTree1(){
        for(int val: tree1){
            System.out.print(val + " ");
        }
        return null;
    }

    public static HashSet<Integer> setname() {
        name.add(2);
        name.add(2);
        name.add(4);
        name.add(3);
        name.add(3);
       // add in name 2

        return null;
    }
    public static HashSet<Character>setchar(){
        name2.add('a');
        name2.add('d');
        name2.add('u');
        name2.add('k');
        name2.add('e');
        return null;
    }
    // Hasset
    public static HashSet<Integer> getName(){
        for(int val:name){
            System.out.print(val + " ");
        }
        return null;
    }
    public static HashSet<Character> print(){
        for(Character val : name2 ){
            System.out.print(val + " ");
        }
        return null;
    }
}
public class hasset {
    public static void main(String[]args){
        test t1 = new test();

//         hasset
        System.out.println("Hasset");
         t1.setname();
        t1.getName();
        System.out.println("");
        System.out.println("charset");
        t1.setchar();
       t1.print();
        System.out.println("");
        System.out.println("tree set");
        t1.setTree();
       t1.getTree1();
        System.out.println(" ");
        System.out.println("link");
        t1.setLink();
        t1.getLink();
//        System.out.println(t1.setLink());
    }
}
