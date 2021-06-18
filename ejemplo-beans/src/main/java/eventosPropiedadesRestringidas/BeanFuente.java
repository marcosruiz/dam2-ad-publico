package eventosPropiedadesRestringidas;

import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeSupport;
import java.io.Serializable;

public class BeanFuente implements Serializable {
  private VetoableChangeSupport vetoableChangeSupport;

  private int stockActual;
  private int stockMinimo;

  // Constructor
  public BeanFuente() {
    vetoableChangeSupport = new VetoableChangeSupport(this);
  }

  public void addVetoableChangeListener(VetoableChangeListener listener) {
    vetoableChangeSupport.addVetoableChangeListener(listener);
  }

  public void removeVetoableChangeListener(VetoableChangeListener listener) {
    vetoableChangeSupport.removeVetoableChangeListener(listener);
  }

  public int getStockActual() {
    return stockActual;
  }

  public void setStockActual(int stockActual) {
    try {
      int valorAnterior = this.stockActual;
      this.stockActual = stockActual;
      if (stockActual < getStockMinimo()) {
        vetoableChangeSupport.fireVetoableChange("stockActual", valorAnterior, stockActual);
      }
    } catch (PropertyVetoException e) {
      e.printStackTrace();
    }
  }

  public int getStockMinimo() {
    return stockMinimo;
  }

  public void setStockMinimo(int stockMinimo) {
    this.stockMinimo = stockMinimo;
  }
}
