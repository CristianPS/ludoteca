package Ludoteca;

import java.util.ArrayList;
import java.util.ListIterator;

public class Historico
{
    private ArrayList<Jugador> HistJug = new ArrayList();
    private ArrayList<Partida> HistPart = new ArrayList();
    
    
    public void resultados(Jugador J) //terminada
    {
        System.out.println(J.getNombre()+" ha obtenido un total de "+J.getJugadasGanadasBJ()+" al BlackJack y ha perdido "+J.getJugadasPerdidasBJ()+".\nEn las 7 y 1/2 sus resultados son de "+J.getJugadasGanadas7()+"ganadas y de "+J.getJugadasPerdidas7()+"perdidas.\nEl total de partidas empatadas es de "+J.getJugadasEmpatadas());
    }
    
    public void clasificacion()
    {
         
    }
    
    public int buscarJugador(String nombre)
    {
        /*int tamHist = HistJug.size();
        ListIterator it = null;
        it=HistJug.listIterator(0);
        
        while (it.hasNext())
        {
            if(it.Jugador.nombre==nombre)
            {
                System.out.println(nombre+" se encuentra en el Historico");
                return 0;
            }
        }
        System.out.println(nombre+" no se encuentra en el Historico");
        return 0;*/
        return 0;
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
        
    }
    
    public int fichasApostadasJugada(Partida P)
    {
        return 0;
    }
    
    public void cartasManos(Partida P)
    {
        
    }

}
