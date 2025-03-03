/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class DongVat {
    private String maDongVat, ten ;
    private float canNang;

    public String getMaDongVat() {
        return maDongVat;
    }

    public void setMaDongVat(String maDongVat) {
        this.maDongVat = maDongVat;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getCanNang() {
        return canNang;
    }

    public void setCanNang(float canNang) {
        this.canNang = canNang;
    }

    public DongVat() {
    }

    public DongVat(String maDongVat, String ten, float canNang) {
        this.maDongVat = maDongVat;
        this.ten = ten;
        this.canNang = canNang;
    }
    public void inThongTin(){
        System.out.println("Ma dong vat: "+maDongVat);
        System.out.println("Ten dong vat: "+ten);
        System.out.println("Can nang dong vat: "+canNang);
    }
    
    
}
