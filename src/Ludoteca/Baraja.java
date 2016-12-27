package Ludoteca;

import java.util.ArrayList;

//creo que esta clase esta mal hecha, no entiendo porque hay una baraja dentro de baraja.
    //solo deberia estar el abstract  y el ArrayList el resto en BarajaEspañola y BarajaFrancesa
    //voy a comentar lo que creo que esta mal para poder hacer mezclar() de BarajaEspañola
public abstract class Baraja
{
    protected ArrayList<Carta> baraja = new ArrayList();
    /*protected Baraja baraja;
    
    public Baraja getBaraja()
    {
        return baraja;
    }
    
    public void setBaraja(Baraja b)
    {
        baraja = b;
    }*/
    
    public abstract Carta mezclar();
    
}
