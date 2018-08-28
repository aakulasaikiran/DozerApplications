package com.lsn.custom;

public class SourceObject {

	private String fullname;

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public SourceObject(String fullname) {
		super();
		this.fullname = fullname;
	}

	public SourceObject() {
		super();
	}

	@Override
	public String toString() {
		return "SourceObject [fullname=" + fullname + "]";
	}
}
