package Ludoteca;

import java.util.ArrayList;

public class Mano
{
    protected ArrayList<Carta> mano = new ArrayList();
    protected int valorMano=0;
            
    public Carta pedirCarta(Baraja b)
    {
        Carta c = b.mezclar(); //b.mezclar devuelve la carta siguiente, la que se le da al jugador.
        while(mano.contains(c))
        {
            c = b.mezclar();
            if(!(mano.contains(c)))
            {
                mano.add(c);
            }
        }
        return c;
    }
    
    public int CalcularValor()
    {
        return 0;                
    }
    
    public void sePasa()
    {
        
    }
    
    public ArrayList<Carta> reparte (Baraja b)
    {
        ArrayList<Carta> aux = null;
        Carta c;
        for(int i=0; i<=3; i++)
        {
            c = b.mezclar();
            while(mano.contains(c))
            {
                c = b.mezclar();
                if(!(mano.contains(c)))
                {
                    mano.add(c);
                }
            }
        }
        return aux;
    }
    
    public void añadirAMano (ArrayList<Carta> c)
    {
        for(int i=0; i<=3; i++)
        {
            Carta x = c.get(i);
            mano.add(x);
        }
    }
}