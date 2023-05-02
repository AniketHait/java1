
class Car{
    String brand;
    long price;
    static String type;

    static{
        type="sedan";
        System.out.println("inside static");

    }
    {
        System.out.println("inside inint block");
    }
    public Car(){
        brand="";
        price=0;
        type="hatchback";
        System.out.println("inside constructor");
    }

    public  void display() {
        System.out.println(brand + " " + price + " "+ type);
    }

    public static void show() {
        System.out.println( " "+ type);
    }
}





public class StaticPractice {
    public static void main(String[] args) {
        Car car = new Car();
        // car.price= 10000000;
        // car.type="hatchback";

        car.display();

        Car.show(); 
    }
    
}
