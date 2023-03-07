import java.io.File;
import java.io.FileNotFoundException;

public class BuscadorArchivos {
    
    public static void buscarArchivo(String rutaArchivo) throws FileNotFoundException {
        
        File archivo = new File(rutaArchivo);
        
        if (!archivo.exists()) {
            throw new FileNotFoundException("No se ha encontrado el archivo en la ruta especificada.");
        }
        
        // si llega hasta aquí es porque el archivo existe
        System.out.println("El archivo ha sido encontrado en la ruta especificada.");
    }
}