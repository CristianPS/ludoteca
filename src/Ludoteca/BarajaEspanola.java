package Ludoteca;

public class BarajaEspanola extends Baraja
{
    public BarajaEspanola()
    {
        //He cambiado esto porque en las siete y media no tiene que haber 8, 9 y 10. De momento lo he separado en dos bucles, seguro que hya una forma mejor de hacerlo pero de momento lo dejo asi.
        for(int i=0; i<=7; i++)
        {
            for(int j=0; j<=4; i++)
            {
                
                CartaEspanola c = new CartaEspanola(i, j);
                baraja.add(c);
            }
        }
        
        for(int i=10; i<=13; i++)
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
