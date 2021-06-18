/**
 * Clase principal
 */
public class App {
  final static int TOTAL_SHAPES = 20;

  public static void main(String[] args) {
    System.out.println("Starting...");

    ShapeFactory shapeFactory = new ShapeFactory();

    for (int i = 0; i < TOTAL_SHAPES; i++) {
      Shape shape = shapeFactory.getShape();
      shape.draw();
    }
  }
}
