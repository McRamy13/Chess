package ejemplobufferedreader;

public class NewMain {

    public static void main(String[] args) {
        LeerFichero fich = new LeerFichero("apache_start.bat");
        System.out.println(fich.getContenido());
    }
}
