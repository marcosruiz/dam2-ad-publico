package eventosPropiedadesRestringidas;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class BeanReceptor implements PropertyChangeListener {

  public void propertyChange(PropertyChangeEvent event){
    System.out.println("Valor anterior: " + event.getOldValue());
    System.out.println("Valor actual: " + event.getNewValue());
  }
}
