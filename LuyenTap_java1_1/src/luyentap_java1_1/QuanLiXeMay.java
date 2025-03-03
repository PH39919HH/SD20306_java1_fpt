/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentap_java1_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Admin
 */
public class QuanLiXeMay {
    Scanner sc = new Scanner(System.in);
    public void nhapDanhSach(ArrayList<XeMay> List){
        while (true) {            
            System.out.println("Nhap ma xe may:");
            String ma = sc.nextLine();
            System.out.println("Nhap ten xe may:");
            String ten = sc.nextLine();
            System.out.println("Nhap hang xe may:");
            String hang = sc.nextLine();
            System.out.println("Nhap gia xe may:");
            double gia = Double.valueOf(sc.nextLine());
            XeMay xm = new XeMay(ma, ten, hang, gia);
            List.add(xm);
            System.out.println("tiep tuc nhap nua ko (y/n)?:");
            String tiepTuc = sc.nextLine();
            if (!tiepTuc.equalsIgnoreCase("y")) {
                break;
            }
        }
    }
    public void XuatDanhSach(ArrayList<XeMay> list){
        for (XeMay xm : list) {
            xm.inThongTin();
        }
    }
    public void timKiemXeKhoangMaxMin(ArrayList<XeMay> list){
        System.out.println("nhap gia min:");
        double min = Double.valueOf(sc.nextLine());
        System.out.println("nhap gia max:");
        double max = Double.valueOf(sc.nextLine());
        
        boolean timThay= false;
        for (XeMay xm : list) {
            if (xm.getGiaTien() >= min && xm.getGiaTien() <= max) {
                xm.inThongTin();
                timThay=true;
            }           
        }
        if (!timThay) {
            System.out.println("khong tim thay");
        }
    }
    public void sapXepGiamDanGIa(ArrayList<XeMay> list){
        list.sort((o1, o2) -> Double.compare(o2.getGiaTien(), o1.getGiaTien()));
        
        for (XeMay xm : list) {
            xm.inThongTin();
        }
    }
    public void XoaMaTuBP(ArrayList<XeMay> list){
        System.out.println("nhap ma can xoa:");
        String maXoa = sc.nextLine();
        list.removeIf(xm -> xm.getMaXemMay().equalsIgnoreCase(maXoa));
        if (list.stream().noneMatch(xm -> xm.getMaXemMay().equalsIgnoreCase(maXoa))) {
            System.out.println("da xoa ma");
        }else{
            System.out.println("ko co ma xoa");
        }
    }
    public void sapXepTangDanTen(ArrayList<XeMay> list){
        list.sort((o1, o2) -> o1.getTen().compareTo(o2.getTen()));
        for (XeMay xeMay : list) {
            xeMay.inThongTin();
        }
    }
    public void TimXeMayChuA(ArrayList<XeMay> list){
        List <XeMay> timKiem = list.stream().filter(xm -> xm.getTen().contains("a")).collect(Collectors.toList());
        for (XeMay xeMay : timKiem) {
            xeMay.inThongTin();
        }
        
    }
    public void TimXeMayBatDauA_BP(ArrayList<XeMay> list){
        
    }
    public void lietKeTop3GiaLonNhat(ArrayList<XeMay> list){
        
    }
}
