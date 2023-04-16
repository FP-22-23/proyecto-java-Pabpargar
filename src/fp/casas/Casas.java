package fp.casas;

import java.util.ArrayList;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import fp.utiles.Type;

public class Casas {
	
	private Set<Casa> casas;
	
	public Casas() {
		this.casas = new HashSet<Casa>();
	}
	
	public Casas(Stream<Casa> casas) {
		this.casas = casas.collect(Collectors.toSet());
	}
	
	public void añadirCasa(Casa casa) {
		this.casas.add(casa);
	}
	
	public Integer getnumeroCasa() {
		return casas.size();
	}
	
	public void añadircasas(Collection<Casa> casa) {
		casas.addAll(casa);
	}
	
	public void eliminarcasa(Casa casa) {
		casas.remove(casa);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((casas == null) ? 0 : casas.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Casas other = (Casas) obj;
		if (casas == null) {
			if (other.casas != null)
				return false;
		} else if (!casas.equals(other.casas))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Casas [casas=" + casas + "]";
	}
	
	
	/**
	 * 
	 * @param seller
	 * @return true si el valor pasado por parametro existe en al menos un objeto del csv.
	 */
	public Boolean getSellerg(String seller){
		Boolean res = false;
		for(Casa p: casas) {
			if (p.getSellerG().equals(seller)){
				res= true;
				break;
			}
		}
		return res;
	}
	/**
	 * 
	 * @param suburb
	 * @return la suma de las plazas de garajes en un barrio.
	 */
	public Double getsumacoches(String suburb) {
		Double suma =0.0;
		Double cont =0.0;
		Double res =0.0;
		for (Casa p: casas) {
			if (p.getSuburb().equals(suburb)) {
				suma+= p.getCar();
				cont++;
			}
		if (cont>0) {
			res = suma;
			}
		}
		return res;
	}
	/**
	 * 
	 * @param postcode
	 * @return devuelve una lista filtrada por el codigo postal.
	 */
	public List<Casa> getcasascodigopostal(Double postcode){
		ArrayList<Casa> res = new ArrayList<>();
		for (Casa p: casas) {
			if (p.getPostcode().equals(postcode)) {
				res.add(p);
				}
			}
		return res;
		
	}
	/**
	 * 
	 * @return un diccionario con clave el tipo de casa y valor los objetos casas que le pertenecen.
	 */
	
	public Map<Type, List<Casa>> getcasasportype(){
		Map<Type, List<Casa>> res = new HashMap<Type, List<Casa>>();
		for (Casa p: casas) {
			Type clave = p.getType();
			if (res.containsKey(clave)) {
				res.get(clave).add(p);
			} else {
				List<Casa> casas = new ArrayList<Casa>();
				casas.add(p);
				res.put(clave, casas);
			}
		}
		return res;
	}
	/**
	 * 
	 * @return devuelve un diccionario de clave Method y valor la suma total de la habitaciones.
	 */
	public Map<String, Integer> getnumroomMethod(){
		Map<String, Integer> res = new HashMap<String, Integer>();
		for (Casa p: casas) {
			String clave = p.getMethod();
			if (res.containsKey(clave)) {
				res.put(clave, res.get(clave)+p.getRooms());
			}
				else {
					res.put(clave, p.getRooms());
				}
			}
			return res;
		}
}

	
		




