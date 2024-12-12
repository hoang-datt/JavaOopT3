/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhuongThucToanHoc;

import java.util.Scanner;


public class SoPhuc {
    private double phanThuc;
    private double phanAo;

    public SoPhuc() {
        
    }
    
    public SoPhuc(String thuc, String ao) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }
    
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so thuc:");
        phanThuc = sc.nextDouble();
        System.out.println("nhap vao so ao:");
        phanAo = sc.nextDouble();
    }
    
    public void xuat() {
        System.out.println("so thuc vua nhap: " + phanThuc);
        System.out.println("so ao vua nhap: " + phanAo);
    }
    
    public SoPhuc cong(SoPhuc soPhuc) {
        SoPhuc ketQua = new SoPhuc();
        ketQua.phanThuc = this.phanThuc + soPhuc.phanThuc;
        ketQua.phanAo = this.phanAo + soPhuc.phanAo;
        return ketQua;
    }
    
    public SoPhuc tru(SoPhuc soPhuc) {
        SoPhuc ketQua = new SoPhuc();
        ketQua.phanThuc = this.phanThuc - soPhuc.phanThuc;
        ketQua.phanAo = this.phanAo - soPhuc.phanAo;
        return ketQua;
    }
}
