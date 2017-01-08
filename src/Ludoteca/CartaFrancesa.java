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
        System.out.println(valor+" de "+this.palo());       
    }
    
    public String palo()
    {
        String Palo = null;
        switch (this.palo)
        {
            case 1: Palo = "Picas";                   
                break;
            case 2: Palo = "Corazones";                                        
                break;
            case 3: Palo = "Tréboles";                                       
                break;
            case 4: Palo = "Diamantes";
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
    //Lo mismo que en cartaespañola, creo que no es necesario sobreescribir las funciones set y get.
*/