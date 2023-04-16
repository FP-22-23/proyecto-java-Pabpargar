package fp.casas.test;

import fp.casas.Casas;
import fp.casas.FactoriaCasas;

public class Casastets {

	public static void main(String[] args) {
		Casas casas = FactoriaCasas.leerCasas("data/melb_data.csv");
		testgetSellerg(casas, "Biggin");
		testgetsumacoches(casas, "Footscray");
		testgetcasascodigopostal(casas, 3056.0);
		testgetcasasportype( casas);
		testgetnumroomMethod(casas);
	}
	
	private static void testgetSellerg(Casas casas, String n) {
		try {
			String msg = String.format(
					"Existe el vendedor "+ n + ": "+ casas.getSellerg(n));
			System.out.println(msg);
		} catch (Exception e) {
			System.err.println("Capturada excepción inesperada: " + e.getMessage());
		}		
	}
	private static void testgetsumacoches(Casas casas, String s) {
		try {
			String msg = String.format(
					"Cual es el numero de plazas para coches del barrio "+ 
					s+ ": "+ casas.getsumacoches(s));
			System.out.println(msg);
		} catch (Exception e) {
			System.err.println("Capturada excepción inesperada: " + e.getMessage());
		}		
	}
	
	private static void testgetcasascodigopostal(Casas casas, Double p) {
		try {
			String msg = String.format(
					"Casas con el codigo postal "+ p + ": " + casas.getcasascodigopostal(p));
			System.out.println(msg);
		} catch (Exception e) {
			System.err.println("Capturada excepción inesperada: " + e.getMessage());
		}		
	}
	
	private static void testgetcasasportype(Casas casas) {
		try {
			String msg = String.format(
					"Casas de cada tipo: " +  casas.getcasasportype());
			System.out.println(msg);
		} catch (Exception e) {
			System.err.println("Capturada excepción inesperada: " + e.getMessage());
		}		
	}
	private static void testgetnumroomMethod(Casas casas) {
		try {
			String msg = String.format(
					"Suma de las habitaciones totales poe cada Method:" + casas.getnumroomMethod());
			System.out.println(msg);
		} catch (Exception e) {
			System.err.println("Capturada excepción inesperada: " + e.getMessage());
		}		
	}


}
