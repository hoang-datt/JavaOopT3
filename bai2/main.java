/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhuongThucToanHoc;

/**
 *
 * @author ADMIN
 */
public class main {
    public static void main(String[] args) {
        SoPhuc p1 = new SoPhuc();
        SoPhuc p2 = new SoPhuc();
        
        System.out.println("nhap du lieu cho so phuc p1:");
        p1.Nhap();
        System.out.println("nhap du lieu cho so phuc p2:");
        p2.Nhap();
        
        System.out.println("so phuc p1:");
        p1.xuat();
        System.out.println("so phuc p2:");
        p2.xuat();
        
        SoPhuc cong = p1.cong(p2);
        SoPhuc tru = p1.tru(p2);
        
        System.out.println("ket qua cong: ");
        cong.xuat();
        System.out.println("ket qua tru: ");
        tru.xuat();
    }
}
