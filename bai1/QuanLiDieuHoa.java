/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanLiDieuHoa;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class QuanLiDieuHoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DieuHoa> danhSachDieuHoa = new ArrayList<>();
        
        System.out.println("nhap so luong dieu hoa: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < n; i++) {
            System.out.println("nhap thong tin dieu hoa thu " + (i + 1) + ":");
            DieuHoa dieuHoa = new DieuHoa();
            dieuHoa.Nhap();
            danhSachDieuHoa.add(dieuHoa);
        }
        
        ArrayList<DieuHoa> dieuHoaGiaThapNhat = new ArrayList<>();
        for(DieuHoa dieuHoa : danhSachDieuHoa) {
            if(dieuHoa.getTenHangSanXuat().equalsIgnoreCase("Electrolux")) {
               dieuHoaGiaThapNhat.add(dieuHoa);
            }
        }
        
        if(dieuHoaGiaThapNhat.isEmpty()) {
            System.out.println("dieu hoa Electrolux khong ton tai!");
        }else {
            DieuHoa giaThapNhat = danhSachDieuHoa.get(0);
            for(DieuHoa dieuHoa : danhSachDieuHoa) {
                if(dieuHoa.getGiaBan() < giaThapNhat.getGiaBan()) {
                    giaThapNhat = dieuHoa;
                }
            }
            System.out.println("thong tin cua dieu hoa Electrolux co gia ban thap nhat:");
            giaThapNhat.Xuat();
        }
    }
}
