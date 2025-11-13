import java.util.Scanner;
public class VolCalc{
        double vol(double s) {
        return s * s * s;
    }
double vol(double l, double w, double h) {
        return l * w * h;
    }
    double vol(double r, int h) {
        return Math.PI * r * r * h;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VolCalc obj = new VolCalc();
        System.out.print("Enter side of cube: ");
        double s = sc.nextDouble();
        System.out.println("Volume of Cube = " + obj.vol(s));
        System.out.print("\nEnter length, width and height of box: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println("Volume of Rectangular Box = " + obj.vol(l, w, h));
        System.out.print("\nEnter radius and height of cylinder: ");
        double r = sc.nextDouble();
        int hc = sc.nextInt();
        System.out.println("Volume of Cylinder = " + obj.vol(r, hc));
        sc.close();
    }
}
