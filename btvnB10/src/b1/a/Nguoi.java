/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b1.a;

/**
 *
 * @author Admin
 */
public class Nguoi {

    private String ten;
    private int tuoi;
    private String diaChi;

    public Nguoi(String ten, int tuoi, String diaChi) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Nguoi() {
    }

    public void inThongTin() {
        System.out.println("ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("dia chi: " + diaChi);
    }
}
