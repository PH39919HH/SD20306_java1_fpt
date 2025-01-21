/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java1_b6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Java1_b6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //cau1
        System.out.print("moi may nhap:");
        int n = Integer.valueOf(sc.nextLine());
        int arr[] = new int[n];
        System.out.print("nhap cac mang phan tu:");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.valueOf(sc.nextLine());
        }
        System.out.println("in cac phan tu trong mang");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        //cau2
        System.out.println("nhap ");
    }

}
