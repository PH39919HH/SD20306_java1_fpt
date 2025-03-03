
package poly;


public class Cat {
    //Khai báo các thuộc tính
    private String name;//tên
    private int speed; //tốc độ
    
    //Hàm tạo

    public Cat() {
    }

    public Cat(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
    //Các phương thức set, get

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public void run(){
        System.out.println("Mèo đang chạy với tốc độ "+speed);
    }
    
    public boolean catchRat(Rat rat){
        if (speed >= rat.getSpeed()) {
            return true;
        } else {
            return false;
        }
    }
    
    public void eatRat(Rat food){
        if (catchRat(food)) {
            //xử lý khi bắt được chuột
            if (food.getWeight()>5) {
                System.out.println("Mum mun, ngon tuyệt");
            } else {
                System.out.println("Mum mun, chuột hơi gầy");
            }
        } else {
            System.out.println("meo meo, đói quá");
        }
    }
}
