package com.lsn.domain;

import java.util.List;

import org.dozer.Mapping;

public class SourcePerson {
	@Mapping("dname")
	private String sname;
	@Mapping("dfirstname")
	private String sfirstname;
	@Mapping("dlastname")
	private String slastname;
	@Mapping("dperminentaddress")
	List<SourceAddress> spresntaddress;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSfirstname() {
		return sfirstname;
	}
	public void setSfirstname(String sfirstname) {
		this.sfirstname = sfirstname;
	}
	public String getSlastname() {
		return slastname;
	}
	public void setSlastname(String slastname) {
		this.slastname = slastname;
	}
	public List<SourceAddress> getSpresntaddress() {
		return spresntaddress;
	}
	public void setSpresntaddress(List<SourceAddress> spresntaddress) {
		this.spresntaddress = spresntaddress;
	}
	public SourcePerson(String sname, String sfirstname, String slastname, List<SourceAddress> spresntaddress) {
		super();
		this.sname = sname;
		this.sfirstname = sfirstname;
		this.slastname = slastname;
		this.spresntaddress = spresntaddress;
	}
	@Override
	public String toString() {
		return "SourcePerson [sname=" + sname + ", sfirstname=" + sfirstname + ", slastname=" + slastname
				+ ", spresntaddress=" + spresntaddress + "]";
	}
	public SourcePerson() {
		super();
	}

	

	
}
