package ejemplobufferedreader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploBufferedReader {

    public static void main(String[] args) {
        BufferedReader fichOrigen = null;
        try {
            fichOrigen = new BufferedReader(new FileReader("apache_start.bat"));
            String linea = fichOrigen.readLine();
            int numLinea = 1;
            while(linea!=null) {
                //Guardar la línea en otro fichero
                guardarLineaEnOtroFichero(linea, numLinea);
                linea = fichOrigen.readLine();
                numLinea++;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Error");
            ex.printStackTrace();
        }
        
    }
    
    private static void guardarLineaEnOtroFichero(String linea, int numLinea) {
        FileWriter fichSalida = null;
        try {
            fichSalida = new FileWriter("Linea"+numLinea);
            fichSalida.write(linea);
            fichSalida.close();
        } catch (IOException ex) {
            System.out.println("Error");
            ex.printStackTrace();
        }
    }
}
