package Ludoteca;

public class CartaEspanola extends Carta
{
    public enum Palo{Oros, Bastos, Espadas, Copas};
    private final Palo palo;
    
    public CartaEspanola(int v, Palo palo)
    {
        super(v);
        this.palo = palo;
    }
    
    @Override
    public void mostrar()
    {
        super.mostrar();
        System.out.println(palo);
    }
    
    public Palo getPalo()
    {
        return palo;
    }
    
    @Override
    public int getValor()
    {
        super.getValor();
        return valor;
    }
    
    @Override
    public void setValor(int v)
    {
        super.setValor(v);
    }
}
