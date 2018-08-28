package com.lsn.domain;

import org.dozer.DozerBeanMapper;

public class AnnotationExample {

	public static void main(String[] args) 
	{
		SourceObject sourceObject = new SourceObject();
		sourceObject.setName("Saikiran");
		sourceObject.setAddress("chelgal");

		sourceObject.getStudents().add(new Student("S1", "C1", "diffField1"));
		sourceObject.getStudents().add(new Student("S2", "C2", "diffField2"));
		sourceObject.getStudents().add(new Student("S3", "C3", "diffField3"));
		
		DestinationObject targetObj = new DozerBeanMapper().map(sourceObject, DestinationObject.class);
		System.out.println("DestinationObject : " + targetObj);
	}
}
