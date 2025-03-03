/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thucvat;

/**
 *
 * @author Admin
 */
public class CayLua extends ThucVat {

    private int sanLuongMoiNam;

    public int getSanLuongMoiNam() {
        return sanLuongMoiNam;
    }

    public void setSanLuongMoiNam(int sanLuongMoiNam) {
        this.sanLuongMoiNam = sanLuongMoiNam;
    }

    public CayLua() {
    }

    public CayLua(int sanLuongMoiNam) {
        this.sanLuongMoiNam = sanLuongMoiNam;
    }

    public void display() {
        super.display();
        System.out.println("san luong moi nam: " + sanLuongMoiNam);
        
    }

    public CayLua(int sanLuongMoiNam, String ma, String ten, boolean gioiTinh, double canNang, int chieuCao, String loai) {
        super(ma, ten, gioiTinh, canNang, chieuCao, loai);
        this.sanLuongMoiNam = sanLuongMoiNam;
    }
    
}
