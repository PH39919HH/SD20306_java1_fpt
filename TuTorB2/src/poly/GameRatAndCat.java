package poly;

public class GameRatAndCat {

    public static void main(String[] args) {
//        Tạo ra một con mèo tên Tom chạy với tốc độ 15. 
//        Cat meo = new Cat();
//        meo.setName("Tom");
//        meo.setSpeed(15);

        Cat meo = new Cat("Tom", 15);
//- Tạo ra một con chuột tên Jerrry, cân nặng 3, chạy với tốc độ 15. 
        Rat chuot = new Rat("Jerry", 3, 15);
        //chuột chạy
        chuot.run();
        //mèo chạy
        meo.run();
//- Cho mèo bắt chuột. 
        boolean kq = meo.catchRat(chuot);
        if (kq) {
            System.out.println("Mèo đã bắt được chuột");
        } else {
            System.out.println("Mèo không bắt được chuột, lêu lêu!");
        }
//- Cho mèo ăn chuột, xem mèo có ăn được chuột không. 
        meo.eatRat(chuot);
        
        
        
    }

}
