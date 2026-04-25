class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

class Demo {
    static void check(int age) throws MyException {
        if (age < 18) {
            throw new MyException("Not eligible (Age)");
        }
    }

    static void gender(String gender) throws MyException {
        if (!gender.equals("male")) {
            throw new MyException("Not eligible (Gender)");
        }
    }

    public static void main(String[] args) {
        try {
            check(19);
            gender("female");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}