/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_b3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class lyThuyet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("nhap so nguyen:");
////        int n = sc.nextInt();
//        int n = Integer.valueOf(sc.nextInt());
//        if (n >= 0) {
//            System.out.println(n + " la so duong");
//        } else {
//            System.out.println(n + " la so am");
//        }
//    }
//cac1
        System.out.print("nhap chieu dai:");
        int cd = Integer.valueOf(sc.nextInt());
        System.out.print("nhap chieu rong:");
        int cr = Integer.valueOf(sc.nextInt());
        int P = 2* (cd+cr);
        int S = cd * cr;
        System.out.println("chu vi la:"+P);
        System.out.println("dien tich la"+S);
        if (P / 2 == 0) {
            System.out.println("chu vi chia het cho 2");
        }else{
            System.out.println("chu vi khong chia het cho 2");
        }
//        cau2 
        System.out.println("nhap nam sinh");
    }
}
