/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ludoteca;
import java.util.ArrayList;

/**
 *
 * @authors Jose Ignacio Diaz, Cristian Posada y Jorge Prieto.
 */
public abstract class Jugada 
{
    protected Baraja baraja;
    //Si el ganador es la banca el nombre del Jugador sera BANCA (importante en funciones de otras clases)
    protected Jugador ganador;
    protected double apuesta;
    protected float PuntJug, PuntBan;
    protected ArrayList<Mano> ArrayMano = new ArrayList();
    protected ArrayList<Carta> cartasSacadas = new ArrayList();
    protected ArrayList<Mano> ArrayManoBanca = new ArrayList();
    
    public Jugada(Baraja b, Jugador j)
    {
        baraja=b;
        ganador = new Jugador(j);
        apuesta=0;
        PuntJug=0;
        PuntBan=0;
        ArrayMano.clear();
        cartasSacadas.clear();
    }
    public Baraja getBaraja()
    {
        return baraja;
    }
    public void setBaraja(Baraja b)
    {
        baraja=b;
    }
    
    public Jugador getGanador()
    {
        return ganador;
    }
    public void setGanador(Jugador j)
    {
        ganador=j;
    }
    
    public double getApuesta()
    {
        return apuesta;
    }
    public void setApuesta(double a)
    {
        apuesta=a;
    }

    public abstract int[] repartirJugador(ventanaJuego2 vJ2);
    public abstract int[] repartirBanca();
    public abstract int[] jugarBanca();
    public abstract int[] jugarJugador(ventanaJuego2 vJ2);
    public abstract float getPuntBan();
    public abstract float getPuntJug();
    
    public abstract int apostar(int apuesta, ventanaJuego2 vJ2); //Cristian: La usan las dos clases que heredan de esta, estaria bien ponerla aqui como metodo abstracto no?
    
}
