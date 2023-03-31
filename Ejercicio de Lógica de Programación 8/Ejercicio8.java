import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {
	
	public static boolean numPrimo(int n){
		if (n == 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dame 10 numeros enteros");
		int i = 0;
		int [] listaNumeros = new int[10];
		while(i<10) {
			System.out.println("Numero "+i+": ");
			int num = scanner.nextInt();
			listaNumeros[i] = num;
			i++;
		}
		scanner.close();
		//System.out.println(Arrays.toString(listaNumeros));
		
		//Array mostrando la posicion del array y el valor correspondiente
		System.out.println("Mostrando la posicion del array y el valor correspondiente");
		for(int j=0;j<listaNumeros.length;j++) {
			System.out.println("pos["+j+"] = "+ listaNumeros[j]);
		}
		
		//Comprobando si son primos
		System.out.println("Mostrando si son valores primos");
		for(int j=0;j<listaNumeros.length;j++) {
			System.out.println("pos["+j+"] = "+ listaNumeros[j]+ "->" + numPrimo(listaNumeros[j]));
		}
		
		int[] numsPrimos = new int[10];
        int[] numsNoPrimos = new int[10];
        for (int k = 0; k < listaNumeros.length; k++) {
            if (numPrimo(listaNumeros[k]) == true) {
                numsPrimos[k] = listaNumeros[k];
            } else {
                numsNoPrimos[k] = listaNumeros[k];
            }
        }
        
        System.out.println(Arrays.toString(numsPrimos));
        System.out.println(Arrays.toString(numsNoPrimos));
        
        System.out.println("Array ordenado");
        for (int j = 0; j < numsPrimos.length; j++) {
        	System.out.println("pos["+j+"] = "+ numsPrimos[j]);
        }
        
        
        for (int j = 0; j < numsNoPrimos.length; j++) {
        	System.out.println("pos["+j+"] = "+ numsNoPrimos[j]);
        }
		
	}// cierre de main

}// cierre de clase
