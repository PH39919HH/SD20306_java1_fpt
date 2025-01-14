/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java1_b5;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class lyThuyet {

    //for, do...... while,while
    //for..each, for..each & lamda, for ...each & method reference
    //vong lap:lap di lap lai 1 hanh dong nao day nhieu lan
    //cu phap
    //for(khoi tao gia tri; dien kien; buoc nhay){
    //  code
    //}
//    while(dieu kien){
//    
//}
//    do{
//    code 
//}while(dieu kien){
//    
//}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        cau 1
//        for (int i = 0; i < 101; i++) {
//            System.out.println(i);
//        }
//        cau 2
        System.out.print("nhap so tu nhien:");
        int n = Integer.valueOf(sc.nextInt());
//        for (int i = 0; i < n; i++) {
//            System.out.println(i);
//        }
//        cau 3
        for (int i = 0; i < n + 1; i++) {
            if (i % 2 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
//        cau 4
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
    }

}
