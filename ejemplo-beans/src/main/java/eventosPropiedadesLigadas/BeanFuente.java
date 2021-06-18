package eventosPropiedadesLigadas;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

public class BeanFuente implements Serializable {
  private PropertyChangeSupport propertyChangeSupport;

  private int stockActual;
  private int stockMinimo;

  //Constructor
  public BeanFuente(){
    propertyChangeSupport = new PropertyChangeSupport(this);
  }

  public void addPropertyChangeListener(PropertyChangeListener listener){
    propertyChangeSupport.addPropertyChangeListener(listener);
  }

  public void removePropertyChangeListener(PropertyChangeListener listener){
    propertyChangeSupport.removePropertyChangeListener(listener);
  }


  public int getStockActual() {
    return stockActual;
  }

  public void setStockActual(int stockActual) {
    int valorAnterior = this.stockActual;
    this.stockActual = stockActual;
    if(stockActual < getStockMinimo()){
      propertyChangeSupport.firePropertyChange("stockActual", valorAnterior, stockActual);
    }
  }

  public int getStockMinimo() {
    return stockMinimo;
  }

  public void setStockMinimo(int stockMinimo) {
    this.stockMinimo = stockMinimo;
  }
}
