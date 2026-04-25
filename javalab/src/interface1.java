interface List<t>{
    void add(t data);
    void reverse();
    int size();
    t get(int index);
}

class ArrayList<t> implements List<t>{
    Object data[];
    int index;

    public ArrayList(){
        data = new Object[10];
        index = 0;
    }

    public ArrayList(int size){
        data = new Object[size];
        index = 0;
    }

    @Override
    public void add(t value) {
        if(index == data.length){
            System.out.println("Array Full");
            return;
        }
        data[index++] = value;
    }

    @Override
    public void reverse() {
        int i = 0;
        int j = index - 1;

        while(i < j){
            Object temp = data[i];
            data[i] = data[j];
            data[j] = temp;
            i++;
            j--;
        }
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public t get(int i) {
        if(i < 0 || i >= index){
            System.out.println("Invalid Index");
            return null;
        }
        return (t)data[i];
    }
}

public class interface1 {
    public static void main(String[] args){
        ArrayList<Integer> a1 = new ArrayList<>();

        a1.add(10);
        a1.add(20);
        a1.add(30);

        a1.reverse();

        for(int i = 0; i < a1.size(); i++){
            System.out.println(a1.get(i));
        }
    }
}