package b1.b;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class ThucVat {

    private String maTV;
    private String ten;
    private int tuoi;
    private double chieuCao;
    private String khuVucSong;

    public ThucVat(String maTV, String ten, int tuoi, double chieuCao, String khuVucSong) {
        this.maTV = maTV;
        this.ten = ten;
        this.tuoi = tuoi;
        this.chieuCao = chieuCao;
        this.khuVucSong = khuVucSong;
    }

    public String getMaTV() {
        return maTV;
    }

    public void setMaTV(String maTV) {
        this.maTV = maTV;
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

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public String getKhuVucSong() {
        return khuVucSong;
    }

    public void setKhuVucSong(String khuVucSong) {
        this.khuVucSong = khuVucSong;
    }

    public ThucVat() {
    }

    public void display() {
        System.out.println("ma thuc vat: " + maTV);
        System.out.println("ten thuc vat: " + ten);
        System.out.println("tuoi: " + tuoi);
        System.out.println("chieu cao: " + chieuCao + " cm");
        System.out.println("khu vuc song: " + khuVucSong);
    }
}
