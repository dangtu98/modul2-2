package thuchanh2;

public class testStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("mazda3","acctic3");

        System.out.println(Car.numberofCars);

        Car car2 = new Car("mazda6","acctic5");
        System.out.println(Car.numberofCars);

        Car car3 = new Car("mazda","acctic44");
        
        System.out.println(Car.numberofCars);
    }
}
