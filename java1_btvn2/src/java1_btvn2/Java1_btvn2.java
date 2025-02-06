/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java1_btvn2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Java1_btvn2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("moi chon chuc nang: ");
            int chucNang = Integer.valueOf(sc.nextLine());
            switch (chucNang) {
                case 1 -> {
                    System.out.println("nhap so nguyen n1:");
                    int soN1 = Integer.valueOf(sc.nextLine());
                    System.out.println("nhap so nguyen n1:");
                    int soN2 = Integer.valueOf(sc.nextLine());
                    System.out.println("nhap so nguyen n1:");
                    int soN3 = Integer.valueOf(sc.nextLine());
                    int tong = soN1 + soN2 + soN3;
                    int tich = soN1 + soN2 + soN3;
                    double tb = (soN1 + soN2 + soN3) / 3;
                    System.out.println("tong ba so nguyen:" + tong);
                    System.out.println("tich ba so nguyen:" + tich);
                    System.out.println("trung binh ba so nguyen:" + tb);
                }
                case 2 -> {
                    System.out.println("nhap ho va ten:");
                    String hoTen = sc.nextLine();
                    System.out.println("nhap tuoi:");
                    int tuoi = Integer.valueOf(sc.nextInt());
                    System.out.println("chon gioi tinh nam(1),nu(2):");
                    int gt = Integer.valueOf(sc.nextInt());
                    sc.nextLine();
                    System.out.println("nhap nghe nghiep:");
                    String nghe = sc.nextLine();
                    System.out.println("ho ten:" + hoTen);
                    System.out.println("tuoi:" + tuoi);
                    if (gt == 1) {
                        System.out.println("gioi tinh: nam");
                    } else {
                        System.out.println("gioi ting: nu");
                    }
                    System.out.println("nghe nghiep:" + nghe);
                }
                case 3 -> {
                    System.out.println("nhap so duong n:");
                    int n = Integer.valueOf(sc.nextInt());
                    sc.nextLine();
                    int tong = 0;
                    for (int i = 0; i <= n; i++) {
                        tong += i;
                    }
                    System.out.println("tong tu 0 den " + n + " la " + tong);
                }
                case 4 -> {
                    System.out.println("nhap so tich n");
                    int n = Integer.valueOf(sc.nextInt());
                    sc.nextLine();
                    int tich = 1;
                    for (int i = 1; i < n; i += 2) {
                        tich *= i;
                    }
                    System.out.println("tich tu 0 den " + n + " la " + tich);
                }
                case 5 -> {
//                    System.out.println("moi nhap mang");
//                    int soNguyen = Integer.valueOf(sc.nextLine());
//                    double[] arr = new double[soNguyen];
//                    System.out.println("moi nhap cac phan tu trong mang");
//                    for (int i = 0; i < soNguyen; i++) {
//                        arr[i] = Double.valueOf(sc.nextLine());
//                    }
//                    for (int i = 0; i < soNguyen; i++) {
//                        System.out.println(arr[i]);
//                    }11
                    System.out.println("moi nhap mang");
                    int size = Integer.valueOf(sc.nextLine());
                    int[] arr = new int[size];
                    System.out.println("nhap cac phan tu cua mang:");
                    for (int i = 0; i < size; i++) {
                        arr[i] = Integer.valueOf(sc.nextInt());
                        sc.nextLine();
                    }
                    System.out.println("mang theo chieu nguoc lai");
                    for (int i = size - 1; i >= 0; i--) {
                        System.out.println(arr[i] + " ");
                    }
                }
                case 6 -> {
                    System.out.println("moi nhap mang");
                    int size = Integer.valueOf(sc.nextLine());
                    int[] arr = new int[size];
                    System.out.println("nhap cac phan tu cua mang");
                    for (int i = 0; i < size; i++) {
                        arr[i] = Integer.valueOf(sc.nextLine());
                    }
                    int tich = 1;
                    for (int i = 1; i < size; i++) {
                        if (arr[i] % 2 == 0) {
                            tich *= arr[i];
                        }
                    }
                    System.out.println("tich cac chan o vi tri le " + tich);
                }
                case 7 -> {
                    
                }
                case 0 -> {
                    System.exit(0);
                }
                default -> {
                    System.out.println("khong co chuc nang này xin chon lai");
                }
            }
        }
    }

}
