/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainliga;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author njarro
 */
public class MainLiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File f=new File("ejemplo.txt");
        int numLigas;
        String nombreLiga;
        int numEquipos;
        ArrayList<Liga>ligas=new ArrayList<>();
        if(f.exists()){
        try{
            Scanner input =new Scanner(f);
            if(input.hasNext()){
                numLigas=input.nextInt();
                System.out.println("Ligas:"+numLigas);
                for(int i=0;i<numLigas;i++){
                    nombreLiga=input.next();
                    Liga liga=new Liga(nombreLiga);
                    if(input.hasNextInt()){
                    numEquipos=input.nextInt();
                    System.out.println("Equipos: "+numEquipos);
                    for(int j=0;j<numEquipos;j++){
                       liga.addEquipo(input.next());
                    }
                    
                    ligas.add(liga);
                    } 
                }
                //Salida
                File archivoSalida=new File ("salida.txt");
                PrintStream salida=null;
                if(!archivoSalida.exists())
                      try {
                          archivoSalida.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(MainLiga.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                    try{
                      
                        salida=new PrintStream(archivoSalida);
                        for(Liga liga :ligas){
                            for(Equipo equipo: liga.getEquipos()){
                               salida.println(equipo.getNombre());
                            }
                            salida.flush();
                            salida.close();
                        }
                    }catch(IOException ex){
                        System.out.println("xdxd");
                        
                    }
                
                //AcabaSalida
            }
        }catch(FileNotFoundException ex){
            System.out.println("Archivo no exsiste");
        }
            
        }
    }
    
} 
    

