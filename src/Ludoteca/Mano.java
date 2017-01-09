package Ludoteca;

import java.util.ArrayList;

public class Mano
{
    protected ArrayList<Carta> mano = new ArrayList();
    protected float valorMano;
    
    public Mano()
    {
        mano.clear();
        valorMano=0;
    }
    
    public float getValorMano()
    {
        return valorMano;
    }
    public void resetValorMano()
    {
        valorMano=0;
    }
    
    
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
        i--;
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
    
    public void anadirAMano (ArrayList<Carta> c)
    {
        int num = c.size()-1;
        for(int i=0; i<=num; i++)
        {
            Carta x = c.get(i);
            mano.add(x);
        }
    }
    
    public ArrayList<Carta> getArrayCarta()
    {
        return this.mano;
    }
}