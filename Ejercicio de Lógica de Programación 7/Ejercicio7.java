import java.util.Scanner;

public class Ejercicio7 {
	
	private static int calculoMinutos(int numDia, int hora, int minutos) {
		int minfal = 0;
		if(numDia == 0 && hora >= 15){
			return minfal;
		}else {
			minfal= ((numDia*1440) + (hora*60) + minutos) - 900;
		}
		return minfal;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dia de Lunes a Viernes: ");
		String diaSem = scanner.next().toLowerCase();
		
		System.out.println("Hora: ");
		int hora = scanner.nextInt();
		
		System.out.println("Minutos: ");
		int minutos = scanner.nextInt();
		
		System.out.println(diaSem +" " + hora +":" + minutos +" hrs" );
		
		int numDia = 0;
		switch (diaSem) {
        case "lunes":
            numDia = 4;
            break;
        case "martes":
            numDia = 3;
            break;
        case "miercoles":
            numDia = 2;
            break;
        case "jueves":
            numDia = 1;
            break;
        case "viernes":
            numDia = 0;
            break;
        default:
            break;
		}//Cierre switch
		
		int minFaltantes = calculoMinutos(numDia,hora,minutos);
		System.out.println("Faltan "+ minFaltantes +" minutos para el fin de semana");
		
	}//Cierre Main


}// Cierre clase