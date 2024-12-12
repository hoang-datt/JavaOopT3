/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLi;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class SinhVien extends Nguoi {

    private String maSV;
    private String nganh;
    private int khoaHoc;

    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ma sinh vien: ");
        maSV = sc.nextLine();
        System.out.print("nhap nganh: ");
        nganh = sc.nextLine();
        System.out.print("nhap khoa hoc: ");
        khoaHoc = sc.nextInt();
    }

    public void xuat() {
        super.xuat();
        System.out.println("ma sinh vien: " + maSV);
        System.out.println("nganh: " + nganh);
        System.out.println("khoa hoc: " + khoaHoc);
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public int getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(int khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

}
