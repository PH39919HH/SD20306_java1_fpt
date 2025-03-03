/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btlt;

import java.util.ArrayList;
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
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        NguoiService sv = new NguoiService();
        ArrayList<Nguoi> listN = new ArrayList<>();
        while (true) {
            System.out.print("moi nhap chuc nang: ");
            int chucNang = Integer.valueOf(sc.nextLine());
            switch (chucNang) {
                case 1 -> {
                    sv.ThemNguoi(listN);
                }
                case 2 -> {
                    sv.inThongTinNguoi(listN);
                }
                case 3 -> {
                    sv.lietKeNu(listN);
                }
                case 4 -> {
                    int max = 0, min = 0;
                    sv.lietKeNguoiThuTu(listN, max, min);
                }
                case 5 -> {
                    sv.sapXepTangDanTheoTuoi(listN);
                }
                case 6 -> {
                    int vitTri = Integer.valueOf(sc.nextLine());
                    sv.PayMauNguoiTheoViTri(listN, vitTri);
                }
                case 7 -> {
                    sv.sapXepGiamDanTheoTen(listN);
                }
                case 0 -> {
                    System.exit(0);
                }
                default -> {
                    System.out.println("moi chon lai");
                }
            }
        }
    }
    //sua chuc nang 5,7
}
