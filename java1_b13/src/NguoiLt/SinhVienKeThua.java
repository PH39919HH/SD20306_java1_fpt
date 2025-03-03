/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NguoiLt;

/**
 *
 * @author Admin
 */
public class SinhVienKeThua extends Nguoi{
    private double diem;
    private String mssv;

    public SinhVienKeThua() {
    }

    public SinhVienKeThua(double diem, String mssv) {
        this.diem = diem;
        this.mssv = mssv;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }
    public void display(){
        System.out.println("ten: "+super.getTen());
        System.out.println("que quan: "+super.getQueQuan());
        System.out.println("sdt: "+super.getSdt());
        System.out.println("email: "+super.getEmail());
        System.out.println("tuoi: "+super.getTuoi());
        System.out.println("gioi tinh: "+super.getGioiTinh());
    }
}
