/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ph39919_final;

import java.lang.reflect.Array;
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
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<Animal> listDV = new ArrayList<>();
        QuanLiDongatSerice sv = new QuanLiDongatSerice();
        while (true) {            
            System.out.println("moi nhap chuc nang:");
            int chucNang = Integer.valueOf(sc.nextLine());
            switch (chucNang) {
                case 1->{
                    sv.themThongTin(listDV);
                }
                case 2->{
                    sv.xuatThongTin(listDV);
                }
                case 3->{
                    
                }
                case 4->{
                    sv.sapXepTangDanTheoCan(listDV);
                }
                case 5->{
                    sv.xoaDongVatTheoMa(listDV);
                }
                case 6->{
                    
                }
                case 0->{
                    System.exit(chucNang);
                } 
                default->{
                    System.out.println("moi chon lai");
                }
            }
        }
    }
    
}
