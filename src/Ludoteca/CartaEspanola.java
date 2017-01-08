package Ludoteca;

public class CartaEspanola extends Carta
{
    //public enum Palo{Oros, Bastos, Espadas, Copas};
    //private final Palo palo;
    //Cristian: Aquí hay un problema con el constructor de CartaEspañola, y supongo que tambien con el de carta francesa. Hemos
    //creado un tipo enum Palo, y en el constructor le llegan como argumentos un numero que nos dira el valor y una variable tipo "Palo"
    //Pero en la clase BarajaEspañola, hemos usado un bucle que lo que construye son CartasEspañolas, pero sin un tipo Palo como segundo argumento.
    //Podemos cambiar el constructor de CartaEspañola (y de cartaFrancesa supongo) y poner que el segundo argumento sea un numero también, y luego si queremos
    //que por pantalla se muestre el palo, hacer un switch case tal que si j = 0, -> Oros, si j = 1, -> Bastos, etc.
    //La otra solucion sería cambiar el bucle de la clase BarajaEspañola para que de alguna manera al constructor le entre como segundo argumento un "palo"
    //pero no se me opcurre una buena manera de hacerlo sin repetir codigo y volver a crear una variable enum Palo. A lo mejor tambien es porque estyo espeso, no se.
    //De momento comento lo que creo que habria que quitar y lo cambio por como creo que deberia ir, y ya le dais el visto bueno.
    
    //public CartaEspanola(int v, Palo palo)
    public CartaEspanola (int v, int p)
    {
        super(v, p);
    }
    
    @Override
    public void mostrar()
    {
        System.out.println(valor+" de "+this.palo());
    }
    
    public String palo()
    {
        String Palo = null;
        switch(this.palo)
        {
            case 1: Palo = "Oros";
                break;
            case 2: Palo = "Bastos";
                break;
            case 3: Palo = "Espadas";
                break;
            case 4: Palo = "Copas";
                break;
        }
        return Palo;
    }
}
    
    /*public Palo getPalo()
    {
        return palo;
    }
    
    @Override
    public int getValor()
    {
        super.getValor();
        return valor;
    }
    
    @Override
    public void setValor(int v)
    {
        super.setValor(v);
    }
}

//Cristian: Añadir setPalo y GetPalo, heredados de Clase carta. Lo hago después.
 // He comentado todo esto porque creo que al ser las mismas funciones que la clase carta no hace falta sobreescribirlas no?
*/