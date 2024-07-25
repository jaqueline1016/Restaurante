/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplopractica2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 *  * @author jgcal
 */
class Registro implements Serializable {
    
    
    String dato2;
    int dato1;
    String dato3;
    String dato4;
    String dato5;
    
   

    
    public Registro (){
        this("GABY", 100,"","","");
    }
    
    public Registro( String dato2, int dato1 ,String dato3,String dato4,String dato5) {
        this.dato1 = dato1;
        this.dato2 = dato2;
        this.dato3 = dato3;
        this.dato4 = dato4;
        this.dato5 = dato5;
        System.out.println("estoy en la serializacion");
    }
    
    public String toString(){
        return dato2 + " " + dato1 + " " + dato3 + " " + dato4 + " " + dato5;
        
    }

}

public class Serializar {

    public static void main(String[] args) {
        
        /*
         try {
                FileOutputStream archivo = new FileOutputStream("Respaldo.bin");
                ObjectOutputStream salida = new ObjectOutputStream(archivo);
                Registro R = new Registro (7, "895");
                salida.writeObject(R);
                salida.close();
                archivo.close();
                System.out.println("Se ha respaldo su programa en: Respaldo.bin");
                
                FileInputStream archivoread = new FileInputStream("Respaldo.bin");
                ObjectInputStream entrada = new ObjectInputStream(archivoread);

                Registro R1 = (Registro) entrada.readObject();
                System.out.println(R1.dato1);                
                archivo.close();
                
                
                
                
            } catch (Exception e) {
                System.out.println(e);
            }
         
         */
                
            
        
    }
        
        
      /*
        private void escribirBinario(){    
        // serializar
        /*
            Registro[] registros = {
                new Registro(7, "GABY"),
                new Registro(2, "TRES ANIMALES")
                }; 
        
            try {
                FileOutputStream archivo = new FileOutputStream("Respaldo.bin");
                ObjectOutputStream salida = new ObjectOutputStream(archivo);
                Registro R = new Registro (7, "895");
                salida.writeObject(R);
                salida.close();
                archivo.close();
                System.out.println("Se ha respaldo su programa en: Respaldo.bin");
            } catch (Exception e) {
                System.out.println(e);
            }
        
        }*/
        /*
         private void leerBinario(){   
        // deserializar
        Registro[] registros;
        try {
            FileInputStream archivo = new FileInputStream("Respaldo.bin");
            ObjectInputStream entrada = new ObjectInputStream(archivo);
            
            registros =  (Registro[]) entrada.readObject();
            entrada.close();
            archivo.close();
            // mostrar registros cargados
            for (Registro registro : registros) {
                System.out.println(registro.dato1 + " " + registro.dato2);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
         
        
         }*/

    
}

