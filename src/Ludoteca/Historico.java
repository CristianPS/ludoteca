package Ludoteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Historico 
{
    private ArrayList<Jugador> HistJug = new ArrayList();
    private ArrayList<Partida> HistPart = new ArrayList();
    
    
    public void resultados(Jugador J) //terminada
    {
        System.out.println(J.getNombre()+" ha obtenido un total de "+J.getJugadasGanadasBJ()+" al BlackJack y ha perdido "+J.getJugadasPerdidasBJ()+".\nEn las 7 y 1/2 sus resultados son de "+J.getJugadasGanadas7()+"ganadas y de "+J.getJugadasPerdidas7()+"perdidas.\nEl total de partidas empatadas es de "+J.getJugadasEmpatadas());
    }
    
    //No estoy seguro de si funciona de esta forma o habria que editar algo

    /*public int compare(Jugador j1, Jugador j2)
    {
        Double x = j2.getFichasTotales();
        Double y = j1.getFichasTotales();
        return x.compareTo(y);
    }*/

        // Método para imprimir el array de Personas
    public void imprimeArrayJugadores() 
    {
        for (int i=0; i<=HistJug.size(); i++)
        {
            System.out.println((i+1) + ". " + HistJug.get(i).getNombre() + " - FichasTotales: " + HistJug.get(i).getFichasTotales());
        }
    }
    
    public void clasificacion()
    {
        /*Collections.sort(HistJug, new Comparator<Jugador>()
        {
            for(int j=0; j<=HistJug.size(); j++)
            {
                
            }
        int aux = compare(Jugador j1, Jugador j2); 
        });
        
        for(int i=0; i<HistJug.size(); i++)
        {
            System.out.println("Jugador: " +HistJug.get(i).getNombre);
            System.out.println("Fichas totales: " +HistJug.get(i).getNumFichasTotales);
        }*/
    }
    
    public int buscarJugador(String nombre)
    {
        for(Jugador Jug: HistJug)
        {
            if(nombre.equals(Jug.getNombre()))
            {
                resultados(Jug);
                return 0;
            }
        }
        System.out.println("No se encuentra el jugador");
        return -1;
        
    }
    
    public void anadirJugador(Jugador J) //terminada
    {
        HistJug.add(J);
    }
    
    public void anadirPartida(Partida P) //terminada
    {
        HistPart.add(P);
    }
    
    public void listadoPartidas() //terminada
    {
        Partida P =new Partida();
        for (int i=0; i<HistPart.size(); i++)
        {
            P = HistPart.get(i);
            P.toString();
        }
    }
    
    public int numJugadas(Partida P) //terminada
    {
        return P.getNumJugadas();
    }
    
    public void ganadorJugadas(Partida P)
    {
        int ganadas = P.jugadasGanadas();
        String nom="nom";
        P.nombreJugador(nom);
        
        System.out.println("El jugador "+nom+" ha ganado "+ganadas+" partidas");
    }
 
//No termino de comprender esta funcion, puede ser que pida el numero de fichas apostada en una jugada concreta
        //o que quiera en cada jugada las fichas apostadas
        //o el numero de fichas totales
    public double fichasApostadasJugada(Partida P, int numJugada)
    {
        Jugada aux;
        aux=P.devolverJugada(numJugada);
        return aux.getApuesta();
    }
    
    public void fichasApostadasporJugada(Partida P)
    {
        int max=P.numJugadas();
        double fichasApostadas;
        for (int i=0; i<=max; i++)
        {
            fichasApostadas=fichasApostadasJugada(P, i);
            System.out.println("En la jugada numero "+i+" se apostaron "+fichasApostadas+" fichas");
        }
    }
    
    public double fichasApostadasJugadaTotal(Partida P)
    {
        int max=P.numJugadas();
        double fAJugada, fATotal=0.0;
        for (int i=0; i<=max; i++)
        {
            fAJugada=fichasApostadasJugada(P, i);
            fATotal=+fAJugada;
        }
        return fATotal;
    }

//NO TENGO NI IDEA DE QUE HACE ESTA FUNCION PORQUE LA CLASE MANO NO SE RELACIONA EN EL ESQUEMA
    //NI CON LA CLASE HISTORICO NI CON PARTIDA.
    public void cartasManos(Partida P)
    {
        
    }

}
