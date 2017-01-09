package Ludoteca;

import java.util.ArrayList;
import java.util.Scanner;

public class ManoBJ extends Mano
{
    public ManoBJ()
    {
        super();
    }
    
    public float getValorMano()
    {
        return valorMano;
    }
    public void resetValorMano()
    {
        valorMano=0;
    }
    
    @Override
    public CartaFrancesa pedirCarta(Baraja b)
    {
        CartaFrancesa c = (CartaFrancesa) b.mezclar();
        while(mano.contains(c))
        {
            c = (CartaFrancesa) b.mezclar();
            if(!(mano.contains(c)))
            {
                mano.add(c);
            }
        }
        return c;
    }
    
    public float CalcularValor(Jugador j)
    {
        Jugador jAux = new Jugador("Banca");
        int aux=0, numAs=0;
        for(Carta c: mano)
        {
            switch(c.getValor())
            {
                case 1: numAs++;
                case 2: aux=2;
                    break;
                case 3: aux=3;
                    break;
                case 4: aux=4;
                    break;
                case 5: aux=5;
                    break;
                case 6: aux=6;
                    break;
                case 7: aux=7;
                    break;
                case 8: aux=8;
                    break;
                case 9: aux=9;
                    break;
                case 10: aux=10;
                    break;
                case 11:
                case 12:
                case 13: aux=10;
                    break;
            }
            valorMano+=aux;
        }
        
        if(!j.equals(jAux))
        {
        for (int i=0; i<numAs; i++)
            {
                System.out.println("En la mano tienes un total de "+numAs+" ases.");//Modificar para interfaz gráfica.
                aux=hayUnAs();
                valorMano=+aux;
            }
        }
        else 
        {            
            while (numAs>0)
            {
                if (valorMano <= 10)
                {
                    valorMano += 11;
                    numAs--;
                }
                else
                {
                    valorMano += 1;
                    numAs--;
                }
            }
            /*
            if (hayUnAs() == 1)
            {
                if (valorMano+11<=21)
                {
                    valorMano+=11;
                }
                else
                {
                    valorMano+=1;
                }
            }
            else if (valorMano+Aux>21)
            {
                valorMano=+Aux;
            }
            else
            {
                while (Aux>=1)
                {
                    if(valorMano+11>=21 || valorMano+11+Aux-1>21)
                    {
                        valorMano+=1;
                        Aux--;
                    }
                    else
                    {
                        valorMano+=11;
                        Aux--;
                    }
                }
            }*/

        }
        return valorMano;
    }
    
    public int hayUnAs()
    {
        int valorAs;
        Scanner kbd= new Scanner(System.in);
        System.out.println("\n¿Que valor quieres que tome el As?");
        valorAs = kbd.nextInt();
        return valorAs;
    }
    
    
    //imagino que esta funcion será para rectificar la eleccion de valor de un as
    public float reduceValor()//Esta función no esta haciedno lo mismo que la otra? Hace lo mismo que hayUnAs().
    {
        int numAs=0;
        for(Carta c: mano)
        {
            if(c.getValor()==1)
            {
                numAs++;
            }
        }
        int numAscambio=0;
        Scanner kbd= new Scanner(System.in);
        do
        {
            System.out.println("En la mano tienes "+numAs+" ases. ¿Cuantos de esos ases quieres cambiar de valor?");
            numAscambio = kbd.nextInt();
        }
        while (numAscambio<=numAs);
        
        int resta = numAscambio*10;
        valorMano =-resta;
        
        return valorMano;
    }

    public void anadirAMano(ArrayList<Carta> c)
    {
        int num = c.size()-1;
        for(int i=0; i<=num; i++)
        {
            Carta x = c.get(i);
            mano.add(x);
        }
    }
    
    public boolean vacia()
    {
        return mano.isEmpty();
    }
}
