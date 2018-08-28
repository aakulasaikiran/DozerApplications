package com.lsn.test;

import java.util.Arrays;

import org.dozer.DozerBeanMapper;

import com.lsn.domain.DestinationObject;
import com.lsn.domain.SourceObject;
import com.lsn.domain.Student;

public class TestApplication {

	public static void main(String[] args) {
		DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
		SourceObject sourceObject = new SourceObject();
		sourceObject.setName("saikiran");
		
		sourceObject.setAddress("jagtial");

		sourceObject.getStudents().add(new Student("saikiran", "ssc", "jagtial"));
		sourceObject.getStudents().add(new Student("akhil", "inter", "chelgal"));
		sourceObject.getStudents().add(new Student("nishanth", "degree", "manthani"));

		dozerBeanMapper.setMappingFiles(Arrays.asList("mappings\\student-mapper.xml"));
		DestinationObject destinationObject = dozerBeanMapper.map(sourceObject, DestinationObject.class);

		System.out.println(destinationObject);
	}
}
