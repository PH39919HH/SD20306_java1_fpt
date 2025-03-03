/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b1;

/**
 *
 * @author Admin
 */
public class DongVat {
    private String madDV,ten;
    private int tuoi;
    private double canNang;

    public String getMadDV() {
        return madDV;
    }

    public void setMadDV(String madDV) {
        this.madDV = madDV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }

    public DongVat() {
    }

    public DongVat(String madDV, String ten, int tuoi, double canNang) {
        this.madDV = madDV;
        this.ten = ten;
        this.tuoi = tuoi;
        this.canNang = canNang;
    }
    public void inThongTin(){
        System.out.println("Ma dong vat: "+madDV);
        System.out.println("ten: "+ten);
        System.out.println("tuoi: "+tuoi);
        System.out.println("can nang: "+canNang);
    }
}
