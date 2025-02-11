/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ph39919_lap14;

import com.sun.jdi.Value;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PH39919_lap14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("hay nhap chuc nang:");
            int chucNang = Integer.valueOf(sc.nextInt());

            switch (chucNang) {
                case 1 -> {
                    System.out.println("hay nhap so nguyen a:");
                    int a = Integer.valueOf(sc.nextInt());
                    System.out.println("hay nhap so nguyen b:");
                    int b = Integer.valueOf(sc.nextInt());
                    int tong = a + b;
                    int hieu = a - b;
                    int tich = a * b;
                    float thuong = (float)a / b;
                    System.out.println("tong la: " + tong);
                    System.out.println("hieu la: " + hieu);
                    System.out.println("tich la: " + tich);
                    System.out.println("thuong la: " + thuong);
                }
                case 2 -> {
                    System.out.println("hay nhap ten:");
                    String ten = sc.nextLine();
                    sc.nextLine();
                    System.out.println("hay nhap mssv:");
                    int mssv = Integer.valueOf(sc.nextInt());
                    System.out.println("hay nhap ky:");
                    int ky = Integer.valueOf(sc.nextInt());
                    System.out.println("hay nhap gioi tich(1=nam,2=nu)");
                    int gioiTinh = Integer.valueOf(sc.nextInt());
                    System.out.println("ten: " + ten);
                    System.out.println("mssv: " + mssv);
                    System.out.println("ky: " + ky);
                    if (gioiTinh == 1) {
                        System.out.println("gioi tich: nam");
                    } else {
                        System.out.println("gioi tich: nu");
                    }

                }
                case 3->{
                    System.out.println("hay nhap so nguyen n:");
                    int n = Integer.valueOf(sc.nextInt());
                    int tich = 1;
                    for (int i = 1; i < n; i+=2) {
                        tich *= i;
                    }
                    System.out.println("tich cac so le la:"+tich);
                }
                case 4->{
                    System.out.println("hay nhap so mang:");
                    int size = Integer.valueOf(sc.nextInt());
                    int arr[] = new int[size];
                    for (int i = 0; i < size; i++) {
                        arr[i] = Integer.valueOf(sc.nextInt());
                        sc.nextLine();
                        
                    }
                    System.out.println("cac phan tu mang:" + arr);
//                    int tong = 0;
//                    for (int i = 0; i < arr[size]; i++) {
//                        
//                    }
                }
                case 0 -> {
                    System.exit(0);
                }
                default -> {
                    System.out.println("chuc nang ko ton tai hay chon lai");
                }

            }
        }
    }

}
