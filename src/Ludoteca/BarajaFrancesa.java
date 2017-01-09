package Ludoteca;

public class BarajaFrancesa extends Baraja
{
    public BarajaFrancesa()
    {
        CartaFrancesa c;
        baraja.clear();
        for(int i=1; i<=12; i++)
        {
            for(int j=1; j<=4; j++)
            {
                c = new CartaFrancesa(i, j);
                baraja.add(c);
            }
        }
    }
    
    @Override
    public Carta mezclar()
    {
        int numeroAleatorio = (int) (Math.random()*baraja.size()+0);
        CartaFrancesa c = (CartaFrancesa) baraja.get(numeroAleatorio);
        return c;
    }
           
    @Override
    public int tamaño()
    {
        return baraja.size();
    }
    
    @Override
    public Carta obtener(int x)
    {
        return baraja.get(x);
    }
}
