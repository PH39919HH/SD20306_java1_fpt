
package poly;

import java.util.Arrays;
import java.util.Scanner;


public class Bai1 {

   
    public static void main(String[] args) {
        //n nhập từ bàn phím
        int n;
        Scanner sc = new Scanner(System.in);//Tạo đối tượng Scanner
        System.out.print("Mời nhập số phần tử mảng:");
        n = Integer.parseInt(sc.nextLine());
//       -	Khai báo mảng số thực n phần tử. 
        double [] ar= new double[n];
//-	Nhập các phần tử mảng
        System.out.println("Nhập mảng:");
        for (int i = 0; i < ar.length; i++) {
            System.out.print("Mời nhập phần tử thứ "+ (i+1)+":");
            ar[i]= Double.parseDouble(sc.nextLine());
        }
//-	Xuất mảng: Arrays.toString(ar)
        System.out.println("Xuất mảng:"+ Arrays.toString(ar));
//-	Xuất mảng for i
        System.out.print("Xuất mảng for i:");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+"\t");
        }
//-	Xuất mảng for each
        System.out.print("\nXuất mảng for each:");
        for (double x : ar) {
            System.out.print(x+"\t");
        }
//-	Sắp mảng tăng dần: Arrays.sort(ar)
        Arrays.sort(ar); //sắp tăng
        System.out.println("\nXuất mảng sắp tăng:"+ Arrays.toString(ar));
//-	//Sắp mảng giảm dần
        System.out.println("Sắp giảm:"); 
        for (int i = 0; i < ar.length-1; i++) { //i đi từ đầu đến gần cuối
            for (int j = i+1; j < ar.length; j++) { //j đi từ i+1 đến cuối
                if (ar[i] < ar[j]) { //nếu sai vị trí => đổi chỗ
                    double tmp= ar[i];
                    ar[i]= ar[j];
                    ar[j]= tmp;
                }                
            }            
        }
        System.out.println("\nXuất mảng sắp giảm:"+ Arrays.toString(ar));

//Tính trung bình các phần tử mảng=> Tính tổng. tb= tổng /length
        double tong = 0,tb=0;
        for (double x : ar) {
            tong+=x;
        }
        if (ar.length>0) {
            tb= tong/ar.length;
        }
        System.out.println("TB các phần tử mảng là:"+ tb);
        System.out.printf("TB các phần tử mảng là:%.2f\n", tb);
    }
    
}
