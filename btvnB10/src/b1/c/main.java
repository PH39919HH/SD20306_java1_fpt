/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b1.c;

import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args) {
        ArrayList<MayTinh> listPC = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("ma may tinh");
        String ma = sc.nextLine();
        System.out.println("ten may tinh:");
        String ten = sc.nextLine();
        System.out.println("dong may:");
        String dongMay =sc.nextLine();
        System.out.println("gia:");
        float gia = Float.valueOf(sc.nextLine());
        MayTinh mayTinh = new MayTinh(ma, ten, dongMay, gia);
        listPC.add(mayTinh);
        for (MayTinh pc : listPC) {
            pc.inThongTin();
        }
    }
}
