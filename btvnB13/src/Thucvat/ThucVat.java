/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thucvat;

/**
 *
 * @author Admin
 */
public class ThucVat {

    private String ma;
    private String ten;
    private boolean gioiTinh;
    private double canNang;
    private int chieuCao;
    private String loai;

    public ThucVat() {
    }

    public ThucVat(String ma, String ten, boolean gioiTinh, double canNang, int chieuCao, String loai) {
        this.ma = ma;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.canNang = canNang;
        this.chieuCao = chieuCao;
        this.loai = loai;
    }

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

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }

    public int getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(int chieuCao) {
        this.chieuCao = chieuCao;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public void display() {
        System.out.println("ma thuc vat: " + ma);
        System.out.println("ten thuc vat: " + ten);
        System.out.println("Giới tính: " + (gioiTinh ? "Đực" : "Cái"));
        System.out.println("Cân nặng: " + canNang + " kg");
        System.out.println("Chiều cao: " + chieuCao + " cm");
        System.out.println("Loại: " + loai);
    }

    @Override
    public String toString() {
        return "ThucVat{" + "ma=" + ma + ", ten=" + ten + ", gioiTinh=" + gioiTinh + ", canNang=" + canNang + ", chieuCao=" + chieuCao + ", loai=" + loai + '}';
    }

}
