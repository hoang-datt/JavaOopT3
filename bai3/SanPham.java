/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThongTinSanPham;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class SanPham {

private String maSP;
    private String tenSP;
    private int soLuong;
    private double donGia;

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap ma san pham: ");
        maSP = scanner.nextLine();
        System.out.print("nhap ten san pham: ");
        tenSP = scanner.nextLine();
        System.out.print("nhap so luong: ");
        soLuong = scanner.nextInt();
        System.out.print("nhap don gia: ");
        donGia = scanner.nextDouble();
    }

    public void xuat() {
        System.out.println("ma san pham: " + maSP);
        System.out.println("ten san pham: " + tenSP);
        System.out.println("so luong: " + soLuong);
        System.out.println("don gia: " + donGia);
        System.out.println("thanh tien: " + tinhThanhTien());
    }

    public double tinhThanhTien() {
        return soLuong * donGia;
    }
}
