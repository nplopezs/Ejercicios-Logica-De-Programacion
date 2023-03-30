import java.util.Scanner;

public class Ejercicio6{

    public static void stringReverse(String str) {
		String strReverso = new StringBuilder(str).reverse().toString();
		System.out.println("Tu cadena al reves: " + strReverso);
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escribe una palabra o una frase: ");
		String cadena = scanner.next();
		
		stringReverse(cadena);
	}
    
}