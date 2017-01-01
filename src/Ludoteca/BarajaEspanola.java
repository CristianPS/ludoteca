package Ludoteca;

public class BarajaEspanola extends Baraja
{
    public BarajaEspanola()
    {
        //He cambiado esto porque en las siete y media no tiene que haber 8, 9 y 10. De momento lo he separado en dos bucles, seguro que hya una forma mejor de hacerlo pero de momento lo dejo asi.
        
        //He puesto que los bucles empiecen con i y j igual a 1, asi no tenemos carta con valor 0, y tambien si se empieza desde 0 se tendria una carta mas cada vez.
        for(int i=1; i<=7; i++)
        {
            for(int j=1; j<=4; i++)
            {
                
                CartaEspanola c = new CartaEspanola(i, j);
                baraja.add(c);
            }
        }
        
        for(int i=11; i<=13; i++)
        {
            for(int j=1; j<=4; i++)
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
