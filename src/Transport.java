public abstract class Transport implements ServiceTransport {
  private String modelName;
  private int wheelsCount;

  public Transport(String modelName, int wheelsCount) {
    this.modelName = modelName;
    this.wheelsCount = wheelsCount;
  }

  public void updateTyre() {
    System.out.println("Меняем покрышку");
  }

  public void checkEngine() {
    System.out.println("Проверяем двигатель");
  }

  public void checkTrailer() {
    System.out.println("Проверяем прицеп");
  }

  public void service() {
    System.out.println("Обслуживаем " + modelName);
    for (int i = 0; i < wheelsCount; i++) {
      updateTyre();
    }
  }
}
