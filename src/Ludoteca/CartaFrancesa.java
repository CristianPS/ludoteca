package Ludoteca;

//Cristian: Aquí lo mismo que con la clase CartaEspañola. Lo modifico igual, comentando lo que creo que habría qu equitar, dadle el visto bueno.
public class CartaFrancesa extends Carta
{
    //public enum Palo{Picas, Corazones, Tréboles, Diamantes};
    //private final Palo palo;
    
    //public CartaFrancesa(int v, Palo palo)
    public CartaFrancesa(int v, int p)
    {
        super(v, p);
        //this.palo = palo;
    }
    
    @Override
    public String mostrar()
    {
        String Palo = null;
        switch (this.palo)
        {
            case 0: Palo = "Picas";                   
            case 1: Palo = "Corazones";                                        
            case 2: Palo = "Tréboles";                                       
            case 3: Palo = "Diamantes";
            default: System.err.println("Error: Carta no válida.");
        }
        //super.mostrar(); //Igual, no se si hay que quitarlo.
        String mostrar = valor +"de" +palo;
        return mostrar;
        //System.out.println(palo);
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
    //Lo mismo que en cartaespañola, creo que no es necesario sobreescribir las funciones set y get.
*/