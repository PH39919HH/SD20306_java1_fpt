package pet;

import com.sun.source.tree.BreakTree;
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
public class DongVatService {

    Scanner sc = new Scanner(System.in);

    public void ThemThongTin(ArrayList<DongVat> list) {
        boolean tiepTuc = true;
        while (tiepTuc) {
            System.out.println("ma: ");
            String ma = sc.nextLine();
            System.out.println("ten: ");
            String ten = sc.nextLine();
            System.out.println("Can nang: ");
            float canNang = Float.valueOf(sc.nextLine());
            DongVat dv = new DongVat(ma, ten, true, canNang);
            list.add(dv);
            System.out.print("Ban co muon tiep tuc them khong? (true/false): ");
            tiepTuc = sc.nextBoolean();
            sc.nextLine(); // consume the newline character
        }
    }

    public void xuatThongTIn(ArrayList<DongVat> list) {
        for (DongVat dongVat : list) {
            dongVat.inThongTin();
        }
    }

    public void timLiemTheoTen(ArrayList<DongVat> list) {
        System.out.println("nhap ten dong vat:");
        String dvCanTim = sc.nextLine();

        boolean timThay = false;
        for (DongVat dongVat : list) {
            if (dongVat.getTen().equalsIgnoreCase(dvCanTim)) {
                dongVat.inThongTin();
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("ko tim thay");
        }
    }

    public void sapXepTangDanTheoCanNang(ArrayList<DongVat> list) {
        list.sort((o1, o2) -> Float.compare(o1.getCanNang(), o2.getCanNang()));
        xuatThongTIn(list);
    }

    public void xoaDongVatTheoMaBP(ArrayList<DongVat> list) {
        System.out.println("nhap ma muon xoa");
        String maXoa = sc.nextLine();
        list.removeIf(dv -> dv.getMaDV().equalsIgnoreCase(maXoa));
        if (list.stream().noneMatch(dv -> dv.getMaDV().equalsIgnoreCase(maXoa))) {
            System.out.println("da xoa " + maXoa);
        } else {
            System.out.println("khong tim thay" + maXoa);
        }
    }

    public void lietKeCacViTriSoChan(ArrayList<DongVat> list) {
        int index = 0;
        for (DongVat dongVat : list) {
            if (dongVat.getCanNang() % 2 == 0) {
                System.out.println("vi tri: " + index);
                dongVat.inThongTin();
            }
            index++;
        }
    }

    public void inDongVatCoCanNangLonNhat(ArrayList<DongVat> list) {
        float max = 0;
        for (DongVat dongVat : list) {
            if (dongVat.getCanNang() > max) {
                max = dongVat.getCanNang();
            }
        }
        System.out.println("cac vi tri dong vat lon can nhat");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCanNang() == max) {
                System.out.println("vi tri" + i);
            }
        }
    }

    public void timKiemDongVatTheoCanNangBP(ArrayList<DongVat> list) {
        System.out.println("Can nang toi thieu:");
        float canNangToiThieu = Float.valueOf(sc.nextLine());
        System.out.println("Can nang toi da:");
        float canNangToiDa = Float.valueOf(sc.nextLine());

        boolean timThay = false;
        for (DongVat dongVat : list) {
            if (dongVat.getCanNang() >= canNangToiThieu && dongVat.getCanNang() <= canNangToiDa) {
                dongVat.inThongTin();
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("khong tim thay");
        }
    }

    public void LietKeTop3NheCanNhat(ArrayList<DongVat> list) {
        list.sort((o1, o2) -> Float.compare(o1.getCanNang(), o2.getCanNang()));
        for (int i = 0; i < Math.min(3, list.size()); i++) {
            DongVat dv = list.get(i);
            System.out.println((i+1)+". "+dv.getTen()+" - can nang: "+dv.getCanNang());
        }
    }
}
