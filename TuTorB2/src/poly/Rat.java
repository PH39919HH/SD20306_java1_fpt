
package poly;


public class Rat {
    //Khai báo các thuộc tính <=> Khai báo biến
    private String name;//tên
    private int weight; //cân nặng
    private int speed; //tốc độ
    
    //Hàm tạo
    public Rat() {
        
    }

    public Rat(String name, int weight, int speed) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
    }
    //Các phương thức set, get

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public void run(){
        System.out.println("Chuột đang chạy với tốc độ "+ speed);
    }
    
}
