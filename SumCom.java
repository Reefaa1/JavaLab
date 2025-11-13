class Complex {
    double re;
    double im;

    Complex(double r, double i) {
        re = r;
        im = i;
    }

    Complex add(Complex other) {
        return new Complex(this.re + other.re, this.im + other.im);
    }

    void display() {
        System.out.println(re + " + " + im + "i");
    }
}
public class SumCom {
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(5, 2);

   
        Complex sum = c1.add(c2);

        System.out.print("Sum: ");
        sum.display();
    }
}
