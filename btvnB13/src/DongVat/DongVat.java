/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DongVat;

/**
 *
 * @author Admin
 */
public class DongVat {

    private String ma;
    private String ten;
    private int gioiTinh; // 1 - Đực, 2 - Cái
    private int canNang;

    public DongVat(String ma, String ten, int gioiTinh, int canNang) {
        this.ma = ma;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.canNang = canNang;
    }

    public DongVat() {
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

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }

    public void inThongTin() {
        System.out.println("ma dong vat: " + ma);
        System.out.println("ten dong vat: " + ten);
        System.out.println("gioi tinh: " + (gioiTinh == 1 ? "Đực" : "Cái"));
        System.out.println("can nang: " + canNang + " kg");
    }
}
