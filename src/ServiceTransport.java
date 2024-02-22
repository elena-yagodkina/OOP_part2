public interface ServiceTransport {
  public static void service(Bicycle bicycle) {
    System.out.println("Меняем покрышку");
  }
  public static void service(Car car) {
    System.out.println("Проверяем двигатель");
  }
  public static void service(Truck truck) {
    System.out.println("Проверяем прицеп");
  }
}
