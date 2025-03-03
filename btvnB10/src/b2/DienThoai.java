/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b2;

/**
 *
 * @author Admin
 */
public class DienThoai {

    private int ma, boNho, gia;
    private String ten, hang, mau;

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getBoNho() {
        return boNho;
    }

    public void setBoNho(int boNho) {
        this.boNho = boNho;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public DienThoai() {
    }

    public DienThoai(int ma, int boNho, int gia, String ten, String hang, String mau) {
        this.ma = ma;
        this.boNho = boNho;
        this.gia = gia;
        this.ten = ten;
        this.hang = hang;
        this.mau = mau;
    }

    public void inThongTin() {
        System.out.println("Ma dien thoai: " + ma);
        System.out.println("Bo nho dien thoai: " + boNho);
        System.out.println("gia dien thoai: " + gia);
        System.out.println("ten dien thoai: " + ten);
        System.out.println("hang dien thaoi: " + hang);
        System.out.println("mau dien thaoi: " + mau);
    }
}
