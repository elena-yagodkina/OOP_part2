public class ServiceStation {
    public void check(Car car, Bicycle bicycle, Truck truck) {
      if (car != null) {
        System.out.println("Обслуживаем " + car.getModelName());
        for (int i = 0; i < car.getWheelsCount(); i++) {
          ServiceTransport.service(bicycle);
        }
        ServiceTransport.service(car);
      } else if (truck != null) {
        System.out.println("Обслуживаем " + truck.getModelName());
        for (int i = 0; i < truck.getWheelsCount(); i++) {
          ServiceTransport.service(bicycle);
        }
        ServiceTransport.service(car);
        ServiceTransport.service(truck);
      } else if (bicycle != null) {
        System.out.println("Обслуживаем " + bicycle.getModelName());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
          ServiceTransport.service(bicycle);
        }
      }
    }
}
