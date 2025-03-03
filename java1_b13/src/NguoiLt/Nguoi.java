/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NguoiLt;

/**
 *
 * @author Admin
 */
public class Nguoi {
    private String ten,queQuan,sdt,email;
    private int tuoi,gioiTinh;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Nguoi() {
    }

    public Nguoi(String ten, String queQuan, String sdt, String email, int tuoi, int gioiTinh) {
        this.ten = ten;
        this.queQuan = queQuan;
        this.sdt = sdt;
        this.email = email;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }
    public void display(){
        System.out.println("ten: " +ten);
        System.out.println("que quan: "+queQuan);
        System.out.println("sdt: "+sdt);
        System.out.println("email: "+email);
        System.out.println("tuoi: "+tuoi);
        System.out.println("gioi tinh: "+gioiTinh);
    }
            
}
