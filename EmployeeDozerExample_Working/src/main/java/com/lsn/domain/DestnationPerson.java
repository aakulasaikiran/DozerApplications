package com.lsn.domain;

import java.util.List;

public class DestnationPerson {
	 private String name;
	 private String dfirstname;
	 private String dlastname;
	 List<DestnationAddress> dperminentaddress;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public DestnationPerson(String name, String dfirstname, String dlastname,
			List<DestnationAddress> dperminentaddress) {
		super();
		this.name = name;
		this.dfirstname = dfirstname;
		this.dlastname = dlastname;
		this.dperminentaddress = dperminentaddress;
	}
	public DestnationPerson() {
		super();
	}
	@Override
	public String toString() {
		return "DestnationPerson [name=" + name + ", dfirstname=" + dfirstname + ", dlastname=" + dlastname
				+ ", dperminentaddress=" + dperminentaddress + "]";
	}
	
}
