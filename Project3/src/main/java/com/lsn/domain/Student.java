package com.lsn.domain;

public class Student {

	String name;
	String batch;
	String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student(String name, String batch, String address) {
		super();
		this.name = name;
		this.batch = batch;
		this.address = address;
	}

}