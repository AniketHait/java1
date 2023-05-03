package abstractPractice;
abstract class Car {
    // abstract and non-abstract methods
    // they cannot be instantiated -> cannot create object of abstract class

    public abstract void driveCar();
        

    public void switchOnAC() {
        System.out.println("AC is on");
    }
}

class MarutiCar extends Car {

    @Override
    public void driveCar() {
        System.out.println("maruti drive car");
    }

}

class HyundaiCar extends Car {

    @Override
    public void driveCar() {
        System.out.println("hyundai based drive car");
    }
}
public class AbstractPractice {
    public static void main(String[] args) {
        
        Car obj = new MarutiCar();
        obj.driveCar();
        obj.switchOnAC();
    }
}
