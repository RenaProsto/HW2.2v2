public abstract class ServiceStation {

    public void check(Bicycle bicycle) {
        bicycle.service();
    }

    public void check(Car car) {
        car.service();
    }

    public void check(Truck truck) {
        truck.service();
    }
}