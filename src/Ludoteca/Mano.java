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
        int suma;
        int i = mano.size();
        while (i>=0)
        {
            switch (mano)
            {
                case 11: case 12: case 13: case 24: case 25: case 26
            }
            mano.get(i);
            
        }
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