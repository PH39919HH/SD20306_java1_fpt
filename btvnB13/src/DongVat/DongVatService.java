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
public class DongVatService {
    
    public void ThemThongTinDV(ArrayList<DongVat> ListDV){
        Scanner sc = new  Scanner(System.in);
        System.out.println("moi nhap ma:");
        String ma = sc.nextLine();
        System.out.println("moi nhap ten:");
        String ten = sc.nextLine();
        System.out.println("moi nhap gioi tinh:");
        int gioiTinh = Integer.valueOf(sc.nextLine());
        System.out.println("moi nhap can nang:");
        int canNang = Integer.valueOf(sc.nextLine());
        DongVat dv = new DongVat(ma, ten, gioiTinh, canNang);
        ListDV.add(dv);
    }
    public void hienThiTH(ArrayList<DongVat> ListDV){
       ListDV.forEach(s-> s.inThongTin());
    }
    public void TimDongVatChuT(ArrayList<DongVat> ListDV){
        for (DongVat dongVat : ListDV) {
            if (dongVat.getTen().startsWith("t")) {
                dongVat.inThongTin();
            }
        }
    }
    public void lietKeDongVatTheoChu(ArrayList<DongVat> ListDV){
        
    }
    public void sapXepTangDan(ArrayList<DongVat> ListDV){
        
    }
    public void lietKeTop3CanBe(ArrayList<DongVat> ListDV){
        
    }
    public void lietKeDongVatCoE(ArrayList<DongVat> ListDV){
        
    }
}
