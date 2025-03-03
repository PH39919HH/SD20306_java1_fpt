/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ph39919_final;

/**
 *
 * @author Admin
 */
public class Animal {
   private String ma;
   private String ten;
   private float canNang;

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

    public float getCanNang() {
        return canNang;
    }

    public void setCanNang(float canNang) {
        this.canNang = canNang;
    }

    public Animal() {
    }

    public Animal(String ma, String ten, float canNang) {
        this.ma = ma;
        this.ten = ten;
        this.canNang = canNang;
    }

    @Override
    public String toString() {
        return "Animal{" + "ma=" + ma + ", ten=" + ten + ", canNang=" + canNang + '}';
    }
    
   public void inThongTin(){
       System.out.println("ma: "+ma);
       System.out.println("ten: "+ten);
       System.out.println("can nang: "+canNang);
   }
           
}
