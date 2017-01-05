/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ludoteca;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Pruebaficheros {
    private static String linea;
    public static void main(String args[]) throws FileNotFoundException
    {
        File fichero = new File("C:\\Users\\Cristian\\Documents\\ludoteca\\src\\Ludoteca\\historico.txt");
        FileReader fr = new FileReader(fichero);
        BufferedReader br = new BufferedReader(fr);
        String line;
        
        try 
        {
            linea = "";
            while((line=br.readLine())!=null)
            {
                linea+=line+"\n"; 
                System.out.println(line);
            }
            System.out.println(linea);
            
            
            
        }
        catch (Exception Ex){}
        finally{
            try{
                if(fr != null)
                    fr.close();
            }
            catch (Exception ex2) {}
        }
        
        VentanaHistorico ventanaprueba = new VentanaHistorico(linea);
        
    }
    
    
    public String getString()
    {
        return linea;
    }
    
}
