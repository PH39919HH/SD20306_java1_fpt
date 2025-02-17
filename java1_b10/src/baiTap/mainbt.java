/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baiTap;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class mainbt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Tao class DongHo gom cac thuoc tinh ma - String, ten - String, hang -
         * String gia - float, mauSac- String, soNamBaoHanh - int va cac
         * contructor, getter, setter va ham inThongTin(): void Tao class Main:
         * Nhap tt cua 1 doi tuong dong ho va in ra man hinh
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma: ");
        String ma = sc.nextLine();

        System.out.println("Nhap ten: ");
        String ten = sc.nextLine();

        System.out.println("Nhap hang: ");
        String hang = sc.nextLine();

        System.out.println("Nhap gia: ");
        float gia = Float.parseFloat(sc.nextLine());

        System.out.println("Nhap mau sac: ");
        String maSac = sc.nextLine();

        System.out.println("Nhap so nam bao hanh: ");
        int soNamBaoHanh = Integer.parseInt(sc.nextLine());
        DongHo dh = new DongHo(ma, ten, hang, maSac, gia, soNamBaoHanh);
        dh.inThongTin();
    }

}
