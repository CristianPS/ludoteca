package Ludoteca;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Jugada7ymedia extends Jugada
{
    private Baraja baraja;
    private Jugador jugador;
    private Mano mano, manobanca;
    private int PuntJug, PuntBan;
    private ArrayList<Carta> cartasSacadas = new ArrayList();
    
    @Override
    public void jugarBanca()
    {
        Mano mBanca = new Mano();
        Carta c;
        float aux = 0;
        ArrayList<Carta> anadir = new ArrayList();
        while(aux<5)
        {
            c = mBanca.pedirCarta(baraja);
            anadir.add(c);
            mBanca.añadirAMano(anadir);
            aux = aux + mBanca.CalcularValor();
        }
        PuntBan = (int)manobanca.CalcularValor();
    }
    @Override
    public void jugarJugador()
    {
        //Al inicio se apuesta una cantidad mayor o igual que 25
        Mano mJugador = new Mano();   
        Carta c;
        Scanner kbd = new Scanner(System.in);
        String resp;
        //Luego el jugador va pidiendo cartas hasta que no quiera mas
        for(int i=0; i<40; i++)
        {
            c= mJugador.pedirCarta(baraja);
            while(cartasSacadas.contains(c))
            {
                c= mJugador.pedirCarta(baraja);
            }
            cartasSacadas.add(c);
            System.out.println("¿Desea pedir mas cartas? S/N");//Aqui no podriamos hacer un par de funciones para luego implementarlas en la interfaz grafica? Asi como idea loca, que no me acuerdo muy bien de como se hacian los botones en una interfaz gráfica.
            resp = kbd.nextLine();
            if(resp.equals("S")) continue; //Aqui en vez de que tenga que escribir una S, un boton que ponga "Si" y lo pulses y continue
            if(resp.equals("N")) break;
        }
        PuntJug = (int)mano.CalcularValor();
    }
    public void añadirMano(Mano m)
    {
        ArrayMano.add(m);
    }
    
    /*public Carta pedirCarta(ArrayList cartasSacadas) //He hecho que le llegue como argumento el arrayList de las cartas sacadas, porque si no el array con las cartas sacadas se resetea cada vez que se pida una carta.
    {
        /*int numeroAleatorio = (int) (Math.random()*baraja.size()+0);
        CartaEspanola c = (CartaEspanola) baraja.get(numeroAleatorio);
        return c;
        
        int cs = 0;
        int numeroAleatorio;
        do
        {
            numeroAleatorio = (int) (Math.random()*baraja.tamaño()+0);
            cartasSacadas.add(cs, numeroAleatorio);
        }
        while(cs != 0);
        cartasSacadas.add(numeroAleatorio);
        CartaEspanola c = (CartaEspanola) baraja.obtener(numeroAleatorio);
        return c;
    }*/
    
    @Override
    @SuppressWarnings("empty-statement")
    public int apostar()
    {
        System.out.println("Por favor introduzca su apuesta. Le recordamos que la apuesta minima es de 25 fichas");
        Scanner kbd = new Scanner(System.in);
        int num = kbd.nextInt();
        while(num<25 || num>jugador.getFichasTotales())
        {
            System.out.println("Lo sentimos, la apuesta no es correcta");
            System.out.println("Por favor introduzca su apuesta. Le recordamos que la apuesta minima es de 25 fichas, y que esta no podra superar las fichas de las que disponga."); 
            //Scanner kbd = new Scanner(System.in);
            num = kbd.nextInt();               
        }
        System.out.println("Su apuesta es: " +num);
        return num;
    }
}
