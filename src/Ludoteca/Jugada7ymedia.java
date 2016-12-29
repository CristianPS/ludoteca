package Ludoteca;

public abstract class Jugada7ymedia extends Jugada
{
    private Baraja baraja;
    private Jugador jugador;
    
    public void jugarBanca(){
        
    }
    public void jugarJugador(){
        //Al inicio se apuesta una cantidad mayor o igual que 25
        apostar();        
        //Luego el jugador va pidiendo cartas hasta que no quiera mas
        for(int i=0; i<40; i++)
        {
            pedirCarta();
            System.out.println("¿Desea pedir mas cartas? S/N");
            Scanner kbd = new Scanner(System.in);
            String resp = kbd.nextLine();
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
        System.out.println("Por favor introduzca su apuesta. Le recordamos que la apuesta minima es de 25 fichas");
        Scanner kbd = new Scanner(System.in);
        int num = kbd.nextLine();
        System.out.println("Su apuesta es: " +num);
        do{
           System.out.println("Lo sentimos, la apuesta no es correcta");
           System.out.println("Por favor introduzca su apuesta. Le recordamos que la apuesta minima es de 25 fichas"); 
           Scanner kbd = new Scanner(System.in);
           int num = kbd.nextLine();
           System.out.println("Su apuesta es: " +num);
        }while(num<25 || num>jugador.getFichasTotales);
    }
}
