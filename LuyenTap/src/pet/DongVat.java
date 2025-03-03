package pet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class DongVat {
    private String maDV,ten;
    private boolean gioiTinh;
    private float canNang;

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public float getCanNang() {
        return canNang;
    }

    public void setCanNang(float canNang) {
        this.canNang = canNang;
    }

    public DongVat() {
    }

    public DongVat(String maDV, String ten, boolean gioiTinh, float canNang) {
        this.maDV = maDV;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.canNang = canNang;
    }
    public void inThongTin(){
        System.out.println("ma dong vat: "+maDV);
        System.out.println("ten dong vat: "+ten);
        System.out.println("gioi tinh: "+gioiTinh);
        System.out.println("can nang: "+canNang);
    }
}
