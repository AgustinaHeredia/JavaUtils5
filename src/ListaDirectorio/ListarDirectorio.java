package ListaDirectorio;

import java.io.File;
import java.util.Arrays;

public class ListarDirectorio {

	public static void main(String[] args) {
		
		File directorio = new File("/Users/agustinaheredia/Documents");
		
		String[] nombre_archivos = directorio.list();
		
		Arrays.sort(nombre_archivos);
		
		for(int i = 0; i< nombre_archivos.length; i++) {
			System.out.println(nombre_archivos[i]);
		}
		
	}

}
