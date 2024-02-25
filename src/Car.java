public class Car extends Transport {
  public Car(String modelName, int wheelsCount) {
    super(modelName, 4);
  }

  @Override
  public void service() {
    super.service();
    checkEngine();
  }
}
