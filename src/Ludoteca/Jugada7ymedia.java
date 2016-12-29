package Ludoteca;

public abstract class Jugada7ymedia extends Jugada
{
    private Baraja baraja;
    
    public void jugarBanca(){
        
    }
    public void jugarJugador(){
        //Al inicio se apuesta una cantidad mayor o igual que 25
        apostar();        
        //Luego el jugador va pidiento cartas hasta que no quiera mas
        for(int i=0; i<40; i++)
        {
            pedirCarta();
            System.out.println("¿Desea pedir mas cartas? S/N");
            String resp = datos.nextLine();
            if(resp == "S") continue;
            if(resp == "N") break;
        }
    }
    public void añadirMano(m){
    
    }
    
    public Carta pedirCarta(){
        int numeroAleatorio = (int) (Math.random()*baraja.size()+0);
        CartaEspanola c = (CartaEspanola) baraja.get(numeroAleatorio);
        return c;
    }
    
    public void apostar()
    {
        
    }
}
