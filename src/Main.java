public class Main {
    public static void main(String[] args) {

        Car car = new Car("car",4);
        Car car2 = new Car("car2",4);

        Truck truck = new Truck("truck",6);
        Truck truck2 = new Truck("truck2",8);

        Bicycle bicycle = new Bicycle("bicycle",2);
        Bicycle bicycle2 = new Bicycle("bicycle2",2);


        bicycle.service();
        System.out.println();

        car.service();
        System.out.println();

        truck.service();
    }
}
