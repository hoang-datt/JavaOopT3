/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLi;

/**
 *
 * @author ADMIN
 */
public class main {

    public static void main(String[] args) {
        LopHoc lopHoc = new LopHoc();
        System.out.println("nhap thong tin lop hoc:");
        lopHoc.nhap();

        System.out.println("\nthong tin lop hoc vua nhap:");
        lopHoc.xuat();

        int soSinhVienKhoa14 = lopHoc.demSinhVienKhoa14();
        System.out.println("so luong sinh vien khoa 14: " + soSinhVienKhoa14);

        System.out.println("\ndanh sach sinh vien sau khi sap xep theo khoa hoc:");
        lopHoc.sapXepSinhVienTheoKhoaHoc();
        lopHoc.xuat();
    }
}
