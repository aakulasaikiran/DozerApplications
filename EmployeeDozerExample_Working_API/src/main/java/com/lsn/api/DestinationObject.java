package com.lsn.api;

import java.util.Date;

public class DestinationObject {

	Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public DestinationObject(Date date) {
		super();
		this.date = date;
	}

	@Override
	public String toString() {
		return "DestinationObject [date=" + date + "]";
	}

	public DestinationObject() {
		super();
	}


}
