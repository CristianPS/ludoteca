package Ludoteca;

import java.util.ArrayList;


public abstract class Baraja
{
    protected ArrayList<Carta> baraja = new ArrayList();

    public abstract Carta mezclar();
    public abstract int tamaño();
    public abstract Carta obtener(int x);
    
}