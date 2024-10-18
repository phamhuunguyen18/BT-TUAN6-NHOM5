import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap so b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap so c: ");
        double c = sc.nextDouble();

        double min=a;

        if (b < a) {
            min = b;
        }
        if (c < min) {
            min = c;
        }

        System.out.println("So be nhat trong 3 so la: " + min);

    }
}
