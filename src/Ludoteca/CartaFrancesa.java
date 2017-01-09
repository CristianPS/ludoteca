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
    public void mostrar()
    {
        /*String Palo = null;
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
        //System.out.println(palo);*/
        System.out.println(valor+ " de " +this.palo());
    }
    
    public String palo()
    {
        String Palo = null;
        switch (this.palo)
        {
            case 1: Palo = "Corazones";  
                break;
            case 2: Palo = "Diamantes"; 
                break;
            case 3: Palo = "Tréboles"; 
                break;
            case 4: Palo = "Picas";
                break;
            default: System.err.println("Error: Carta no válida.");
        }
        
        return Palo;
    }
    
    public int posArray()
    {
        if(palo==1)
        {
            return valor;            
        }
        else if (palo==2)
        {
            return 12+valor;
        }
        else if (palo==3)
        {
            return 25+valor;
        }
        else if(palo==4)
        {
            return 38+valor;
        }
        return -1;
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