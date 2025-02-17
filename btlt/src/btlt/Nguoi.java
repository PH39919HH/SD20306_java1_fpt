/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btlt;

/**
 *
 * @author Admin
 */
public class Nguoi {

    private String ten, queQuan, ngheNghiep;
    private int tuoi, gioiTinh;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Nguoi() {
    }

    public Nguoi(String ten, String queQuan, String ngheNghiep, int tuoi, int gioiTinh) {
        this.ten = ten;
        this.queQuan = queQuan;
        this.ngheNghiep = ngheNghiep;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }
   
    public void inThongTin() {
        System.out.println("Ten la: " + ten);
        System.out.println("que quan: " + queQuan);
        System.out.println("nghe nghiep: " + ngheNghiep);
        System.out.println("tuoi: " + tuoi);       
    if (gioiTinh == 1) {
        System.out.println("Gioi tinh: Nam");
    } else if (gioiTinh == 2) {
        System.out.println("Gioi tinh: Nu");
    } else {
        System.out.println("Gioi tinh khong hop le.");
    }
        
    }
}
