package Ludoteca;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;

public abstract class Jugada7ymedia extends Jugada
{
    private Mano mano, manobanca;
    
    public Jugada7ymedia(Baraja b, Jugador j)
    {
        super(b, j);
        mano = new Mano();
        manobanca = new Mano();
    }
    
    public int[] repartirJugador(ventanaJuego2 vJ2)
    {
        return new int[2];
    }
    public int[] repartirBanca()
    {
        return new int[2];
    }
    
    @Override
    public void jugarBanca()
    {
        
        Carta c;
        float aux = 0;
        ArrayList<Carta> anadir = new ArrayList();
        while(aux<5)
        {
            if (aux<7.5)
            {
                c = manobanca.pedirCarta(baraja);
                anadir.add(c);
                c.mostrar();
                manobanca.anadirAMano(anadir);
                anadir.clear();
                aux = aux + manobanca.CalcularValor();
                System.out.println("\n"+aux);
            }
            else
            {
                break;
            }
        }
        PuntBan = (float) manobanca.getValorMano();
        ArrayMano.add(manobanca);
    }
    @Override
    public int jugarJugador(ventanaJuego2 vJ2)
    {
        //Al inicio se apuesta una cantidad mayor o igual que 25
        /*Mano mJugador = new Mano();   
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
        PuntJug = (int)mano.CalcularValor();*/
        int salida=0;
        Carta c;
        int opcion = JOptionPane.showConfirmDialog(vJ2, "¿Deseea recibir mas cartas?","¿Deseea recibir mas cartas?", YES_NO_OPTION, QUESTION_MESSAGE);
        if(PuntJug>7.5)
        {
            JOptionPane.showMessageDialog(vJ2, "Tu puntuacion es mayor de 7.5 ("+PuntJug+") por tanto no puedes seguir pidiendo carta");
            
        }
        else
        {
            switch (opcion)
            {
                case 0:
                    c=mano.pedirCarta(baraja);
                    while(cartasSacadas.contains(c))
                    {
                        c= mano.pedirCarta(baraja);
                    }
                    cartasSacadas.add(c);
                    c.mostrar();
                    ArrayList<Carta> manoAux = new ArrayList();
                    manoAux.add(c);
                    mano.anadirAMano(manoAux);
                    break;

                case 1:
                    vJ2.deshabilitarJugar();
                    break;
            }
        }
        PuntJug = (int)mano.CalcularValor();
        System.out.println("\n"+PuntJug);
        ArrayMano.add(mano);
        
        return salida;
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
    public void apostar(int apuesta)
    {        
        if(apuesta<25)
        {
            apuesta=25;
        }
        int ft = ganador.getFichasTotales();
        int ff = ft - apuesta;
        ganador.setFichasTotales(ff);
        System.out.println("Llegó al final");
        System.out.println(ganador.getNombre()+" "+apuesta+" "+ganador.getFichasTotales()+" "+ff);
    }
    
    @Override
    public float getPuntBan()
    {
        return PuntBan;
    }
    
    @Override
    public float getPuntJug()
    {
        return PuntJug;
    }
}

        /*System.out.println("Por favor introduzca su apuesta. Le recordamos que la apuesta minima es de 25 fichas");
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
        return num;*/
