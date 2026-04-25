public class String_builder {
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("hello");
        System.out.println(str);
        // hello -> mello
        str.setCharAt(0, 'm'); // we change string in string Builder at any index
        System.out.println(str);

        // add something at end of the string using append function
        str.append(" world");
        System.out.println(str);

    }
}
