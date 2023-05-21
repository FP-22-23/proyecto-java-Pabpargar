package fp.casas.test;

import fp.casas.Casas;
import fp.casas.FactoriaCasas;
import fp.utiles.Type;

public class Casastets {

	public static void main(String[] args) {
		Casas casas = FactoriaCasas.leerCasas("data/melb_data.csv");
		//testgetSellerg(casas, "Biggin");
		//testgetsumacoches(casas, "Footscray");
		//testgetcasascodigopostal(casas, 3056.0);
		//testgetcasasportype( casas);
		//testgetnumroomMethod(casas);
		//testgetSellergStream(casas, "Biggin");
		//testgetsumacochesStream(casas, "Footscray");
		//testgetcasascodigopostalStream(casas, 3121.0);
		//testgetMaximoPrecioStream(casas, Type.h);
		//testgetFiltrarMethodOrdenarFecha(casas, "VB");
		//testgetCasasPorTypeStream(casas);
		//testgetConjuntoDeSellerStream(casas);
		//testgetMayorLandsizeSegunSiTienePiscina(casas);
		//testgetLasNCasasConMasRoomsPorSuburb(casas, 3);
		testgetSellerMayorPrecio(casas);
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
	private static void testgetSellergStream(Casas casas, String n) {
		try {
			String msg = String.format(
					"Existe el vendedor "+ n + ": "+ casas.getSellergStream(n));
			System.out.println(msg);
		} catch (Exception e) {
			System.err.println("Capturada excepción inesperada: " + e.getMessage());
		}		
	}
	private static void testgetsumacochesStream(Casas casas, String s) {
		try {
			String msg = String.format(
					"Cual es el numero de plazas para coches del barrio "+ 
					s+ ": "+ casas.getsumacochesStream(s));
			System.out.println(msg);
		} catch (Exception e) {
			System.err.println("Capturada excepción inesperada: " + e.getMessage());
		}		
	}
	private static void testgetcasascodigopostalStream(Casas casas, Double p) {
		try {
			String msg = String.format(
					"Casas con el codigo postal "+ p + ": " + casas.getcasascodigopostalStream(p));
			System.out.println(msg);
		} catch (Exception e) {
			System.err.println("Capturada excepción inesperada: " + e.getMessage());
		}		
	}
	private static void testgetMaximoPrecioStream(Casas casas, Type t) {
		try {
			String msg = String.format(
					"Precio mas elevado del tipo "+ t + ": " + casas.getMaximoPrecioStream(t));
			System.out.println(msg);
		} catch (Exception e) {
			System.err.println("Capturada excepción inesperada: " + e.getMessage());
		}		
	}
	private static void testgetFiltrarMethodOrdenarFecha(Casas casas, String method) {
		try {
			String msg = String.format(
					"Metodo : "+ method + " ordenado por fecha " + casas.getFiltrarMethodOrdenarFecha(method));
			System.out.println(msg);
		} catch (Exception e) {
			System.err.println("Capturada excepción inesperada: " + e.getMessage());
		}		
	}
	private static void testgetCasasPorTypeStream(Casas casas) {
		try {
			String msg = String.format(
					"Diccionario de casas segun tipo. " + casas.getCasasPorTypeStream());
			System.out.println(msg);
		} catch (Exception e) {
			System.err.println("Capturada excepción inesperada: " + e.getMessage());
		}		
	}
	private static void testgetConjuntoDeSellerStream(Casas casas) {
		try {
			String msg = String.format(
					"Conjunto de vendedores " + casas.getConjuntoDeSellerStream());
			System.out.println(msg);
		} catch (Exception e) {
			System.err.println("Capturada excepción inesperada: " + e.getMessage());
		}		
	}
	private static void testgetMayorLandsizeSegunSiTienePiscina(Casas casas) {
		try {
			String msg = String.format(
					"Diccionario mayor terreno segun si tiene o no piscina " + casas.getMayorLandsizeSegunSiTienePiscina());
			System.out.println(msg);
		} catch (Exception e) {
			System.err.println("Capturada excepción inesperada: " + e.getMessage());
		}		
	}
	private static void testgetLasNCasasConMasRoomsPorSuburb(Casas casas, Integer n) {
		try {
			String msg = String.format(
					"Los " + n + " mayores numeros de habitaciones por suburb son " + casas.getLasNCasasConMasRoomsPorSuburb(n));
			System.out.println(msg);
		} catch (Exception e) {
			System.err.println("Capturada excepción inesperada: " + e.getMessage());
		}		
	}
	private static void testgetSellerMayorPrecio(Casas casas) {
		try {
			String msg = String.format(
					"Los  mayores numeros de habitaciones por suburb son " + casas.getSellerMayorPrecio());
			System.out.println(msg);
		} catch (Exception e) {
			System.err.println("Capturada excepción inesperada: " + e.getMessage());
		}		
	}
}
