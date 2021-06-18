import java.util.Random;
/**
 * Esta clase se encarga de crear formas (Shape) con un criterio determinado
 */
public class ShapeFactory {
  public Shape getShape(){
    Random random = new Random();
    // Generamos un número aleatorio entre 0 y 2
    int randomNumber = random.nextInt(3);
    Shape shape = null;
    if(randomNumber == 0){
      shape = new Rectangle();
    } else if(randomNumber == 1){
      shape = new Circle();
    } else {
      shape = new Square();
    }
    return shape;
  }
}
