/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baiTap;

/**
 *
 * @author Admin
 */
public class DongHo {

    private String ma, ten, hang, mauSac;
    private float gia;
    private int soNamBaoHanh;

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
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

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public int getSoNamBaoHanh() {
        return soNamBaoHanh;
    }

    public void setSoNamBaoHanh(int soNamBaoHanh) {
        this.soNamBaoHanh = soNamBaoHanh;
    }

    public DongHo() {
    }

    public DongHo(String ma, String ten, String hang, String mauSac, float gia, int soNamBaoHanh) {
        this.ma = ma;
        this.ten = ten;
        this.hang = hang;
        this.mauSac = mauSac;
        this.gia = gia;
        this.soNamBaoHanh = soNamBaoHanh;
    }

    public void inThongTin() {
        System.out.println("Ma la: " + ma);
        System.out.println("ten la:" + ten);
        System.out.println("hang la:" + hang);
        System.out.println("mau sac la: " + mauSac);
        System.out.println("gia la: " + gia);
        System.out.println("so nam bao hanh la: " + soNamBaoHanh);
    }
}
