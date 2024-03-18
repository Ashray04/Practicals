class Complex {
    double real, imaginary;

    Complex() {
    }

    Complex(double Real, double Imaginary) {
        real = Real;
        imaginary = Imaginary;
    }

    Complex add(Complex C1, Complex C2) {
        Complex temp = new Complex();
        temp.real = C1.real + C2.real;
        temp.imaginary = C1.imaginary + C2.imaginary;
        return temp;
    }

    Complex sub(Complex C1, Complex C2) {
        Complex temp = new Complex();
        temp.real = C1.real - C2.real;
        temp.imaginary = C1.imaginary - C2.imaginary;
        return temp;
    }

    Complex mul(Complex C1, Complex C2) {
        Complex temp = new Complex();
        temp.real = C1.real * C2.real - C1.imaginary * C2.imaginary;
        temp.imaginary = C1.real * C2.imaginary + C1.imaginary * C2.real;
        return temp;
    }

    void printComplexNumber() {
        System.out.println("Complex number: " + real + " + " + imaginary + "i");
    }
}

public class ComplexOperations {
    public static void main(String[] args) {
        Complex C1 = new Complex(6, 2);
        C1.printComplexNumber();

        Complex C2 = new Complex(4, 1);
        C2.printComplexNumber();

        Complex C3 = new Complex();
        C3 = C3.add(C1, C2);
        System.out.print("Addition is :");
        C3.printComplexNumber();

        C3 = C3.sub(C1, C2);
        System.out.print("Subtraction is :");
        C3.printComplexNumber();

        C3 = C3.mul(C1, C2);
        System.out.print("Multiplication is :");
        C3.printComplexNumber();
    }
}
