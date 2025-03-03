
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
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DongVat> listDV = new ArrayList<>();
        DongvatService sv= new DongvatService();    
        while (true) {            
            System.out.println("moi nhap chuc nang: ");
            int chucNang = Integer.valueOf(sc.nextLine());
            switch (chucNang) {
                case 1->{
                    sv.themThongTin(listDV);
                }
                case 2->{
                    sv.hienThiThongTin(listDV);
                }
                case 3->{
                    
                }
                case 4->{
                    sv.sapXepTangDan(listDV);
                }
                case 5->{
                    
                }
                case 6->{
                    
                }
                case 7->{
                    
                }
                case 8->{
                    
                }
                case 0->{
                    System.exit(0);
                }
                default->{
                    System.out.println("moi chon lai: ");
                }
                   
            }
        }
    }
}
