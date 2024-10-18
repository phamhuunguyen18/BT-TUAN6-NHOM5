public class TaiKhoan 
{
    private String soTaiKhoan;
    private String chuTaiKhoan;
    private double soDu;
    private String matKhau;
    
public TaiKhoan(String soTaiKhoan, String chuTaiKhoan, double soDu, String matKhau) 
    {
        this.soTaiKhoan = soTaiKhoan;
        this.chuTaiKhoan = chuTaiKhoan;
        this.soDu = soDu;
        this.matKhau = matKhau;
    }
public void guiTien(double soTien) 
    {
        if (soTien > 0) 
        {
            soDu += soTien;
            System.out.println("Gui thanh cong, so du hien tai: " + soDu);
        } 
        else 
        {
            System.out.println("So tien khong hop le!");
        }
    }
public void rutTien(double soTien) 
    {
        if (soTien > 0 && soTien <= soDu) {
            soDu -= soTien;
            System.out.println("Rut tahnh cong, so du con lai: " + soDu);
        } else {
            System.out.println("So tien khong hop le!");
        }
    }
public void kiemTraSoDu() 
    {
        System.out.println("So du hien tai: " + soDu);
    }
public void doiMatKhau(String matKhauCu, String matKhauMoi) 
    {
        if (this.matKhau.equals(matKhauCu)) {
            this.matKhau = matKhauMoi;
            System.out.println("Doi mat khau thanh cong.");
        } else {
            System.out.println("Mat khau cu khong dung!");
        }
    }
public String getSoTaiKhoan() 
    {
        return soTaiKhoan;
    }
public String getChuTaiKhoan() 
    {
        return chuTaiKhoan;
    }
public double getSoDu() 
    {
        return soDu;
    }
}
