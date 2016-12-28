package Ludoteca;

public class BarajaEspanola extends Baraja
{
    public BarajaEspanola()
    {
        
        for(int i=0; i<=12; i++)
        {
            for(int j=0; j<=4; i++)
            {
                
                CartaEspanola c = new CartaEspanola(i, j);
                baraja.add(c);
            }
        }
    }
    
    @Override
    public Carta mezclar()
    {
        int numeroAleatorio = (int) (Math.random()*baraja.size()+0);
        CartaEspanola c = (CartaEspanola) baraja.get(numeroAleatorio);
        return c;
    }
}
