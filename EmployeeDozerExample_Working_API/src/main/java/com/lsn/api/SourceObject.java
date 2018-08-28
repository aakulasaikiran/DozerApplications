package com.lsn.api;

import java.util.Date;

public class SourceObject {

	/*String date;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public SourceObject(String date) {
		super();
		this.date = date;
	}

	@Override
	public String toString() {
		return "SourceObject [date=" + date + "]";
	}

	public SourceObject() {
		super();
	}

	*/
	Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "SourceObject [date=" + date + "]";
	}

	public SourceObject(Date date) {
		super();
		this.date = date;
	}

	public SourceObject() {
		super();
	}
}
