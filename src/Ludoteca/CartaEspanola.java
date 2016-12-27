package Ludoteca;

public class CartaEspanola extends Carta
{
  private enum palo{Oros, Bastos, Espadas, Copas};
    
  public CartaEspanola(int valor, enum palo)
  {
      this.valor = valor;
      this.palo = palo;
  }
  
  public void setPalo(enum palo)
  {
    this.palo = palo;
  }
  
  public enum getPalo()
  {
    return palo;
  }
  
  public void setValor(int valor)
  {
    this.valor = valor;
  }
  
  public int getValor()
  {
    return valor;
  }
}
