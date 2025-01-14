/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java1_b5;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Java1_b5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("nhap chuc nang:");
            int cn = Integer.valueOf(sc.nextInt());
            if (cn == 0) {
                System.out.println("thoat");
                break;
            }
            switch (cn) {
                case 1: {
                    System.out.println("chuc nang 1:");
                    break;
                }
                case 2: {
                    System.out.println("chuc nang 2:");
                    break;
                }
                case 3: {
                    System.out.println("chuc nang 3:");
                    System.out.println("nhap diem trung binh toan:");
                    int dt = Integer.valueOf(sc.nextInt());
                    System.out.println("nhap diem trung binh ly:");
                    int dl = Integer.valueOf(sc.nextInt());
                    System.out.println("nhap diem trung binh hoa:");
                    int dh = Integer.valueOf(sc.nextInt());
                    int sumTB = (dt + dl + dh) / 3;
                    if (sumTB >= 0 && sumTB < 5) {
                        System.out.println("hoc luc yeu");
                    } else if (sumTB >= 5 && sumTB < 7) {
                        System.out.println("hoc luc gioi");
                    }
                    break;
                }
                case 4: {
                    System.out.println("chuc nang 4:");
                    break;
                }
                default: {
                    System.out.println("chuc nang 5:");
                    break;
                }
            }
        }
    }

}
