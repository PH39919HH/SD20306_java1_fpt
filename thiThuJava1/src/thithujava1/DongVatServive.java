/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thithujava1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DongVatServive {
    Scanner sc = new Scanner(System.in);
    public  void themThongTin(ArrayList<DongVat> Listdv){
        System.out.println("nhap ma:");
        String ma = sc.nextLine();
        System.out.println("nhap ten:");
        String ten = sc.nextLine();
        System.out.println("nhap noi song:");
        String noiSong = sc.nextLine();
        System.out.println("nhap can nang:");
        int canNang = Integer.valueOf(sc.nextLine());
        DongVat dv = new DongVat(noiSong, noiSong, noiSong, canNang);
        Listdv.add(dv);
    }
    public  void xuatThongTin(ArrayList<DongVat> Listdv){
        for (DongVat dongVat : Listdv) {
            dongVat.inThongTin();
        }
    }
    public  void timCanNang(ArrayList<DongVat> Listdv){
        System.out.println("Nhap can thieu toi:");
        int canToiThieu = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap can thieu toi:");
        int canToiDa = Integer.valueOf(sc.nextLine());
        boolean timTHay = false;
        for (DongVat dongVat : Listdv) {
            if (dongVat.getCanNang() >= canToiThieu && dongVat.getCanNang() <= canToiDa) {
                dongVat.inThongTin();
                timTHay =true;
            }
        }
        if (!timTHay) {
            System.out.println("khong tim thay");
        }
        
    }
    public  void DongVatMeo(ArrayList<DongVat> Listdv){
        System.out.println("nhap ma:");
        String ma = sc.nextLine();
        System.out.println("nhap ten:");
        String ten = sc.nextLine();
        System.out.println("nhap noi song:");
        String noiSong = sc.nextLine();
        System.out.println("nhap can nang:");
        int canNang = Integer.valueOf(sc.nextLine());
        System.out.println("tieng keu:");
        String tiengKeu = sc.nextLine();
        DongVat dv = new DongVat(tiengKeu, tiengKeu, noiSong, canNang);
        Listdv.add(dv);
        for (DongVat dongVat : Listdv) {
            dongVat.inThongTin();
        }
    }
}
