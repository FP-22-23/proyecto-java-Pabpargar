package fp.casas;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;


import fp.common.Coordenadas;
import fp.utiles.Type;

public class Casa implements Comparable <Casa>{
	private String suburb;
	private String address;
	private Integer rooms;
	private Type type;
	private Double price;
	private String method;
	private String sellerG;
	private LocalDate date;
	private Double distance;
	private Double postcode;
	private Double bedroom2;
	private Double bathroom;
	private Double car;
	private Double landsize;
	private Coordenadas coordenadas;
	private Boolean pool;
	private List<String> otherspace;
	
	public Integer getNumtotalhabitaciones() {
		Integer total= (int) (rooms + bedroom2) ;
		
	return total;
	}
	
	private void checkAddress(String s) {
		if(s.equals("")) {
			throw new IllegalArgumentException("El address no puede estar vacio");
		}
	}
	
	private void checkPrice(Double s) {
		if(s<0) {
			throw new IllegalArgumentException("El precio no puede ser negativo");
		}
	}
	

	public String getSuburb() {
		return suburb;
	}

	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address){
		checkAddress(address);
		this.address = address;
	}

	public Integer getRooms() {
		return rooms;
	}

	public void setRooms(Integer rooms) {
		this.rooms = rooms;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		checkPrice(price);
		this.price = price;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getSellerG() {
		return sellerG;
	}

	public void setSellerG(String sellerG) {
		this.sellerG = sellerG;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public Double getPostcode() {
		return postcode;
	}

	public void setPostcode(Double postcode) {
		this.postcode = postcode;
	}

	public Double getBedroom2() {
		return bedroom2;
	}

	public void setBedroom2(Double bedroom2) {
		this.bedroom2 = bedroom2;
	}

	public Double getBathroom() {
		return bathroom;
	}

	public void setBathroom(Double bathroom) {
		this.bathroom = bathroom;
	}

	public Double getCar() {
		return car;
	}

	public void setCar(Double car) {
		this.car = car;
	}

	public Double getLandsize() {
		return landsize;
	}

	public void setLandsize(Double landsize) {
		this.landsize = landsize;
	}

	public Coordenadas getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(Coordenadas coordenadas) {
		this.coordenadas = coordenadas;
	}

	public Boolean getPool() {
		return pool;
	}

	public void setPool(Boolean pool) {
		this.pool = pool;
	}

	
	public List<String> getOtherspace() {
		return otherspace;
	}

	public void setOtherspace(List<String> otherspace) {
		this.otherspace = otherspace;
	}
	
	private List<String> parseaotherspace(String otherspace){
		String[] partes = otherspace.split("/");
		return Arrays.asList(partes);
	}


	public Casa(String suburb, String address, Integer rooms, Type type, Double price, String method, String sellerG,
			LocalDate date, Double distance, Double postcode, Double bedroom2, Double bathroom, Double car,
			Double landsize, Coordenadas coordenadas, Boolean pool, String otherspace) {
		checkAddress(address);
		checkPrice(price);
		this.suburb = suburb;
		this.address = address;
		this.rooms = rooms;
		this.type = type;
		this.price = price;
		this.method = method;
		this.sellerG = sellerG;
		this.date = date;
		this.distance = distance;
		this.postcode = postcode;
		this.bedroom2 = bedroom2;
		this.bathroom = bathroom;
		this.car = car;
		this.landsize = landsize;
		this.coordenadas = coordenadas;
		this.pool = pool;
		this.otherspace = parseaotherspace(otherspace);
	}

	public Casa(String suburb, String address, Integer rooms, Double price, LocalDate date, Double postcode, Double bedroom2, Double landsize, Coordenadas coordenadas) {
		checkAddress(address);
		checkPrice(price);
		this.suburb = suburb;
		this.address = address;
		this.rooms = rooms;
		this.type = null;
		this.price = price;
		this.method = null;
		this.sellerG = null;
		this.date = date;
		this.distance = null;
		this.postcode = postcode;
		this.bedroom2 = bedroom2;
		this.bathroom = null;
		this.car = null;
		this.landsize = landsize;
		this.coordenadas = coordenadas;
		this.pool = null;
		this.otherspace = null;
		
	}

	@Override
	public String toString() {
		return "Casa [suburb=" + suburb + ", address=" + address + ", rooms=" + rooms + ", type=" + type + ", price="
				+ price + ", method=" + method + ", sellerG=" + sellerG + ", date=" + date + ", distance=" + distance
				+ ", postcode=" + postcode + ", bedroom2=" + bedroom2 + ", bathroom=" + bathroom + ", car=" + car
				+ ", landsize=" + landsize + ", coordenadas=" + coordenadas + ", pool=" + pool + ", otherspace="
				+ otherspace + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((landsize == null) ? 0 : landsize.hashCode());
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
		Casa other = (Casa) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (landsize == null) {
			if (other.landsize != null)
				return false;
		} else if (!landsize.equals(other.landsize))
			return false;
		return true;
	}


	public int compareTo(Casa o) {
		
		int r = this.getAddress().compareTo(o.getAddress());
		if(r == 0) {
			r = this.getLandsize().compareTo(o.getLandsize());
			
		}
		return r;
	}
	
	  
	
}
