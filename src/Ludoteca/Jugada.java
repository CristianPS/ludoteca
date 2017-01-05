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
    private Baraja baraja;
    //Si el ganador es la banca el nombre del Jugador sera BANCA (importante en funciones de otras clases)
    private Jugador ganador;
    private double apuesta;
    protected ArrayList<Mano> ArrayMano = new ArrayList();
    
    public Jugada()
    {
        
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
    
    public abstract void jugarBanca();
    public abstract void jugarJugador(ventanaJuego2 vJ2);
    
    public abstract void apostar(int apuesta); //Cristian: La usan las dos clases que heredan de esta, estaria bien ponerla aqui como metodo abstracto no?
    
}
