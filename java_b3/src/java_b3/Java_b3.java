/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_b3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Java_b3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //cau1
        System.out.println("nhap mssv:");
        String mssv = sc.nextLine();
        System.out.println("nhap ten:");
        String ten = sc.nextLine();
        System.out.println("nhap nganh hoc:");
        String nganhHoc = sc.nextLine();
        System.out.println("mssv:" + mssv);
        System.out.println("ten:" + ten);
        System.out.println("nganh hoc" + nganhHoc);
        //cau2
        System.out.println("nhap chieu dai:");
        int cd = sc.nextInt();
        System.out.println("nhap chieu rong:");
        int cr = sc.nextInt();
        int P = 2 * (cd + cr);
        int S = cd * cr;
        System.out.println("ket qua chu vi:" +P);
        System.out.println("ket qua dien tich:" +S);
        //cau3
        System.out.println("nhap diem toan:");
        int dt = sc.nextInt();
        System.out.println("nhap diem ly");
        int dl = sc.nextInt();
        System.out.println("nhap diem hoa");
        int dh = sc.nextInt();
        System.out.println("diem toan la:" +dt);
        System.out.println("diem ly la:" +dl);
        System.out.println("diem hoa la:" +dh);
        //cau4
        
    }

}
