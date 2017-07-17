package com.incognito;
public class Atm {
	private Address address;
	private long distance;
	private String type;
	
	public Atm(){
	}
	
	/**
	 * @return the address
	 */
	public Address getAddress(){
		return address;
	}
	
	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(Address address){
		this.address = address;
	}
	
	/**
	 * @return the distance
	 */
	public long getDistance(){
		return distance;
	}
	
	/**
	 * @param distance
	 *            the distance to set
	 */
	public void setDistance(long distance){
		this.distance = distance;
	}
	
	/**
	 * @return the type
	 */
	public String getType(){
		return type;
	}
	
	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type){
		this.type = type;
	}
}