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
public class Student {

    private int id;
    private String name;
    private int age;
    private String address;
    private double gpa;

    public Student() {
    }

    public Student(int id, String name, int age, String address, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("nhap ten: ");
        name = sc.nextLine();
        System.out.print("nhap tuoi: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("nhap dia chi: ");
        address = sc.nextLine();
        System.out.print("nhap GPA: ");
        gpa = sc.nextDouble();
    }

    public void xuat() {
        System.out.println("ID: " + id);
        System.out.println("ten: " + name);
        System.out.println("tuoi: " + age);
        System.out.println("dia chi: " + address);
        System.out.println("GPA: " + gpa);
    }
}
