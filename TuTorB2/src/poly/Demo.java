package poly;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        while (true) {
            System.out.println("--------------------------------");
            System.out.println("|1.                            |");
            System.out.println("|2.                            |");
            System.out.println("|0. Thoát                      |");
            System.out.println("--------------------------------");
            System.out.print("Mời bạn chọn 1 mục:");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("|1.                            |");
                    //lát phục vụ sau
                    break;
                case 2:
                    System.out.println("|2.                            |");
                    //lát phục vụ sau
                    break;
                case 0:
                    System.out.println("|0. Thoát                      |");
                    System.exit(0); //lệnh thoát;
                    break;
                default:
                    System.out.println("Mục bạn chọn không có, vui lòng chọn lại!");                    
                    break;
            }
        }
    }

}
