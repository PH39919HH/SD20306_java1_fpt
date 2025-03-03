/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DongVat;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<DongVat> dv = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        DongVatService sv = new DongVatService();
        while (true) {
            System.out.println("moi chon chuc nang:");
            int menu = Integer.valueOf(sc.nextLine());
            switch (menu) {
                case 1 -> {
                    sv.ThemThongTinDV(dv);
                }
                case 2 -> {
                    sv.hienThiTH(dv);
                }
                case 3 -> {
                    sv.TimDongVatChuT(dv);
                }
                case 4 -> {
                    sv.lietKeDongVatTheoChu(dv);
                }
                case 5 -> {
                    sv.sapXepTangDan(dv);
                }
                case 6 -> {
                    sv.lietKeTop3CanBe(dv);
                }
                case 7 -> {
                    sv.lietKeDongVatCoE(dv);
                }
                case 0 -> {
                    System.exit(0);
                    
                }
                
                default -> {
                    System.out.println("hay chon lai!");                    
                }                
            }
        }
    }
}
