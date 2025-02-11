/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java1_b7;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Java1_b7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("chon chuc nang:");
            int chucNang = Integer.valueOf(sc.nextInt());

            switch (chucNang) {
                case 1 -> {
                    System.out.print("nhap so nguyen a:");
                    int a = Integer.valueOf(sc.nextInt());
                    System.out.print("nhap so nguyen b:");
                    int b = Integer.valueOf(sc.nextInt());
                    int tong = a + b;
                    int tich = a * b;
                    double thuong = (double)a / b;
                    System.out.println("tong so nguyen: " + tong);
                    System.out.println("tich so nguyen: " + tich);
                    System.out.println("thuong so nguyen: " + thuong);
                }
                case 2 -> {
                    System.out.print("nhap ten:");
                    String ten = sc.nextLine();
                    sc.nextLine();
                    System.out.print("nhap tuoi:");
                    int tuoi = Integer.valueOf(sc.nextInt());
                    System.out.print("nhap dia chi:");
                    sc.nextLine();
                    String diaChi = sc.nextLine();
                    System.out.print("nhap hoc ky:");
                    int hocKy = Integer.valueOf(sc.nextInt());
                    System.out.println("ten la: " + ten);
                    System.out.println("tuoi la: " + tuoi);
                    System.out.println("dia chi la: " + diaChi);
                    System.out.println("hoc ky la: " + hocKy);
                }
                case 3 -> {
                    int sum = 0;
                    System.out.print("nhap so nguyen n:");
                    int n = Integer.valueOf(sc.nextInt());
                    for (int i = 0; i < n; i++) {
                         sum +=i;
                    }
                    System.out.println("tong so nguyen: "+sum);
                }
                case 4 -> {
                    int tich= 1;
                    System.out.print("nhap so nguyen n:");
                    int n = Integer.valueOf(sc.nextInt());
                    for (int i = 1; i < n; i+=2) {
                        tich *=i;
                    }
                    System.out.println("tich so nguyen: "+tich);
                }
                case 5 -> {
                    System.out.print("nhap mang:");
                    int size = Integer.valueOf(sc.nextInt());
                    int arr[] = new int[size];
                    System.out.println("nhap cac phan tu mang:");
                    for (int i = 0; i < size; i++) {
                        arr[i] = Integer.valueOf(sc.nextInt());
                        sc.nextLine();
                    }
                    System.out.println("mang theo chieu nguoc:");
                    for (int i = size -1; i >= 0; i--) {
                        System.out.println(arr[i]+" ");
                    }
                }
                case 6 -> {
//                    System.out.println("nhap mang:");
//                    int 
                }
                case 7 -> {

                }
                case 8 -> {

                }
                case 9 -> {

                }
                case 10 -> {

                }
                case 11 -> {

                }
                case 12 -> {

                }
                case 13 -> {

                }
                case 14 -> {

                }
                case 15 -> {

                }
                case 16 -> {

                }
                case 17 -> {

                }
                case 18 -> {

                }
                case 19 -> {

                }
                case 20 -> {

                }
                case 0 -> {
                    System.exit(0);
                }

                default -> {
                    System.out.println("chuc nang khong ton tai hay chon lai");
                }
            }
        }
    }

}
