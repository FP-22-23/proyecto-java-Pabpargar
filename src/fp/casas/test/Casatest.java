package fp.casas.test;

import java.time.LocalDate;

import fp.casas.Casa;
import fp.common.Coordenadas;
import fp.utiles.Type;

public class Casatest {

	public static void main(String[] args) {
		Casa c1 = new Casa ("Abbotsford", "85 Turner St",2,Type.h,1480000.0,"S","Biggin",LocalDate.of(2016, 12, 03),2.5,3067.0,2.0,1.0,1.0,202.0, new Coordenadas(-377.996,1449.984),
				true,"jacuzzi/terrace/cinema" );
		Casa c2 = new Casa ("Abbotsford", "25 Bloomburg St",2,Type.h,1035000.0,"S","Biggin",LocalDate.of(2016, 02, 04),2.5,3067.0,2.0,1.0,0.0,156.0, new Coordenadas(-378.079,1449.934),
				true,"jacuzzi/terrace/cinema" );
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1.equals(c2));
		Casa c3 = c2;
		System.out.println(c2.equals(c3));
		
		int r =c1.compareTo(c2);
		System.out.println(r);
		
		int r1 =c2.compareTo(c1);
		System.out.println(r1);
		
		int r2 =c3.compareTo(c2);
		System.out.println(r2);
		
		Casa c4 = new Casa ("Abbotsford", "",2,Type.h,1480000.0,"S","Biggin",LocalDate.of(2016, 12, 03),2.5,3067.0,2.0,1.0,1.0,202.0, new Coordenadas(-377.996,1449.984),
				true,"jacuzzi/terrace/cinema" );
		System.out.println(c4);
		
		


	}

}
