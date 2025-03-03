/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b1.d;

import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args) {
        ArrayList<LopHoc> dsLop = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("ten lop hoc:");
        String ten = sc.nextLine();
        System.out.println("toa:");
        String toa = sc.nextLine();
        System.out.println("dia chi:");
        String diaChi = sc.nextLine();
        System.out.println("dien tich:");
        int dt = Integer.valueOf(sc.nextLine());
        sc.nextLine();
         LopHoc lh = new LopHoc(ten, toa, diaChi, dt);
            dsLop.add(lh);
        
    }
}
