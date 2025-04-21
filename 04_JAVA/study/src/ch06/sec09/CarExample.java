package ch06.sec09;

public class CarExample {
    public static void main(String[] args) {
        Car car=new Car("벤츠");
        car.setSpeed(1000);
        System.out.println("setSpeed, getSpeed test - 시속 "+car.getSpeed()+"km/h");
        car.run();
    }
}
