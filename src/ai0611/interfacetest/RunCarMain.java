package ai0611.interfacetest;

public class RunCarMain {
    public static void main(String[] args) {
//        인터페이스는 new 연산자로 객체 생성이 불가능합니다.
//        Car car = new Car();
        GENESIS genesis = new GENESIS();
        System.out.println(Car.PRODUCT);
        System.out.println(Car.ADDRESS);
        genesis.start();
        genesis.upSpeed(50);
        genesis.downSpeed(10);
        genesis.rotate("좌");
        genesis.stop();
    }
}
