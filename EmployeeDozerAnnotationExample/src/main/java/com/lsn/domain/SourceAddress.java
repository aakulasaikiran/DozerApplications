package com.lsn.domain;

import org.dozer.Mapping;

public class SourceAddress {
	@Mapping("dname")
	String sname;
	@Mapping("dhno")
	String shno;
	@Mapping("dvillage")
	String svillage;
	@Mapping("ddist")
	String sdist;
	@Mapping("dstate")
	String sstate;
	@Mapping("dzipcode")
	int szipcode;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getShno() {
		return shno;
	}
	public void setShno(String shno) {
		this.shno = shno;
	}
	public String getSvillage() {
		return svillage;
	}
	public void setSvillage(String svillage) {
		this.svillage = svillage;
	}
	public String getSdist() {
		return sdist;
	}
	public void setSdist(String sdist) {
		this.sdist = sdist;
	}
	public String getSstate() {
		return sstate;
	}
	public void setSstate(String sstate) {
		this.sstate = sstate;
	}
	public int getSzipcode() {
		return szipcode;
	}
	public void setSzipcode(int szipcode) {
		this.szipcode = szipcode;
	}
	public SourceAddress(String sname, String shno, String svillage, String sdist, String sstate, int szipcode) {
		super();
		this.sname = sname;
		this.shno = shno;
		this.svillage = svillage;
		this.sdist = sdist;
		this.sstate = sstate;
		this.szipcode = szipcode;
	}
	public SourceAddress() {
		super();
	}
	@Override
	public String toString() {
		return "SourceAddress [sname=" + sname + ", shno=" + shno + ", svillage=" + svillage + ", sdist=" + sdist
				+ ", sstate=" + sstate + ", szipcode=" + szipcode + "]";
	}
	
}
