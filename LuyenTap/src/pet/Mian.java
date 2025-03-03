package pet;


import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class Mian {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DongVat> ListDV = new ArrayList<>();
        DongVatService sv = new DongVatService();
        while (true) {
            System.out.println("Nhap chuc nang:");
            int chucNang = Integer.valueOf(sc.nextLine());
            switch (chucNang) {
                case 1 -> {
                    sv.ThemThongTin(ListDV);
                }
                case 2 -> {
                    sv.xuatThongTIn(ListDV);
                }
                case 3 -> {
                    sv.timLiemTheoTen(ListDV);
                }
                case 4 -> {
                    sv.sapXepTangDanTheoCanNang(ListDV);
                }
                case 5 -> {                    
                    sv.xoaDongVatTheoMaBP(ListDV);                   
                }
                case 6 -> {
                    sv.lietKeCacViTriSoChan(ListDV);          //loi         
                }
                case 7 -> {
                    sv.inDongVatCoCanNangLonNhat(ListDV);//loi
                }
                case 8 -> {
                    sv.timKiemDongVatTheoCanNangBP(ListDV);
                }
                case 9 -> {
                    sv.LietKeTop3NheCanNhat(ListDV);
                }
                case 0 -> {
                    System.exit(0);
                }
                default -> {
                    System.out.println("chon lai");
                }
                
            }
        }
    }
}
