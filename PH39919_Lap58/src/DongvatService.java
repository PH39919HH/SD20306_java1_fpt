
import java.lang.reflect.Array;
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
public class DongvatService {

    Scanner sc = new Scanner(System.in);

    public void themThongTin(ArrayList<DongVat> listDV) {
        System.out.println("Moi nhap ma dong vat: ");
        String ma = sc.nextLine();
        System.out.println("Moi nhap ten dong vat: ");
        String ten = sc.nextLine();
        System.out.println("Moi nhap can nang: ");
        float canNang = Float.valueOf(sc.nextLine());
        DongVat dv = new DongVat(ma, ten, canNang);
        System.out.println("Ban muon nhap tiep ko (1:co, 0:khong)");
        int chon = Integer.valueOf(sc.nextLine());
        listDV.add(dv);
        for (DongVat dongVat : listDV) {
            dongVat.inThongTin();
        }
    }

    public void hienThiThongTin(ArrayList<DongVat> listDV) {
        for (DongVat dongVat : listDV) {
            dongVat.inThongTin();
        }
    }
    public void  TimKiemTheoDongVat(){
        
    }   
    public void  sapXepTangDan(ArrayList<DongVat> listDV){
//        listDV.sort((o1, o2) -> o1.getCanNang()-o2.getCanNang());
    }   
    public void  XoaDongVatTheo(ArrayList<DongVat> listDV){
//        listDV.remove(sc)
    }   
    public void  LietKeCacViTriDongVatSoChan(){
        
    }   
    public void  InViTriDongVatCanNang(){
        
    }   
    public void  TimKiemDongVatTheoCanNang(){
        
    }     
}
