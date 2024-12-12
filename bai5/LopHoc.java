/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;

/**
 *
 * @author ADMIN
 */
public class LopHoc {
     private String maLH;
    private String tenLH;
    private String ngayMo;
    private String giaoVien;
    private ArrayList<SinhVien> danhSachSinhVien;

    public LopHoc() {
        danhSachSinhVien = new ArrayList<>();
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ma lop hoc: ");
        maLH = sc.nextLine();
        System.out.print("nhap ten lop hoc: ");
        tenLH = sc.nextLine();
        System.out.print("nhap ngay mo: ");
        ngayMo = sc.nextLine();
        System.out.print("nhap ten giao vien: ");
        giaoVien = sc.nextLine();

        System.out.print("nhap so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("nhap thong tin sinh vien thu" + (i + 1) + ":");
            SinhVien sv = new SinhVien();
            sv.nhap();
            danhSachSinhVien.add(sv);
        }
    }

    public void xuat() {
        System.out.println("ma lop hoc: " + maLH);
        System.out.println("ten lop hoc: " + tenLH);
        System.out.println("ngay mo: " + ngayMo);
        System.out.println("giao vien: " + giaoVien);
        System.out.println("danh sach sinh vien:");

        for (SinhVien sv : danhSachSinhVien) {
            sv.xuat();
            System.out.println("----------------------");
        }
    }

    public int demSinhVienKhoa14() {
        int count = 0;
        for (SinhVien sv : danhSachSinhVien) {
            if (sv.getKhoaHoc() == 14) {
                count++;
            }
        }
        return count;
    }

    public void sapXepSinhVienTheoKhoaHoc() {
        Collections.sort(danhSachSinhVien, Comparator.comparingInt(SinhVien::getKhoaHoc));
    }
}
