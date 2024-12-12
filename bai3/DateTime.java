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
public class DateTime {
    
    private int ngay;
    private int thang;
    private int nam;

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap ngay: ");
        ngay = scanner.nextInt();
        System.out.print("nhap thang: ");
        thang = scanner.nextInt();
        System.out.print("nhap nam: ");
        nam = scanner.nextInt();
    }

    public void xuat() {
        System.out.println(ngay + "/" + thang + "/" + nam);
    }
}
