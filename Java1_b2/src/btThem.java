
import java.util.Scanner;





/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class btThem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //cau 1
        System.out.println("Nhap thong tin ten,dia chi, nganh hoc, hy hoc:");
        System.out.println("Nhap thong tin ten:");
        String ten = sc.nextLine();
        System.out.println("Nhap thong tin dia chi:");
        String diaChi = sc.nextLine();
        System.out.println("Nhap thong tin nganh hoc:");
        String nganhHoc = sc.nextLine();
        System.out.println("Nhap thong tin ky hoc:");
        int kyhoc = sc.nextInt();
        System.out.println("ten la:" +ten);
        System.out.println("dia chi la:" +diaChi);
        System.out.println("kyHoc la:" +kyhoc);
        System.out.println("Nganh la:" +nganhHoc);
        //cau 2
        System.out.println("Nhap thong tin chieuCao, canNang cua ban than:");
        System.out.println("Nhap thong tin chieu cao:");
        int chieucao = sc.nextInt();
        System.out.println("Nhap thong tin can nang:");
        int canNang = sc.nextInt();
        System.out.println("chieu cao :" + chieucao);
        System.out.println("can nang :" + canNang);
        //cau 3
        System.out.println("nhap so nguyen a:");
        int num1 = sc.nextInt();
        System.out.println("Nhap so nguyen b:");
        int num2 = sc.nextInt();
        
        int sum = num1 +  num2;
        int hieu = num1 - num2;
        int tich = num1 * num2;
        double thuong = num1 / num2;
        System.out.println("tong:"+ sum);
        System.out.println("hieu:"+ hieu);
        System.out.println("tich:" +tich);
        System.out.println("thuong:" +thuong);
        //cau4
        System.out.println("nhap diem toan:");
        int dt = sc.nextInt();
        System.out.println("nhap diem ly:");
        int dl = sc.nextInt();
        System.out.println("nhap diem hoa:");
        int dh = sc.nextInt();
        double dtb = (dt + dl + dh)/3;
        //cau5
        System.out.println("nhap so chieu dai;");
        int cd = sc.nextInt();
        System.out.println("nhap so chieu rong;");
        int cr = sc.nextInt();
        double p = (cd + cr)*2;
        double s = cd * cr;
        System.out.println("chu vi la:"+p);
        System.out.println("dien tich la:"+s);
    }
}
