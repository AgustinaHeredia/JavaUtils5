package ListaDirectorio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializarDirectorio {

    public static void main(String[] args) {
        File directorio = new File("/Users/agustinaheredia/Documents");
        serializarDirectorio(directorio);
        deserializarDirectorio();
    }

    public static void serializarDirectorio(File directorio) {
        try (FileOutputStream fos = new FileOutputStream("directorio.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(directorio);
            System.out.println("Directorio serializado correctamente en el archivo directorio.ser");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void deserializarDirectorio() {
    	try {
            FileInputStream fis = new FileInputStream("directorio.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            File[] contenido = (File[]) ois.readObject();
            ois.close();
            fis.close();
            // Aquí se puede hacer algo con el objeto deserializado, como imprimirlo en consola
            for (File archivo : contenido) {
                System.out.println(archivo.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
