/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Thucvat;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap ma:");
        String ma = sc.nextLine();
        System.out.println("moi nhap ten:");
        String ten = sc.nextLine();
        System.out.println("moi chon gioi tinh:");
        boolean gioiTinh = Boolean.valueOf(sc.nextLine());
        System.out.println("moi nhap can nang:");
        double canNang =Double.valueOf(sc.nextLine());
        System.out.println("moi nhap chieu cao:");
        int chieuCao = Integer.valueOf(sc.nextLine());
        System.out.println("moi nhap loai:");
        String loai = sc.nextLine();
        System.out.println("moi nhap san luong moi nam:");
        int sl = Integer.valueOf(sc.nextLine());
        CayLua cl = new CayLua(sl, ma, ten, gioiTinh, canNang, chieuCao, loai);
    }
    
}
