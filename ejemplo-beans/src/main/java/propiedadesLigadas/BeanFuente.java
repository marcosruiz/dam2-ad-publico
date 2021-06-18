package propiedadesLigadas;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

public class BeanFuente implements Serializable {
  private PropertyChangeSupport changeSupport;

  //Constructor
  public BeanFuente(){
    changeSupport = new PropertyChangeSupport(this);
  }

  public void addPropertyChangeListener(PropertyChangeListener listener){
    changeSupport.addPropertyChangeListener(listener);
  }

  public void removePropertyChangeListener(PropertyChangeListener listener){
    changeSupport.removePropertyChangeListener(listener);
  }
}
