
class Car{
    private String brand;
    private int price;
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    
}
public class encpasulationPractice {
    public static void main(String[] args){
        Car car=new Car();
        car.setBrand("Hyundai");
        System.out.println(car.getBrand());

    }
  

    
}
