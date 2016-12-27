package Ludoteca;

public class Carta {
    
    protected int valor;
    
    public Carta(int v)
    {
        valor = v;
    }
    
    public void mostrar()
    {
        System.out.println(valor);
    }
    
    public void setValor(int v)
    {
        valor = v;
    }
    
    public int getValor()
    {
        return valor;
    }
}

