/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thithujava1;

/**
 *
 * @author Admin
 */
public class DongVat {
    private String maDongVat, TenDongVat, NoiSong;
    private int canNang;

    public String getMaDongVat() {
        return maDongVat;
    }

    public void setMaDongVat(String maDongVat) {
        this.maDongVat = maDongVat;
    }

    public String getTenDongVat() {
        return TenDongVat;
    }

    public void setTenDongVat(String TenDongVat) {
        this.TenDongVat = TenDongVat;
    }

    public String getNoiSong() {
        return NoiSong;
    }

    public void setNoiSong(String NoiSong) {
        this.NoiSong = NoiSong;
    }

    public int getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }

    public DongVat() {
    }

    public DongVat(String maDongVat, String TenDongVat, String NoiSong, int canNang) {
        this.maDongVat = maDongVat;
        this.TenDongVat = TenDongVat;
        this.NoiSong = NoiSong;
        this.canNang = canNang;
    }

    @Override
    public String toString() {
        return "DongVat{" + "maDongVat=" + maDongVat + ", TenDongVat=" + TenDongVat + ", NoiSong=" + NoiSong + ", canNang=" + canNang + '}';
    }
    
    public void inThongTin(){
        System.out.println("ma dong vat: "+maDongVat);
        System.out.println("ten dong vat: "+TenDongVat);
        System.out.println("noi song: "+NoiSong);
        System.out.println("can nang: "+canNang);
    } 
}
