/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThongTinSanPham;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        Phieu phieu = new Phieu();
        System.out.println("nhap thong tin phieu:");
        phieu.nhap();
        System.out.println("\nthong tin phieu vua nhap:");
        phieu.xuat();
    }
}
