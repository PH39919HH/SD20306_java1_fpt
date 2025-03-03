/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DienThoaiService {

//    ArrayList<DienThoai> listDT = new ArrayList<>();
    public void themDh(ArrayList<DienThoai> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap ma dien thoai");
        int ma = Integer.valueOf(sc.nextLine());
        System.out.println("moi nhap bo nho dien thoai");
        int boNho = Integer.valueOf(sc.nextLine());
        System.out.println("moi nhap gia dien thoai");
        int gia = Integer.valueOf(sc.nextLine());
        System.out.println("moi nhap ten dien thoai");
        String ten = sc.nextLine();
        System.out.println("moi nhap hang dien thoai");
        String hang = sc.nextLine();
        System.out.println("moi nhap mau dien thoai");
        String mau = sc.nextLine();
        DienThoai dt = new DienThoai(ma, boNho, gia, ten, hang, mau);
        list.add(dt);
    }

    public void InThongTinDienThoai(ArrayList<DienThoai> list) {
        for (DienThoai dt : list) {
            dt.inThongTin();
        }
//        list.forEach(s -> s.inThongTin());
    }

    public void TimDienThoai(ArrayList<DienThoai> list, int gia) {
        for (DienThoai dt : list) {
            if (dt.getGia() == gia) {
                dt.inThongTin();
            }
        }
    }

    public void NhapBoNho(ArrayList<DienThoai> list) {
        
    }

    public void SapXepTangDanGia(ArrayList<DienThoai> list) {
        list.sort((o1, o2) -> o1.getGia() - o2.getGia());
    }

    public void SapXepGiamDanGia(ArrayList<DienThoai> list) {
        list.sort((o1, o2) -> o1.getTen().compareTo(o2.getTen()));
    }

    public void XoaDienThoaiViTri(ArrayList<DienThoai> list, int Vitri) {
        list.remove(Vitri);
    }

    public void XoaDienThoaiMa(ArrayList<DienThoai> list, int ma) {
        list.removeIf(s -> s.getMa() == ma);
    }
}
