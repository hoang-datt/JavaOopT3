
package quanLiDieuHoa;

import java.util.Scanner;


public class SanPham {
    private String maSanPham;
    private String tenSanPham;
    private String tenHangSanXuat;
    private int ngayNhap;
    
    public SanPham() {
        
    }
    
    public SanPham(String maSanPham, String tenSanPham, String tenHangSanXuat, int ngayNhap) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.tenHangSanXuat = tenHangSanXuat;
        this.ngayNhap = ngayNhap;
    }
    
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma san pham:");
        maSanPham = sc.nextLine();
        System.out.println("nhap ten san pham:");
        tenSanPham = sc.nextLine();
        System.out.println("nhap ten hang san xuat:");
        tenHangSanXuat = sc.nextLine();
        System.out.println("ngay nhap:");
        ngayNhap = sc.nextInt();
    }
    
    public void Xuat() {
        System.out.println("ma san pham: " + maSanPham);
        System.out.println("ten sang pham: " + tenSanPham);
        System.out.println("hang san xuat: " + tenHangSanXuat);
        System.out.println("ngay nhap: " + ngayNhap);
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public int getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(int ngayNhap) {
        this.ngayNhap = ngayNhap;
    }
}

