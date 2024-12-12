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
public class Nguoi {

    private String hoTen;
    private String ngaySinh;
    private String queQuan;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ho va ten: ");
        hoTen = sc.nextLine();
        System.out.print("nhap ngay sinh: ");
        ngaySinh = sc.nextLine();
        System.out.print("nhap que quan: ");
        queQuan = sc.nextLine();
    }

    public void xuat() {
        System.out.println("ho ten: " + hoTen);
        System.out.println("ngay sinh: " + ngaySinh);
        System.out.println("que quan: " + queQuan);
    }
}
