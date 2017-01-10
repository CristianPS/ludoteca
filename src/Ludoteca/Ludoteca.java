/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ludoteca;

import java.io.IOException;

/**
 *
 * @author jorge
 */
public class Ludoteca 
{

    private static Historico h;
    public static void main(String[] args) throws IOException 
    {
        //h = new Historico();
        Jugador j1 = new Jugador("Pepito");
        PrimeraVentana pV = new PrimeraVentana(); 
        pV.setVisible(true);
        

    }
    
    public static Historico getHistorico()
    {
        return h;
    }
    
}
