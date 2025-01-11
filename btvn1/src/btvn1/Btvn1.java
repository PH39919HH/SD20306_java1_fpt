/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btvn1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Btvn1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //cau1
        System.out.println("Nhap thong tin ca nhan minh:");
        System.out.print("Nhap ten:");
        String ten = sc.nextLine();
        System.out.print("Nhap dia chi:");
        String diaChi = sc.nextLine();
        System.out.println("ten:" + ten);
        System.out.println("diaChi:" + diaChi);
        //cau2
        System.out.print("nhap diem toan:");
        int diemToan = sc.nextInt();
        System.out.print("nhap diem ly:");
        int diemly = sc.nextInt();
        System.out.print("nhap diem hoa");
        int diemHoa = sc.nextInt();
        System.out.println("diem toan:" + diemToan);
        System.out.println("diem ly:" + diemly);
        System.out.println("diem hoa:" + diemHoa);
        //cau3
        System.out.println("nhap thong tin minh:");
        System.out.print("nhap ten:");
        String tenL = sc.nextLine();
        System.out.print("Nhap dia chi:");
        String diaChiL = sc.nextLine();
        System.out.print("Nhap nganh hoc:");
        String nganhHoc = sc.nextLine();
        System.out.print("Nhap Que quan:");
        String queQuan = sc.nextLine();
        System.out.println("ten:" + tenL);
        System.out.println("dia chi:" + diaChiL);
        System.out.println("Nganh hoc:" + nganhHoc);
        System.out.println("Que quan:" + queQuan);
        //cau4
        System.out.print("nhap so nguyen a:");
        int a = sc.nextInt();
        System.out.print("nhap so nguyen b:");
        int b = sc.nextInt();
        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        double thuong = a / b;
        System.out.println("tong:" + tong);
        System.out.println("hieu" + hieu);
        System.out.println("tich" + tich);
        System.out.println("thuong" + thuong);
        //cau5
        System.out.print("nhap a:");
        int av = sc.nextInt();
        int P = av * 4;
        int S = av * av;
        System.out.println("chu vi hinh vuong:" + P);
        System.out.println("dien tich hinh vuong" + S);
        //cau6
        System.out.print("nhap diem toan:");
        int dt = sc.nextInt();
        System.out.print("nhap diem ly:");
        int dl = sc.nextInt();
        System.out.print("nhap diem hoa:");
        int dh = sc.nextInt();
        int tongDiem = (dt * 1) + (dl * 3) + (dh * 2);
        int tongHeSo = 1 + 3 + 2;
        double diemTB = tongDiem / tongHeSo;
        System.out.println("diem trung binh mon:" + diemTB);
        //cau7
        //cau8
        System.out.print("nhap so tu nhien:");
        int n1 = sc.nextInt();
        if (n1 % 2 == 0) {
            System.out.println(n1+"la so chan");
        } else {
            System.out.println(n1+"la so le");
        }
        //cau9
        int sum = 0;
        System.out.print("nhap so nguyen:");
        int n2 = sc.nextInt();
        for (int i = 0; i < n2; i++) {
            sum += i;
        }
        System.out.println("tong la:" +sum);
        //cau10
        System.out.print("nhap so nguyen:");
        int n3 = sc.nextInt();
        if (n3 % 2 != 0 && n3 % 5 == 0) {
            System.out.println(n3 +"la so le chia het cho 5");
        } else {
            System.out.println(n3+"khong phai so le chia het cho 5");
        }
    }

}
