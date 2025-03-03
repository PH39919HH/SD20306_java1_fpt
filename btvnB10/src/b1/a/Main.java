
import b1.a.Nguoi;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Nguoi> dsNguoi = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Ten: ");
        String ten = sc.nextLine();
        System.out.print("Tuoi: ");
        int tuoi = Integer.valueOf(sc.nextLine());
        System.out.print("Đia chi: ");
        String diaChi = sc.nextLine();
        sc.nextLine(); 
        Nguoi nguoi = new Nguoi(ten, tuoi, diaChi);
        dsNguoi.add(nguoi);
        for (Nguoi ng : dsNguoi) {
            ng.inThongTin();
        }
    }
}
