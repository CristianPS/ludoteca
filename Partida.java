/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ludoteca;
import java.util.Date;
import java.util.ArrayList;
/**
 *
 * @authors Jose Ignacio Diaz, Cristian Posada y Jorge Prieto.
 */
public class Partida 
{
    private int num, fichas;
    private static int partidasTotales;
    private Date fecha = new Date();
    private String juego;
    private ArrayList arrayListJugada = new ArrayList();
    
    
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
    
    public static int getPartidasTotales()
    {
        return partidasTotales;
    }
    public void setPartidaTotales(int pT)
    {
        partidasTotales=pT;
    }
    
    public Date getFecha()
    {
        return fecha;
    }
    public void setFecha(Date f)
    {
        fecha=f;
    }
    
    public String getJuego()
    {
        return juego;
    }
    public void setJuego(String j)
    {
        juego=j;
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
    
}
