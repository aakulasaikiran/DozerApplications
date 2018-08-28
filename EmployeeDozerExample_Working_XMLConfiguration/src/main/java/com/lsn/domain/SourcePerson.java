package com.lsn.domain;

import java.util.List;

public class SourcePerson {
	private String sname;
	private String sfirstname;
	private String slastname;
	List<SourceAddress> spresntaddress;

	

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

	@Override
	public String toString() {
		return "SourcePerson [sname=" + sname + ", sfirstname=" + sfirstname + ", slastname=" + slastname
				+ ", spresntaddress=" + spresntaddress + "]";
	}

	

	public SourcePerson() {
		super();
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

}
