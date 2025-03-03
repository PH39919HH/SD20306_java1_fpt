/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luyentap_java1_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        QuanLiXeMay ql = new QuanLiXeMay();
        ArrayList<XeMay> listXM = new ArrayList<>();
        while (true) {
            System.out.println("Chon chuc nang:");
            int chucNang = Integer.valueOf(sc.nextLine());
            switch (chucNang) {
                case 1 -> {
//                    1.Nhập danh sách đối tượng Khi nhập có hỏi tiếp hay ko?
                    ql.nhapDanhSach(listXM);
                }

                case 2 -> {
//                    2.Xuất danh sách đối tượng
                    ql.XuatDanhSach(listXM);
                }

                case 3 -> {
//                    3.Tìm kiếm xe máy trong khoảng giá tiền max, min
                    ql.timKiemXeKhoangMaxMin(listXM);
                }

                case 4 -> {
//                    4.Sắp xếp giảm dần của giá tiền
                    ql.sapXepGiamDanGIa(listXM);
                }
                case 5 -> {
//                    5. Xóa đối tượng theo mã xem máy nhập từ bàn phím
                    ql.XoaMaTuBP(listXM);
                }

                case 6 -> {
//                    6.Sắp xếp tăng dần theo tên
                    ql.sapXepTangDanTen(listXM);
                }

                case 7 -> {
//                    7.Tìm kiếm xe máy trong tên chứa chữ “a”
                    ql.TimXeMayChuA(listXM);
                }

                case 8 -> {
//                    8.Tìm kiếm xe máy hãng bắt đầu bằng “a” và tên chứa chuỗi nhập từ bàn phím
                    ql.TimXeMayBatDauA_BP(listXM);
                }

                case 9 -> {
//                    9.Liệt kê top 3 xe máy có giá lớn nhất và của hãng “Poly”
                    ql.lietKeTop3GiaLonNhat(listXM);
                }

                case 0 -> {
                    System.exit(0);
                }

                default -> {
                    System.out.println("chon lai!");
                }
            }
        }
    }

}
