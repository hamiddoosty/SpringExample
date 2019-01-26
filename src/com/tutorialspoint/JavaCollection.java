package com.tutorialspoint;
import java.util.*;

public class JavaCollection {
	
	List addressList;
	Set addressSet;
	Map addressMap;
	Properties addressPrps;
	

	public List getAddressList() {
		System.out.println("List Elements :"  + addressList);
		return addressList;
	}


	public void setAddressList(List addressList) {
		this.addressList = addressList;
	}


	public Set getAddressSet() {
		System.out.println("Set Elements :"  + addressSet);
		return addressSet;
	}


	public void setAddressSet(Set addressSet) {
		this.addressSet = addressSet;
	}


	public Map getAddressMap() {
		System.out.println("Map Elements :"  + addressMap);
		return addressMap;
	}


	public void setAddressMap(Map addressMap) {
		this.addressMap = addressMap;
	}


	public Properties getAddressPrps() {
		System.out.println("Properties Elements :"  + addressPrps);
		return addressPrps;
	}


	public void setAddressPrps(Properties addressPrps) {
		this.addressPrps = addressPrps;
	}


	public JavaCollection() {
		// TODO Auto-generated constructor stub
	}

}
