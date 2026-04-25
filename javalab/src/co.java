// To preform all operation
class Co {
    public static void main(String[] args){
        String operation = args[0];
        int val1 = Integer.parseInt(args[1]);
        int val2 = Integer.parseInt(args[2]);
        if(operation.equals("add")){
            System.out.println(val1+val2);
        }
        if(operation.equals("sub")){
            System.out.println(val1-val2);
        }
        if(operation.equals("mul")){
            System.out.println(val1*val2);
        }
        else
        {
            System.out.println(val1/val2);
        }

    }
}
