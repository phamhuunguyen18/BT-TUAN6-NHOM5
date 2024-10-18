import java.util.Scanner;

public class Bai3{
    public static void main(String[] args) {
        double a,b,c,x1,x2,delta;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap he so a: ");
        a = sc.nextDouble();
        System.out.println("Nhap he so b: ");
        b = sc.nextDouble();
        System.out.println("Nhap he so c: ");
        c = sc.nextDouble();

        delta = Math.pow(b,2)-4*a*c;
        if (a==0) {
            System.out.println("Nhap du lieu sai!");
        } else{
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem!");
            
        } else if (delta == 0) {
            x1 = -b/(2*a);
            System.out.println("Phuong trinh co nghiem kep: x = " + x1);
        } else {
            x1 = (-b + Math.sqrt(delta))/(2*a);
            x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("Phuong trinh co hai nghiem phan biet: x1 =" + x1 + ", x2 =" + x2);
        }

    }
    }
}
