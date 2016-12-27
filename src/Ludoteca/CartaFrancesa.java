package Ludoteca;

//La funcion ocultar no entiendo muy bien lo que hace, asi que nos tocara debatirlo

public class CartaFrancesa extends Carta
{
  private enum palo{Picas, Diamantes, Corazones, Tréboles};
    
  public CartaFrancesa(int valor, enum palo)
  {
      this.valor = valor;
      this.palo = palo;
  }
    
  public void setValor(int valor)
  {
      this.valor = valor;
  }
    
  public void ocultar();    
    
}
