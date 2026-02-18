import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Lector {
    public ArrayList<Libro> leer (String archivo) throws Exception{
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))){
            return (ArrayList<Libro> )ois.readObject();


        }
    }
}
