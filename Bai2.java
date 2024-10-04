import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SinhVien {
    private String masv;
    private String ten;
    private String ngsinh;
    private double diemtb;

    public SinhVien() {
    }

    public String getMasv() {
        return masv;
    }

    public String getTen() {
        return ten;
    }

    public String getNgsinh() {
        return ngsinh;
    }

    public double getDiemtb() {
        return diemtb;
    }

    public void Nhapthongtin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        masv = scanner.nextLine();
        System.out.print("Nhap ten sinh vien: ");
        ten = scanner.nextLine();
        System.out.print("Nhap ngay sinh: ");
        ngsinh = scanner.nextLine();
        System.out.print("Nhap diem trung binh: ");
        diemtb = scanner.nextDouble();
    }

    public void Inthongtin() {
        System.out.println("Ma sinh vien: " + masv);
        System.out.println("Ten: " + ten);
        System.out.println("Ngay sinh: " + ngsinh);
        System.out.println("Diem trung binh: " + diemtb);
    }
}

public class Bai2 {
    public static void main(String[] args) {
        ArrayList<SinhVien> danhsachsv = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong sinh vien: ");
        int Solgsv = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < Solgsv; i++) {
            System.out.println("Sinh vien " + (i + 1) + ":");
            SinhVien sv = new SinhVien();
            sv.Nhapthongtin();
            danhsachsv.add(sv);
        }

        Collections.sort(danhsachsv, new Comparator<SinhVien>() {
            public int compare(SinhVien sv1, SinhVien sv2) {
                return Double.compare(sv2.getDiemtb(), sv1.getDiemtb());
            }
        });

        System.out.println("\nDanh sach sinh vien sau sap xep:");
        for (SinhVien sv:danhsachsv) {
            sv.Inthongtin();
            System.out.println();
        }
    }
}

