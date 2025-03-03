
package poly;

import java.util.Scanner;


public class Demo {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//tạo đối tượng Scanner
        int chon; //khai báo biến chọn để lát nhận sự lựa chọn của người dùng
        while (true) {     //luôn làm       
            System.out.println("-----------------------------");
            System.out.println("|1.                         |");
            System.out.println("|2.                         |");
            System.out.println("|0. Thoát                   |");            
            System.out.println("-----------------------------");
            System.out.print("Mời bạn chọn 1 mục:");
            //Đọc vào 1 chuỗi => chuyển chuỗi thành số nguyên
            chon= Integer.parseInt(sc.nextLine());//đọc vào lựa chọn người dùng            
            //Chọn gì phục vụ nấy
            switch(chon){
                case 1:
                    System.out.println("|1.                         |");
                    //lát phục vụ sau
                    break; //Thoát khỏi switch ..case
                case 2:
                    System.out.println("|2.                         |");
                    //lát phục vụ sau
                    break; 
                case 0:
                    System.out.println("Bạn chọn thoát");
                    System.exit(0); //Lệnh thoát
                    break; 
                default:
                    System.out.println("Mục bạn chọn không có, vui lòng chọn lại!");                    
                    break; 
            }
        }
    }
    
}
