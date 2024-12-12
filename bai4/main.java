/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLiSinhVien;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class main {

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("/****************************************/");
            System.out.println("1. Add student.");
            System.out.println("2. Edit student by id.");
            System.out.println("3. Delete student by id.");
            System.out.println("4. Sort students by gpa.");
            System.out.println("5. Sort students by name.");
            System.out.println("6. Show students.");
            System.out.println("0. Exit.");
            System.out.println("/****************************************/");
            System.out.print("nhap lua chon: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    manager.addStudent();
                    break;
                case 2:
                    manager.editStudentById();
                    break;
                case 3:
                    manager.deleteStudentById();
                    break;
                case 4:
                    manager.sortStudentsByGpa();
                    break;
                case 5:
                    manager.sortStudentsByName();
                    break;
                case 6:
                    manager.showStudents();
                    break;
                case 0:
                    System.out.println("thoat chuong trinh");
                    break;
                default:
                    System.out.println("lua chon khong hop le. vui long chon lai");
            }
        } while (choice != 0);
    }
}
