/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLiSinhVien;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

/**
 *
 * @author ADMIN
 */
public class StudentManager {

    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent() {
        Student student = new Student();
        student.nhap();
        for (Student s : students) {
            if (s.getId() == student.getId()) {
                System.out.println("ID da thong tai. khong them duoc sinh vien");
                return;
            }
        }
        students.add(student);
        System.out.println("them sinh vien thanh cong.");
    }

    public void editStudentById() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap id sinh vien can sua: ");
        int id = sc.nextInt();

        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("nhap thong tin moi cho sinh vien:");
                student.nhap();
                System.out.println("sua thong tin sinh vien thanh cong.");
                return;
            }
        }
        System.out.println("khong tim thay sinh vien voi ID: " + id);
    }

    public void deleteStudentById() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap id sinh vien can xoa: ");
        int id = sc.nextInt();

        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
                System.out.println("xoa sinh vien thanh cong.");
                return;
            }
        }
        System.out.println("khong tim thay sinh vien voi ID: " + id);
    }

    public void sortStudentsByGpa() {
        students.sort(Comparator.comparingDouble(Student::getGpa).reversed());
        System.out.println("sap xep sinh vien theo GPA giam dan thanh cong.");
    }

    public void sortStudentsByName() {
        students.sort(Comparator.comparing(Student::getName));
        System.out.println("sap xep sinh vien theo ten thanh cong");
    }

    public void showStudents() {
        if (students.isEmpty()) {
            System.out.println("danh sach sinh vien rong.");
            return;
        }
        for (Student student : students) {
            student.xuat();
        }
    }
}
