/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentap_java1_1;

/**
 *
 * @author Admin
 */
public class XeMay {
    private String maXemMay,ten, hangXe;
    private double giaTien;

    public String getMaXemMay() {
        return maXemMay;
    }

    public void setMaXemMay(String maXemMay) {
        this.maXemMay = maXemMay;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public XeMay() {
    }

    public XeMay(String maXemMay, String ten, String hangXe, double giaTien) {
        this.maXemMay = maXemMay;
        this.ten = ten;
        this.hangXe = hangXe;
        this.giaTien = giaTien;
    }
             
    public void inThongTin(){
        System.out.println("Ma xe may: "+maXemMay);
        System.out.println("Ten xe may: "+ten);
        System.out.println("Hang xe may "+hangXe);
        System.out.println("Gia tien: "+giaTien);
    }
}
