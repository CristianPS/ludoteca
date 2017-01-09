package Ludoteca;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Historico 
{
    private ArrayList<Jugador> HistJug = new ArrayList();
    private ArrayList<Partida> HistPart = new ArrayList();
    private final String ruta = "C:\\Users\\Cristian\\Documents\\ludoteca\\src\\Ludoteca\\historico.txt";
    private File fichero = new File(ruta);
    private FileReader fr;
    private BufferedReader br;
    private FileWriter fw;
    private BufferedWriter bw;
    private String linea="";
    
    public static void main(String args[]) throws IOException
    {
        Historico hist = new Historico();
        /*Jugador Jose = new Jugador("Jose");
        Jose.setJugadasEmpatadas(2);
        System.out.println(Jose.getJugadasEmpatadas());
        Jose.setJugadasGanadas7(45);
        System.out.println(Jose.getJugadasGanadas7());
        Jose.setJugadasGanadasBJ(62);
        System.out.println(Jose.getJugadasGanadasBJ());
        Jose.setJugadasPerdidas7(24);
        System.out.println(Jose.getJugadasPerdidas7());
        Jose.setJugadasPerdidasBJ(13);
        System.out.println(Jose.getJugadasPerdidasBJ());
        Jose.setFichasTotales(12000);
        System.out.println(Jose.getFichasTotales());
        hist.anadirJugador(Jose);
        Jugador Pepe = new Jugador("Pepe");
        Pepe.setJugadasEmpatadas(2);
        System.out.println(Pepe.getJugadasEmpatadas());
        Pepe.setJugadasGanadas7(45);
        System.out.println(Pepe.getJugadasGanadas7());
        Pepe.setJugadasGanadasBJ(62);
        System.out.println(Pepe.getJugadasGanadasBJ());
        Pepe.setJugadasPerdidas7(24);
        System.out.println(Pepe.getJugadasPerdidas7());
        Pepe.setJugadasPerdidasBJ(13);
        System.out.println(Pepe.getJugadasPerdidasBJ());
        Pepe.setFichasTotales(12000);
        System.out.println(Pepe.getFichasTotales());
        hist.anadirJugador(Pepe);*/
        //try {
       //VentanaHistorico ven = new VentanaHistorico();
        hist.imprimeArrayJugadores();
        hist.actualizarHistorico();
        Historico h2 = new Historico();
        //} //catch (IOException ex) {
            //Logger.getLogger(Historico.class.getName()).log(Level.SEVERE, null, ex);
        //}
    }
    public Historico() throws IOException
    {       
        try {
            this.fr = new FileReader(fichero);
        } catch (FileNotFoundException ex) {
            System.out.println("Fallo linea 67");
            Logger.getLogger(Historico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try 
        {
            this.br = new BufferedReader(fr);
            String line = "";
            while ((line=br.readLine())!=null)
            {
                char[] c = line.toCharArray();
                int comas=0, j=0;
                String nula = null;
                Jugador j1 = new Jugador(nula);
                //for(int i = c.length; i>=0; i--)
                for(int i = 0; i<c.length;i++)
                {
                    if (comas<=7)
                    {   
                        if (c[i]==',')
                        {
                            comas++;
                            switch(comas)
                            {
                                case 1: j1.setNombre(line.substring(j, i)); break;
                                case 2: j1.setFichasTotales(Integer.parseInt(line.substring(j,i))); break;
                                case 3: j1.setJugadasGanadasBJ(Integer.parseInt(line.substring(j,i))); break;
                                case 4: j1.setJugadasPerdidasBJ(Integer.parseInt(line.substring(j,i))); break;
                                case 5: j1.setJugadasGanadas7(Integer.parseInt(line.substring(j,i))); break;
                                case 6: j1.setJugadasPerdidas7(Integer.parseInt(line.substring(j,i))); break;
                                case 7: j1.setJugadasEmpatadas(Integer.parseInt(line.substring(j,i))); this.HistJug.add(j1); break;
                                
                            }
                            j=i+1;
                        }
                    }
                   
                }
                
                
            }
            br.close();
        }
        catch (Exception Ex) {System.out.println("Excepcion de pollas en vinaguer");}
        
        
    }
            
                
            
    public void actualizarHistorico() throws IOException
    {
        String line="";
        for(Jugador J: HistJug)
        {
            line+=J.getNombre()+","+J.getFichasTotales()+","+J.getJugadasGanadasBJ()+","+J.getJugadasPerdidasBJ()+","+J.getJugadasGanadas7()+","+J.getJugadasPerdidas7()+","+J.getJugadasEmpatadas()+","+"\r\n";
        }
        
        //fichero.delete();
        //fichero.createNewFile();
        this.fw=new FileWriter(fichero);
        this.bw=new BufferedWriter(fw);
        bw.write(line);
        bw.close();
    }
    
    public String resultados(Jugador J) throws IOException //terminada
    {
        /*String line;
        while((line=br.readLine())!=null)
        {
            linea+=line+"\n";
            System.out.println(line);
        }
        
        System.out.println(linea);
        
        if (fr!=null)
            fr.close();*/
        String line = J.getNombre()+" ha obtenido un total de "+J.getJugadasGanadasBJ()+" al BlackJack y ha perdido "+J.getJugadasPerdidasBJ()+".\nEn las 7 y 1/2 sus resultados son de "+J.getJugadasGanadas7()+" ganadas y de "+J.getJugadasPerdidas7()+" perdidas.\nEl total de partidas empatadas es de "+J.getJugadasEmpatadas();
        //VentanaHistorico ventanahistorico = new VentanaHistorico();
        return line;
    }
    
    //No estoy seguro de si funciona de esta forma o habria que editar algo

        // Método para imprimir el array de Personas
    public String imprimeArrayJugadores() 
    {
        String line="";
        for (Jugador Jug: HistJug)
        {
            line+="·" + Jug.getNombre() + " - Fichas Totales: " + Jug.getFichasTotales()+"\n";
        }
        System.out.println(line);
        //VentanaHistorico ventanahistorico = new VentanaHistorico(linea);
        return line;
    }
    
    public String clasificacion()
    {
        String line="";
        Collections.sort(HistJug, new Comparator<Jugador>() {
            @Override
            public int compare(Jugador o1, Jugador o2) {
                return o1.compareTo(o2);
            }
        });
        int i=1;
        for(Jugador j : HistJug)
        {
            line+= i+"-"+(j.getNombre())+"\n";
            i++;
        }
        return line;
    }
    
    public Jugador buscarJugador(String nombre)
    {
        for(Jugador Jug: HistJug)
        {
            if(nombre.equals(Jug.getNombre()))
            {
                /*try {
                    resultados(Jug);
                } catch (IOException ex) {
                    Logger.getLogger(Historico.class.getName()).log(Level.SEVERE, null, ex);
                }*/
                System.out.println("Jugador encontrado.");
                return Jug;
            }

        }
        System.out.println("No se encuentra el jugador");
        String nula = null;
        Jugador nulo = new Jugador(nula);
        return nulo;
        
    }
    
    /*public Jugador getJugador(Jugador j)
    {
        for(Jugador Jug: HistJug)
        {
            if(j.getNombre().equals(Jug.getNombre()))
            {
                /*try {
                    resultados(Jug);
                } catch (IOException ex) {
                    Logger.getLogger(Historico.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Jugador encontrado.");
                return j;
            }

        }
        System.out.println("No se encuentra el jugador");
        String nula = null;
        Jugador nulo = new Jugador(nula);
        return nulo;
        
    }*/
    
    
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
