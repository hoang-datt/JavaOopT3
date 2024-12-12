/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThongTinSanPham;

import java.util.ArrayList;
import java.util.Scanner;

public class Phieu {
    private String maPhieu;
    private String tenPhieu;
    private DateTime ngayLap;
    private ArrayList<SanPham> danhSachSanPham;

    public Phieu() {
        danhSachSanPham = new ArrayList<>();
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap ma phieu: ");
        maPhieu = scanner.nextLine();
        System.out.print("nhap ten phieu: ");
        tenPhieu = scanner.nextLine();
        ngayLap = new DateTime();
        System.out.println("nhap ngay lap phieu:");
        ngayLap.nhap();

        System.out.print("nhap so luong san pham: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("nhap thong tin san pham thu " + (i + 1) + ":");
            SanPham sp = new SanPham();
            sp.nhap();
            danhSachSanPham.add(sp);
        }
    }

    public void xuat() {
        System.out.println("ma phieu: " + maPhieu);
        System.out.println("ten phieu: " + tenPhieu);
        System.out.print("ngay lap phieu: ");
        ngayLap.xuat();
        System.out.println("danh sach san pham:");

        double tongThanhTien = 0;
        for (SanPham sp : danhSachSanPham) {
            sp.xuat();
            tongThanhTien += sp.tinhThanhTien();
        }
        System.out.println("tong thanh tien: " + tongThanhTien);
    }
}


