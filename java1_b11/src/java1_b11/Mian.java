/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java1_b11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Mian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        DienThoaiService sv = new DienThoaiService();
        ArrayList<DienThoai> listDT = new ArrayList<>();
        while (true) {
            System.out.println("chon chuc nang:");
            int chucNang = Integer.valueOf(sc.nextLine());
            switch (chucNang) {
                case 1 -> {
                    sv.themDh(listDT);
                }
                case 2 -> {
                    sv.InThongTinDienThoai(listDT);
                }
                case 3 -> {
                    int gia = Integer.valueOf(sc.nextLine());
                    sv.TimDienThoai(listDT, gia);
                }

                case 4 -> {
                    sv.NhapBoNho(listDT);
                }
                case 5 -> {
                    sv.SapXepTangDan(listDT);
                    sv.InThongTinDienThoai(listDT);
                }
                case 6 -> {
                    sv.SapXepGiamDan(listDT);
                    sv.InThongTinDienThoai(listDT);
                }
                case 7 -> {
                    sv.XoaDienThoaiViTri(listDT,int vi);
                }
                case 8 -> {
                    sv.XoaDienThoaiMa(listDT);
                }
                case 0 -> {
                    System.exit(0);
                }
                default -> {
                    System.out.println("xin hay nhap lai");
                }

            }
        }
    }

}
