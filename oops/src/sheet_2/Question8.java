package sheet_2;

class Complex {
    private int real;
    private int img;

    // Constructor
    Complex(int r, int i) {
        this.real = r;
        this.img = i;
    }

    // Method to add two complex numbers
    Complex add(Complex c) {
        int newReal = this.real + c.real;
        int newImag = this.img + c.img;
        return new Complex(newReal, newImag);
    }

    // Display method
    void display() {
        System.out.println(real + " + " + img + "i");
    }
}

public class Question8 {
    public static void main(String[] args) {

        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(4, 5);

        Complex result = c1.add(c2);

        System.out.print("Sum = ");
        result.display();
    }
}