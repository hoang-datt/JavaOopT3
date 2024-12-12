/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanLiDieuHoa;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class DieuHoa extends SanPham {
    private double congSuat;
    private double giaBan;
    
    public DieuHoa() {
        
    }
    
    public DieuHoa(String maSanPham, String tenSanPham, String tenHangSanXuat, int ngayNhap, double congSuat, double giaBan) {
        super(maSanPham, tenSanPham, tenHangSanXuat, ngayNhap);
        this.congSuat = congSuat;
        this.giaBan = giaBan;
    }
    
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        super.Nhap();
        System.out.println("nhap cong suat (kW):");
        congSuat = sc.nextDouble();
        System.out.println("nhap gia ban (trieu dong):");
        giaBan = sc.nextDouble();
    }
    
    public void Xuat() {
        super.Xuat();
        System.out.println("cong suat: " + congSuat + " KW");
        System.out.println("gia ban: " + giaBan + " trieu dong");
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
    
    
}
