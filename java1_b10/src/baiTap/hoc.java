/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baiTap;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class hoc {

    public static void main(String[] args) {
//        ArrayList<Integer>List=new ArrayList<>();
//        System.out.println(List.size());
//        List.add(5);
//        List.add(15);
//        List.add(25);
//        System.out.println(List.size());
//        List.remove(1);
//        System.out.println(List.size());
//        ArrayList<String> listSt= new ArrayList<>();
//        listSt.add("tr1");
//        listSt.add("tr12");
//        listSt.add("tr13");
//        System.out.println(listSt);
//        listSt.remove(0);
//        listSt.remove("tr12");
//        System.out.println("list luc sau");
//        System.out.println(listSt);
        ArrayList<DongHo> listDH = new ArrayList<>();
        listDH.add(new DongHo("dh1", "ff", "ff", "hong", 3, 4));
        listDH.add(new DongHo("dh2", "ff2", "ff3", "ho3ng", 3, 4));
        listDH.add(new DongHo("dh3", "ff3", "ff2", "ho4ng", 3, 4));
        System.out.println("cach 1");
        for (int i = 0; i < listDH.size(); i++) {
            listDH.get(i).inThongTin();
        }
        System.out.println("cach 2");
        for (DongHo dongHo : listDH) {
            dongHo.inThongTin();
        }
    }
}
