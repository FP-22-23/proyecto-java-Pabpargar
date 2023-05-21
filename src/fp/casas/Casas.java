package fp.casas;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import fp.utiles.Type;

public class Casas {
	
	private Set<Casa> casas;
	
	public Casas() {
		this.casas = new HashSet<Casa>();
	}
	public Casas(Collection<Casa> casas) {
		this.casas = new HashSet<Casa>(casas);
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
	public Set<Casa> getcasascodigopostal(Double postcode){
		HashSet<Casa> res = new HashSet<>();
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
	
	public Map<Type, Set<Casa>> getcasasportype(){
		Map<Type, Set<Casa>> res = new HashMap<Type, Set<Casa>>();
		for (Casa p: casas) {
			Type clave = p.getType();
			if (res.containsKey(clave)) {
				res.get(clave).add(p);
			} else {
				Set<Casa> casas = new HashSet<Casa>();
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
	/**
	 * 
	 * @param seller
	 * @return true si el valor pasado por parametro existe en al menos un objeto del csv.
	 */
	public Boolean getSellergStream(String seller){
		return casas.stream()
				.anyMatch(x-> x.getSellerG().equals(seller));
	}
	/**
	 * 
	 * @param suburb
	 * @return la suma de las plazas de garajes en un barrio.
	 */
	public Double getsumacochesStream(String suburb) {
	
		return  casas.stream()
				.filter(x-> x.getSuburb().equals(suburb))
				.mapToDouble(x -> x.getCar())
				.sum();
				
	}
	/**
	 * 
	 * @param postcode
	 * @return devuelve una lista filtrada por el codigo postal.
	 */
	public Set<Casa> getcasascodigopostalStream(Double postcode){
		return casas.stream()
				.filter(x -> x.getPostcode().equals(postcode))
				.collect(Collectors.toSet());
		
	}
	/**
	 * 
	 * @param type
	 * @return devuelve el maximo precio segun el tipo.
	 */
	public Double getMaximoPrecioStream(Type type){
		return casas.stream()
				.filter(x -> x.getType().equals(type))
				.mapToDouble(x -> x.getPrice())
				.max()
				.getAsDouble();
	}
	/**
	 * 
	 * @param method
	 * @return devuelve un conjunto de casas filtrado por el metodo pasado por parametro.
	 */
	public Set<Casa> getFiltrarMethodOrdenarFecha(String method){
		return casas.stream()
				.filter(x -> x.getMethod().equals(method))
				.sorted(Comparator.comparing(Casa::getDate))
				.collect(Collectors.toSet());
	}
	/**
	 * 
	 * 
	 * @return devuelve diccionario de clave type y valor un conjunto de casas.
	 */
	public Map<Type, Set<Casa>> getCasasPorTypeStream(){
		return casas.stream()
				.collect(Collectors.groupingBy(Casa::getType, Collectors.toSet()));
	}
	/**
	 * 
	 * 
	 * @return devuelve un conjunto con todos los Sellerg.
	 */
	public Set<String> getConjuntoDeSellerStream(){
		return casas.stream()
				.collect(Collectors.mapping(Casa::getSellerG, Collectors.toSet()));
	}
	/**
	 * 
	 * 
	 * @return devuelve diccionario de clave Pool y valor el valor maximo de landsize.
	 */
	public Map<Boolean, Double> getMayorLandsizeSegunSiTienePiscina(){
		return casas.stream()
				.collect(Collectors.toMap(Casa::getPool,Casa::getLandsize,Double::max));
	}
	/**
	 * 
	 * @param n
	 * @return devuelve diccionario de clave Suburb y de valor una lista ordenada con el mayor numero de habitaciones.
	 */
	public Map<String, List<Integer>> getLasNCasasConMasRoomsPorSuburb(Integer n){
		return casas.stream()
				.collect(Collectors.groupingBy(Casa::getSuburb, TreeMap:: new,
						Collectors.collectingAndThen(Collectors.toList(), z -> auxiliar(z, n))));
	}
	public static List<Integer> auxiliar(List<Casa> z, Integer n){
		
		return z.stream().sorted(Collections.reverseOrder(Comparator.comparing(Casa::getRooms)))
				.limit(n)
				.map(Casa::getRooms)
				.collect(Collectors.toList());
	}
	/**
	 * 
	 * 
	 * @return devuelve el suburb con el mayor precio.
	 */
	public  String getSellerMayorPrecio(){
		return casas.stream()
				.max(Comparator.comparing(Casa::getPrice))
				.map(Casa:: getSellerG)
				.orElse(null);
	
	}
}

	
	



