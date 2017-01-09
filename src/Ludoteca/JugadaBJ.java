package Ludoteca;
/*
import java.util.Scanner;
import java.util.ArrayList;

public class JugadaBJ
{
    private Baraja baraja;
    private Jugador jugador;
    private ArrayList<Integer> cartasSacadas = new ArrayList();
    
    @Override
    public void jugarBanca()
    {
        
    }
    @Override
    public void jugarJugador()
    {
        //Al inicio se apuesta una cantidad mayor o igual que 25
        apostar();        
        //Luego el jugador va pidiendo cartas hasta que no quiera mas
        for(int i=0; i<40; i++)
        {
            pedirCarta();
            System.out.println("¿Desea pedir mas cartas? S/N");
            Scanner kbd = new Scanner(System.in);
            String resp = kbd.nextLine();
            if(resp.equals("S")) continue;
            if(resp.equals("N")) break;
        }
    }
    public void añadirMano(Mano m)
    {
    
    }
    
    public Carta pedirCarta()
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
        CartaFrancesa c = (CartaFrancesa) baraja.obtener(numeroAleatorio);
        return c;
    }
    
    public int apostar()
    {
        System.out.println("Por favor introduzca su apuesta. Le recordamos que la apuesta minima es de 10 fichas");
        Scanner kbd = new Scanner(System.in);
        int num = kbd.nextInt();
        System.out.println("Su apuesta es: " +num);
        do{
           System.out.println("Lo sentimos, la apuesta no es correcta");
           System.out.println("Por favor introduzca su apuesta. Le recordamos que la apuesta minima es de 10 fichas"); 
           //Scanner kbd = new Scanner(System.in);
           num = kbd.nextInt();
           System.out.println("Su apuesta es: " +num);
        }while(num<10 || num>jugador.getFichasTotales());
        
        return num;
    }
=======

        
>>>>>>> refs/remotes/origin/Cambios-revisar */
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;
public abstract class JugadaBJ extends Jugada
{
    
    private ManoBJ mano, manobanca;
    
    public JugadaBJ(Baraja b, Jugador j)
    {
        super(b,j);
        mano = new ManoBJ();
        manobanca = new ManoBJ();
    }
    
    
    @Override
    public void jugarBanca()
    {
        Jugador Banca = new Jugador("Banca");
        //Se piden dos cartas obligatoriamnte al principio. Habría que añadirlo tambien a jugada jugador.
        manobanca.pedirCarta(baraja);
        manobanca.pedirCarta(baraja);
        while (manobanca.valorMano<17)
        {
            manobanca.pedirCarta(baraja);
            manobanca.CalcularValor(Banca);
            
        }
               
        PuntBan = (int)manobanca.CalcularValor();
        ArrayManoBanca.add(manobanca);//Habria que añadir las manos aquí no?
    }
    
    @Override
    public void jugarJugador(ventanaJuego2 vJ2)
    {    
        //Luego el jugador va pidiendo cartas hasta que no quiera mas
        /*for(int i=0; i<40; i++)
        {
            //pedirCarta(cartasSacadas);
            mano.pedirCarta(baraja);
            System.out.println("¿Desea pedir mas cartas? S/N");
            Scanner kbd = new Scanner(System.in);
            String resp = kbd.nextLine();
            if(resp.equals("S")) continue;
            if(resp.equals("N")) break;
        }
        PuntJug = (int)mano.CalcularValor();*/
        
        
        //0 si es un SI y 1 si es un NO
        Carta c;
        mano.pedirCarta(baraja);
        mano.pedirCarta(baraja);
        //String escribirCartas="";
        int opcion = JOptionPane.showConfirmDialog(vJ2, "¿Deseea recibir mas cartas?","¿Deseea recibir mas cartas?", YES_NO_OPTION, QUESTION_MESSAGE);
        //aqui no habria que meter un while?????
        switch (opcion)
        {
            case 0:
                c=mano.pedirCarta(baraja);
                while(cartasSacadas.contains(c))
                {
                    c= mano.pedirCarta(baraja);
                }
                cartasSacadas.add(c);
                //String carta = c.mostrar();
                //escribirCartas += carta +"\n";         
                //vJ2.jTextArea2.setText();//SE supone que esto lo que tiene que hacer es camiar el texto del jtext area que he creado para que muestre por texto las cartas pero no se como hacer que pase el texto de est funcion a la ventana 2.
                break;
            case 1:
                vJ2.deshabilitarJugar();
                break;
        }
        PuntJug = (int)mano.CalcularValor();
        ArrayMano.add(mano);
        
    }
    
    public void añadirManoBlackJack(Mano m)
    {
    
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
    public void apostar(int apuesta)
    {        
        if(apuesta<25)
        {
            apuesta=25;
        }
        int ft = ganador.getFichasTotales();
        ganador.setFichasTotales(ft-apuesta);
        System.out.println("Llegó al final");
        
        System.out.println("Hecho");        
    }
    
    @Override
    public int getPuntBan()
    {
        return PuntBan;
    }
    
    @Override
    public int getPuntJug()
    {
        return PuntJug;
    }
}

/*System.out.println("Por favor introduzca su apuesta. Le recordamos que la apuesta minima es de 10 fichas");
        Scanner kbd = new Scanner(System.in);
        int num = kbd.nextInt();
        while(num<10 || num>jugador.getFichasTotales())
        {
            System.out.println("Lo sentimos, la apuesta no es correcta");
            System.out.println("Por favor introduzca su apuesta. Le recordamos que la apuesta minima es de 10 fichas, y que esta no podra superar las fichas de las que disponga."); 
            //Scanner kbd = new Scanner(System.in);
            num = kbd.nextInt();               
        }
        System.out.println("Su apuesta es: " +num);
        
        return num;*/


    
    
    
    

