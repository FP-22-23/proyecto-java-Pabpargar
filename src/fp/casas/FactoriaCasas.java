package fp.casas;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import fp.common.Coordenadas;
import fp.utiles.Checkers;
import fp.utiles.Type;

public class FactoriaCasas {
		/**
		 * 
		 * @param Fichero
		 * @return un objeto de tipo Casas con todos los datos del csv.
		 */
	
		public static Casas leerCasas(String Fichero) {
			Casas res = null;
			try {
				Stream<Casa> sv =
				Files.lines(Paths.get(Fichero))
					.skip(1)
					.map(FactoriaCasas::parseaCasa);
				res = new Casas(sv);
			} catch (IOException e) {
				System.out.println("No se ha encontrado el fichero " + Fichero);
				e.printStackTrace();
			}
			return res;
		}
		public static Casas leerCasass(String Fichero) {
			Casas res = null;
			try {
				Set<Casa> sv = 
					Files.lines(Paths.get(Fichero))
					.skip(1)
					.map(FactoriaCasas::parseaCasa)
					.collect(Collectors.toSet());
				res = new Casas(sv);
			} catch (IOException e) {
				System.out.println("No se ha encontrado el fichero " + Fichero);
				e.printStackTrace();
			}
			return res;
		}
	 
	 public static Casa parseaCasa(String s){
	        Checkers.checkNoNull(s);
	        String [] trozos = s.split(";");
	        Checkers.check("Formato no válido", trozos.length == 18);

	        String suburb= trozos[0].trim();
	        String address = trozos[1].trim();
	        Integer rooms = Integer.parseInt(trozos[2].trim());
	        Type type = Type.valueOf(trozos[3].trim());
	        Double price = Double.parseDouble(trozos[4].trim());
	        String method = trozos[5].trim();
	        String sellerG = trozos[6].trim();
	        LocalDate date = LocalDate.parse(trozos[7].trim(), DateTimeFormatter.ofPattern("d/M/y"));
	        Double distance = Double.parseDouble(trozos[8].trim());
	        Double postcode = Double.parseDouble(trozos[9].trim());
	        Double bedroom2 = Double.parseDouble(trozos[10].trim());
	        Double bathroom = Double.parseDouble(trozos[11].trim());
	        Double car = Double.parseDouble(trozos[12].trim());
	        Double landsize = Double.parseDouble(trozos[13].trim());
	        Double lattitude = Double.parseDouble(trozos[14].trim());
	        Double longtitude = Double.parseDouble(trozos[15].trim());
	        Boolean pool= Boolean.parseBoolean(trozos[16].trim());
	        String otherspace = trozos[17].trim();
	        Coordenadas coordenadas = new Coordenadas(lattitude, longtitude );
	        return new Casa(suburb, address, rooms, type, price,
	        		method, sellerG, date, distance, postcode, bedroom2, bathroom, car, landsize, coordenadas, pool, otherspace);
	 }
}
