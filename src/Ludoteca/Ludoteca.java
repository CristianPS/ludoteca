/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ludoteca;

/**
 *
 * @author jorge
 */
public class Ludoteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        PrimeraVentana pV = new PrimeraVentana(); 
        PrimeraVentana pV2 = new PrimeraVentana();
        pV.setVisible(true);
        pV2.setVisible(true);
        String nombreJugador = pV.recogerNombre();
        Jugador j1 = new Jugador(nombreJugador);
        int botones = pV.posicionBotones();
        System.out.println(nombreJugador+"\n"+j1.getNombre()+"\n"+botones);
        /*
        switch (botones)
        {
            case -1: System.out.println("Se ha producido un error.");//AQUI YO SACARIA UN ERROR POR PANTALLA
            case 2: 
        }*/
    }
    
}
