package com.lsn.domain;

import java.util.List;
 
public class DestinationObject {
     
    private String name;
    private String address;
    List<StudentVO> pupils;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<StudentVO> getPupils() {
		return pupils;
	}
	public void setPupils(List<StudentVO> pupils) {
		this.pupils = pupils;
	}
 
  
}