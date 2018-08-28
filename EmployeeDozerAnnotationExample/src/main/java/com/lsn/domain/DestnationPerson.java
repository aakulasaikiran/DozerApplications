package com.lsn.domain;

import java.util.List;

public class DestnationPerson {
	 private String dname;
	 private String dfirstname;
	 private String dlastname;
	 List<DestnationAddress> dperminentaddress;
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDfirstname() {
		return dfirstname;
	}
	public void setDfirstname(String dfirstname) {
		this.dfirstname = dfirstname;
	}
	public String getDlastname() {
		return dlastname;
	}
	public void setDlastname(String dlastname) {
		this.dlastname = dlastname;
	}
	public List<DestnationAddress> getDperminentaddress() {
		return dperminentaddress;
	}
	public void setDperminentaddress(List<DestnationAddress> dperminentaddress) {
		this.dperminentaddress = dperminentaddress;
	}
	public DestnationPerson(String dname, String dfirstname, String dlastname,
			List<DestnationAddress> dperminentaddress) {
		super();
		this.dname = dname;
		this.dfirstname = dfirstname;
		this.dlastname = dlastname;
		this.dperminentaddress = dperminentaddress;
	}
	public DestnationPerson() {
		super();
	}
	@Override
	public String toString() {
		return "DestnationPerson [dname=" + dname + ", dfirstname=" + dfirstname + ", dlastname=" + dlastname
				+ ", dperminentaddress=" + dperminentaddress + "]";
	}
	
}
