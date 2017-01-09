package Ludoteca;
//Cristian: He añadido palo como argumento a los constructores, mas explicacion en clase CartaEspañola.
public class Carta {
    
    protected int valor;
    protected int palo;
    
    public Carta(int v, int p)
    {
        valor = v;
        palo = p;
    }
    
    // ESTA CLAS ESTA MAL, AL HACER LA INTERFAZ GRAFICA TENEMOS QUE MODIFICARLA
    public String mostrar()
    {
        String Palo = null;
        String mostrar = valor +"de" +palo;
        return mostrar;
    }
    
    public void setValor(int v)
    {
        valor = v;
    }
    
    public void setPalo (int p)
    {
        palo = p;
    }
    
    public int getValor()
    {
        return valor;
    }
    
    public int getPalo()
    {
        return palo;
    }
}

