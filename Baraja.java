package ludoteca;

import java.util.ArrayList;

public abstract class Baraja
{
    protected ArrayList <Cartas> cartas = new ArrayList();
    protected Baraja baraja;
    
    public Baraja getBaraja(){
        return baraja;
    }
    
    public void setBaraja(Baraja b){
        baraja = b;
    }
    
    public abstract void mezclar();
    
}
