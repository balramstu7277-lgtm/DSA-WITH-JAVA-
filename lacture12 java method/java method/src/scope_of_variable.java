public class scope_of_variable {
    public static class LoopExample {
        public void printNumbers() {
            // 'i' is a block-scoped variable
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
            } // 'i' is destroyed here

            // ERROR! 'i' cannot be accessed here.
            // System.out.println(i);
        }
    }

    public static class Calculator {
        public int add(int a, int b) {
            // 'sum' is a method-scoped variable
            int sum = a + b;
            return sum;
        } // 'sum' is destroyed here

        public void printResult() {
            // ERROR! 'sum' cannot be accessed here.
            // System.out.println(sum);
        }
    }

    public class Car {
        // 'color' is a class-scoped variable
        String color;

        public void displayColor() {
            // 'color' can be used here
            System.out.println("The car's color is " + color);
        }
    }
    public static void main(String[] args){
        Calculator obj = new Calculator();

    }
}
