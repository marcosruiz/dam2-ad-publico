package propiedadesRestringidas;

import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeSupport;
import java.io.Serializable;

public class BeanFuente implements Serializable {
  private VetoableChangeSupport changeSupport;

  // Constructor
  public BeanFuente(){
    changeSupport = new VetoableChangeSupport(this);
  }

  public void addVetoableChangeListener(VetoableChangeListener listener){
    changeSupport.addVetoableChangeListener(listener);
  }

  public void removeVetoableChangeListener(VetoableChangeListener listener){
    changeSupport.removeVetoableChangeListener(listener);
  }
}
