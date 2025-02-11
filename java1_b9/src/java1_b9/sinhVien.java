/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java1_b9;

/**
 *
 * @author Admin
 */
public class sinhVien {

    private String mssv, ten, nganhHoc, mauKhau;
    private int tuoi, kyHoc, soDuTrongTaiKhoan;

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    public String getMauKhau() {
        return mauKhau;
    }

    public void setMauKhau(String mauKhau) {
        this.mauKhau = mauKhau;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getKyHoc() {
        return kyHoc;
    }

    public void setKyHoc(int kyHoc) {
        this.kyHoc = kyHoc;
    }

    public int getSoDuTrongTaiKhoan() {
        return soDuTrongTaiKhoan;
    }

    public void setSoDuTrongTaiKhoan(int soDuTrongTaiKhoan) {
        this.soDuTrongTaiKhoan = soDuTrongTaiKhoan;
    }

    public sinhVien(String mssv, String ten, String nganhHoc, String mauKhau, int tuoi, int kyHoc, int soDuTrongTaiKhoan) {
        this.mssv = mssv;
        this.ten = ten;
        this.nganhHoc = nganhHoc;
        this.mauKhau = mauKhau;
        this.tuoi = tuoi;
        this.kyHoc = kyHoc;
        this.soDuTrongTaiKhoan = soDuTrongTaiKhoan;
    }

    public sinhVien() {
    }

    public void inThongTin() {
        System.out.println("Ma so sv la: "+mssv);
        System.out.println("Mat khau sv la: "+mauKhau);
        System.out.println("nganh sv la: "+nganhHoc);
        System.out.println("Ten sv la: "+ten);
    }
    
}
