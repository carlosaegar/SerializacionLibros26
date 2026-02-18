import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Objects;

public class Escritor {
    public void guardar(List<Libro>libros, String archivo) throws Exception{
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))){
            oos.writeObject(libros);
        }
    }

}
