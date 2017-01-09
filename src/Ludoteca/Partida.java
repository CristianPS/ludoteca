/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ludoteca;
import java.util.Date;
import java.util.ArrayList;
/**
 *
 * @authors Jose Ignacio Diaz, Cristian Posada y Jorge Prieto.
 */
public class Partida 
{
    private int num, fichas;
    private static int jugadasTotales;
    private Date fecha = new Date();
    private String juego;
    private ArrayList <Jugada> arrayListJugada = new ArrayList();
    
    public Partida()
    {
        num=0;
        fichas=0;
        jugadasTotales=0;
        juego= null;
        arrayListJugada.clear();
    }
    
    public int getNum()
    {
        return num;
    }
    public void setNum(int n)
    {
        num=n;
    }
    
    public int getFichas()
    {
        return fichas;
    }
    public void setFichas(int f)
    {
        fichas=f;
    }
    
    public static int getJugadasTotales()
    {
        return jugadasTotales;
    }
    public void setJugadasTotales(int pT)
    {
        jugadasTotales=pT;
    }
    
    public Date getFecha()
    {
        return fecha;
    }
    public void setFecha(Date f)
    {
        fecha=f;
    }
    
    public ArrayList<Jugada> getArrayListJugada()
    {
        return this.arrayListJugada;
    }
    public String getJuego()
    {
        return juego;
    }
    public void setJuego(String j)
    {
        juego=j;
    }
    
    public int getNumJugadas()
    {
        return arrayListJugada.size();
    }
    

    public void anadeJugada (Jugada jug)
    {
        arrayListJugada.add(jug);
    }
    
    @Override
    public String toString()
    {
        return "Es una partida de "+juego+" el "+fecha;
    }
    
    //Esta funcion la creo para luego en Historico poder acceder a las victorias en la funcion ganadorJugadas(Partida P)
    public int jugadasGanadas()
    {
        Jugador aux;
        int cont=0;
        
        for (Jugada J: arrayListJugada)
        {
            aux = J.getGanador();
            if (aux.getNombre() != "BANCA")
            {
                cont++;
            } 
        }
        return cont;
    }
    
    //Hago estas funciones porque las creo necesarias
    public void nombreJugador(String nom)
    {
        for(Jugada J: arrayListJugada)
        {
            Jugador aux = new Jugador("BANCA");
            
            if (J.getGanador()!=aux)
            {
                nom=J.getGanador().getNombre();
                break;
            }
        }
    }
    
    public void sumar1aTotalPartidas()
    {
        jugadasTotales++;
    }
    
    public Jugada devolverJugada (int i)
    {
        return arrayListJugada.get(i);
    }
    
    public int numJugadas()
    {
        return arrayListJugada.size();
    }
    
    //Sobrescribo la funcion equals() porque creo que es beneficioso
    public boolean equals(Partida P)
    {
        return P.fecha==this.fecha;
    }
}
