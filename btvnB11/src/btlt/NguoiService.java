/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btlt;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NguoiService {

    Scanner sc = new Scanner(System.in);

    public void ThemNguoi(ArrayList<Nguoi> list) {
        System.out.print("Nhap ten nguoi: ");
        String ten = sc.nextLine();
        System.out.print("Nhap que quan nguoi: ");
        String queQuan = sc.nextLine();
        System.out.print("Nhap nghe nghiep nguoi: ");
        String ngheNghe = sc.nextLine();
        System.out.print("Nhap tuoi nguoi: ");
        int tuoi = Integer.valueOf(sc.nextLine());
        System.out.print("Nhap gioi tinh nguoi(1:nam,2:nu): ");
        int gioiTinh = Integer.valueOf(sc.nextLine());
        Nguoi n = new Nguoi(ten, queQuan, ngheNghe, tuoi, gioiTinh);
        list.add(n);
    }

    public void inThongTinNguoi(ArrayList<Nguoi> list) {
//        c1
        for (Nguoi ng : list) {
            ng.inThongTin();
        }
//        c2
//        list.forEach(s -> s.inThongTin());
    }

    public void lietKeNu(ArrayList<Nguoi> list) {
        System.out.println("Danh sach gioi tinh nu:");
        for (Nguoi ng : list) {
            if (ng.getGioiTinh() == 2) {
                ng.inThongTin();
            }
        }
    }

    public void lietKeNguoiThuTu(ArrayList<Nguoi> list, int max, int min) {
        for (Nguoi ng : list) {
            if (ng.getTuoi() >= min || ng.getTuoi() <= max) {
                ng.inThongTin();
            }
        }
    }

    public void sapXepTangDanTheoTuoi(ArrayList<Nguoi> list) {
        list.sort((o1, o2) -> o1.getTuoi() - o2.getTuoi());
    }

    public void PayMauNguoiTheoViTri(ArrayList<Nguoi> list, int viTri) {
        list.remove(viTri);
    }

    public void sapXepGiamDanTheoTen(ArrayList<Nguoi> list) {
        list.sort((c1,c2)-> c1.getTen().compareTo(c2.getTen()));
    }
}
