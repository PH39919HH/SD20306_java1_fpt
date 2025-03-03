/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       ArrayList<DongVat> listDV = new ArrayList<>(); 
        System.out.println("moi nhap ma: ");
        String maDV = sc.nextLine();
        System.out.println("moi nhap ten: ");
        String ten = sc.nextLine();
        System.out.println("moi nhap tuoi: ");
        int tuoi = Integer.valueOf(sc.nextLine());
        sc.nextLine();
        System.out.println("moi nhap can nang: ");
        double canNang = Double.valueOf(sc.nextLine());
        DongVat dv = new DongVat(maDV, ten, tuoi, canNang);
        listDV.add(dv);
        for (DongVat dongVat : listDV) {
            dongVat.inThongTin();
        }    
    }  
}
