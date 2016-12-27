package Ludoteca;

public class CartaEspanola
{
  private enum palo{Oros, Bastos, Espadas, Copas};
    
  public CartaEspanola(int valor, enum palo)
  {
      this.valor = valor;
      this.palo = palo;
  }
}
