package Ludoteca;

public class CartaFrancesa extends Carta
{
    public enum Palo{Picas, Corazones, Tréboles, Diamantes};
    private final Palo palo;
    
    public CartaFrancesa(int v, Palo palo)
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
