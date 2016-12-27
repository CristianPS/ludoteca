package Ludoteca;

public class BarajaFrancesa extends Baraja
{
    public BarajaFrancesa()
    {
        for(int i=0; i<=12; i++)
        {
            for(int j=0; j<=4; i++)
            {
                CartaFrancesa c = new CartaFrancesa(i, j);
                baraja.add(c);
            }
        }
    }
    
    @Override
    public Carta mezclar()
    {
        int numeroAleatorio = (int) (Math.random()*baraja.size()+0);
        CartaFrancesa c = baraja.get(numeroAleatorio);
        return c;
    }
}
