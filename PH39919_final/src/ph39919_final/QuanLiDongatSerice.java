/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ph39919_final;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QuanLiDongatSerice {

    Scanner sc = new Scanner(System.in);

    public void themThongTin(ArrayList<Animal> list) {
        while (true) {
            System.out.println("nhap ma:");
            String ma = sc.nextLine();
            System.out.println("Nhap ten:");
            String ten = sc.nextLine();
            System.out.println("Nhap can nang:");
            float canNang = Float.valueOf(sc.nextLine());
            Animal dv = new Animal(ma, ten, canNang);
            list.add(dv);
            System.out.println("tiep tuc nhap nua khong?(y&n):");
            String tiep = sc.nextLine();
            if (!tiep.equalsIgnoreCase("y")) {
                break;
            }
        }
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");
    }
    public void xuatThongTin(ArrayList<Animal> list) {
        for (Animal animal : list) {
            animal.inThongTin();
        }
    }
    public void sapXepTangDanTheoCan(ArrayList<Animal> list){
        list.sort((o1, o2) -> Float.compare(o1.getCanNang(), o2.getCanNang()));
        for (Animal animal : list) {
            animal.inThongTin();
        }
    }
    public void xoaDongVatTheoMa(ArrayList<Animal> listv){
        System.out.println("moi nhap ma can xoa:");
        String maXoa = sc.nextLine();
        listv.removeIf(dv -> dv.getMa().equalsIgnoreCase(maXoa));
    }
    public void hienThiDanhSachDongVat(ArrayList<Animal> listv){
//        System.out.println("nhap ma:");
//        String maCanTim = sc.nextLine();
//        boolean timthay = false;
//        for (Animal animal : listv) {
//            if () {
//                listv.
//            }
//        }
    }
}

