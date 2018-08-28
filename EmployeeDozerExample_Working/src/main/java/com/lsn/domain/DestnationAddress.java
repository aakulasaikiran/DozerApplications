package com.lsn.domain;

public class DestnationAddress {
	String name;
	String dhno;
	String dvillage;
	String ddist;
	String dstate;
	int dzipcode;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDhno() {
		return dhno;
	}
	public void setDhno(String dhno) {
		this.dhno = dhno;
	}
	public String getDvillage() {
		return dvillage;
	}
	public void setDvillage(String dvillage) {
		this.dvillage = dvillage;
	}
	public String getDdist() {
		return ddist;
	}
	public void setDdist(String ddist) {
		this.ddist = ddist;
	}
	public String getDstate() {
		return dstate;
	}
	public void setDstate(String dstate) {
		this.dstate = dstate;
	}
	public int getDzipcode() {
		return dzipcode;
	}
	public void setDzipcode(int dzipcode) {
		this.dzipcode = dzipcode;
	}
	public DestnationAddress() {
		super();
	}
	@Override
	public String toString() {
		return "DestnationAddress [name=" + name + ", dhno=" + dhno + ", dvillage=" + dvillage + ", ddist=" + ddist
				+ ", dstate=" + dstate + ", dzipcode=" + dzipcode + "]";
	}

	
}
