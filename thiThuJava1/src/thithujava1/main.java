/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thithujava1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DongVat> Listdv = new ArrayList<>();
        DongVatServive sv = new DongVatServive();
        while (true) {            
            System.out.println("chon chuc nang:");
            int chucNag = Integer.valueOf(sc.nextLine());
            switch (chucNag) {
                case 1->{
                    sv.themThongTin(Listdv);
                }
                case 2->{
                    sv.xuatThongTin(Listdv);
                }
                case 3->{
                    sv.timCanNang(Listdv);
                }
                case 4->{
//                    System.exit(4);
                    System.out.println("thoat");
                    return;
                }
                case 5->{
                    sv.DongVatMeo(Listdv);
                }
                default->{
                    System.out.println("chon lai");
                }
            }
        }
    }
    
}
