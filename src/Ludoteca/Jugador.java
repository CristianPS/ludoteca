/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ludoteca;

/**
 *
 * @authors Jose Ignacio Diaz, Cristian Posada y Jorge Prieto.
 */
public class Jugador implements Comparable<Jugador>
{
    private String nombre;
    private int fichasTotales;
    private int jugadasGanadasBJ, jugadasGanadas7, jugadasPerdidasBJ, jugadasPerdidas7, jugadasEmpatadas;
    
    public Jugador (String n)
    {
        nombre=n;
        fichasTotales=100;
    }
    public Jugador (Jugador j)
    {
        nombre=j.nombre;
        fichasTotales=j.fichasTotales;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String n)
    {
        nombre=n;
    }
    
    public int getFichasTotales()
    {
        return fichasTotales;
    }
    public void setFichasTotales(int ft)
    {
        fichasTotales=ft;
    }
    
    public int getJugadasGanadasBJ()
    {
        return jugadasGanadasBJ;
    }
    public void setJugadasGanadasBJ(int JGBJ)
    {
        jugadasGanadasBJ=JGBJ;
    }
    
    public int getJugadasGanadas7()
    {
        return jugadasGanadas7;
    }
    public void setJugadasGanadas7(int JG7)
    {
        jugadasGanadas7=JG7;
    }

    public int getJugadasPerdidasBJ()
    {
        return jugadasPerdidasBJ;
    }
    public void setJugadasPerdidasBJ(int JPBJ)
    {
        jugadasPerdidasBJ=JPBJ;
    }
    
    public int getJugadasPerdidas7()
    {
        return jugadasPerdidas7;
    }
    public void setJugadasPerdidas7(int JG7)
    {
        jugadasPerdidas7=JG7;
    }
    
    public int getJugadasEmpatadas()
    {
        return jugadasEmpatadas;
    }
    public void setJugadasEmpatadas(int JE)
    {
        jugadasEmpatadas=JE;
    }
    
    public boolean equals(Jugador Jug)
    {
        return(this.nombre.equals(Jug.nombre));            
    }
    
    @Override
    public int compareTo(Jugador o) {
        if(this.getFichasTotales() > o.getFichasTotales())
        {
            return -1;
        }
        if (this.getFichasTotales() < o.getFichasTotales()) {
            return 1;
        }
        return 0;
    }
}
