/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b1.b;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main {

    public static void main(String[] args) {
        ArrayList<ThucVat> dsThucVat = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("ma thuc vat: ");
        String maTV = sc.nextLine();
        System.out.print("ten thuc vat ");
        String ten = sc.nextLine();
        System.out.print("tuoi thuc vat: ");
        int tuoi = Integer.valueOf(sc.nextLine());
        System.out.print("chieu cao: ");
        double chieuCao = Double.valueOf(sc.nextLine());
        System.out.print("khu vuc song: ");
        String khuVucSong = sc.nextLine();
        sc.nextLine();
        ThucVat thucVat = new ThucVat(maTV, ten, tuoi, chieuCao, khuVucSong);
        dsThucVat.add(thucVat);
        for (ThucVat tc : dsThucVat) {
            thucVat.display();
        }
    }
}
