package Ludoteca;

import java.util.Scanner;

public class ManoBJ extends Mano
{
    @Override
    public int CalcularValor()
    {
        int aux=0, numAs=0;
        for(Carta c: mano)
        {
            switch(c.getValor())
            {
                case 1: numAs++;
                case 2: aux=2;
                    break;
                case 3: aux=3;
                    break;
                case 4: aux=4;
                    break;
                case 5: aux=5;
                    break;
                case 6: aux=6;
                    break;
                case 7: aux=7;
                    break;
                case 8: aux=8;
                    break;
                case 9: aux=9;
                    break;
                case 10: aux=10;
                    break;
                case 11:
                case 12:
                case 13: aux=10;
                    break;
            }
            valorMano=+aux;
        }
        for (int i=0; i<=numAs; i++)
        {
            System.out.println("En la mano tienes un total de "+numAs+" ases.");
            aux=hayUnAs();
            valorMano=+aux;
        }
        return valorMano;
    }
    
    public int hayUnAs()
    {
        int valorAs;
        Scanner kbd= new Scanner(System.in);
        System.out.println("\n¿Que valor quieres que tome el As?");
        valorAs = kbd.nextInt();
        return valorAs;
    }
    
    
    //imagino que esta funcion será para rectificar la eleccion de valor de un as
    public int reduceValor()
    {
        int numAs=0;
        for(Carta c: mano)
        {
            if(c.getValor()==1)
            {
                numAs++;
            }
        }
        int numAscambio=0;
        Scanner kbd= new Scanner(System.in);
        do
        {
        System.out.println("En la mano tienes "+numAs+" ases. ¿Cuantos de esos ases quieres cambiar de valor?");
        numAscambio = kbd.nextInt();
        }
        while (numAscambio<=numAs);
        
        int resta = numAscambio*10;
        valorMano =-resta;
        
        return valorMano;
    }
}
