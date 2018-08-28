package com.lsn.domain;

public class DestnationAddress {
	String dname;
	String dhno;
	String dvillage;
	String ddist;
	String dstate;
	/*int dzipcode;*/
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
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
	
	@Override
	public String toString() {
		return "DestnationAddress [dname=" + dname + ", dhno=" + dhno + ", dvillage=" + dvillage + ", ddist=" + ddist
				+ ", dstate=" + dstate + "]";
	}
	
	
}
