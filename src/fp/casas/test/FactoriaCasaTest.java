package fp.casas.test;

import fp.casas.Casas;
import fp.casas.FactoriaCasas;

public class FactoriaCasaTest {

	public static void main(String[] args) {
		FactoriaCasaTest("data/melb_data.csv");
	}
		
		
	private static void FactoriaCasaTest(String Fichero) {
		System.out.println("\nTEST de la creacion de casas");
		try {
			Casas casas = FactoriaCasas.leerCasas(Fichero);
			System.out.println("   Casas: "+ casas);
		} catch(Exception e) {
			System.out.println("Excepción capturada:\n   " + e);	
			}
		

	}

}
