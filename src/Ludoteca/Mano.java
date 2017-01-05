package Ludoteca;

import java.util.ArrayList;

public class Mano
{
    protected ArrayList<Carta> mano = new ArrayList();
    protected float valorMano=0;
    
    
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
    
    public float CalcularValor()
    {       
        int i = mano.size();
        while (i>=0)
        {
            switch (mano.get(i).getValor())
            {
                case 10: case 11: case 12:
                    valorMano += 0.5;
                    i--;
                    break;
                default:
                    valorMano += mano.get(i).getValor();
                    i--;
                    break;
            }                       
        }
        return valorMano;
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