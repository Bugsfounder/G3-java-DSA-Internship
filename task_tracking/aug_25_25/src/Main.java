class Car {
    String color;
    String brand;
    void drive(){
        System.out.println("Car is driving...");
    }
}
public class Main{
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.color = "Black";
        myCar.brand = "Maruti";

//        System.out.println(myCar);

        System.out.println(myCar.brand + " " + myCar.color);
    }
}
