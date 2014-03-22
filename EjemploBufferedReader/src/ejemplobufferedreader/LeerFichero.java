
package ejemplobufferedreader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {

    BufferedReader fichOrigen = null;

    public LeerFichero(String nombreFichero) {
        try {
            fichOrigen = new BufferedReader(new FileReader(nombreFichero));
        } catch (FileNotFoundException ex) {
            System.out.println("Error");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Error");
            ex.printStackTrace();
        }
        
    }
    
    public String getContenido() {
        String contenido = "";
        try {
            String linea = fichOrigen.readLine();
            while(linea!=null) {
                contenido += linea + "\n";
                linea = fichOrigen.readLine();        
            }
        } catch (IOException ex) {
            System.out.println("Error");
            ex.printStackTrace();
        }
        return contenido;
    }
}
