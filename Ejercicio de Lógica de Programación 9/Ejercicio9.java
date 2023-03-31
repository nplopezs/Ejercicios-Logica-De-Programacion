import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Creando  el diccionario
        HashMap<String, String> diccionario = new HashMap<>();
      
        //Agregando las 20 palabras
        diccionario.put("gato","cat");
        diccionario.put("raton","mouse");
        diccionario.put("caballo","horse");
        diccionario.put("perro","dog");
        diccionario.put("pez","fish");
        diccionario.put("conejo","rabbit");
        diccionario.put("computadora","pc");
        diccionario.put("lapiz","pencil");
        diccionario.put("pluma","pen");
        diccionario.put("lentes","glasses");
        diccionario.put("zapatos","shoes");
        diccionario.put("mamá","mother");
        diccionario.put("papá","father");
        diccionario.put("hermano","brother");
        diccionario.put("hermana","sister");
        diccionario.put("cama","bed");
        diccionario.put("almohada","pillow");
        diccionario.put("nube","cloud");
        diccionario.put("pan","bread");
        diccionario.put("leche","milk");
        
        //creando el scanner
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Diccionario Español-Ingles");
        System.out.println("Escribe una palabra para buscar:");
        String palabra = scanner.next().toLowerCase();
       
        //Comprobacion de la palabra en el diccionario
        if(diccionario.containsKey(palabra) == true) {
        	System.out.println("Traduccion: "+ diccionario.get(palabra));
        }else {
        	System.out.println("La palabra no se encuentra en el diccionario");
        }
        
	}//cierre del main

}// cierre de la clase
