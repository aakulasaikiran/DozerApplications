package com.lsn.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.dozer.DozerBeanMapper;

import com.lsn.domain.DestnationPerson;
import com.lsn.domain.SourceAddress;
import com.lsn.domain.SourcePerson;

public class TestApplication {

	public static void main(String[] args) {
		DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
		SourcePerson sourcePerson = new SourcePerson();
		sourcePerson.setSfirstname("sai");
		sourcePerson.setSlastname("kiran");
		sourcePerson.setName("Aakulasaikiran");

		SourceAddress sourceAddress=new SourceAddress("Aakulasaikiran","3", "chelgal", "jagtial", "telanagan", 505455);
		List al=new ArrayList<>();
		al.add(sourceAddress);
		sourcePerson.setSpresntaddress(al);
		
		//sourcePerson.getSpresntaddress().add(new SourceAddress("Aakulasaikiran","3", "chelgal", "jagtial", "telanagan", 505455));
		//sourcePerson.getSpresntaddress().add(new SourceAddress("4-11/1", "korutla", "jagtial", "telanagan", 505099));
		dozerBeanMapper.setMappingFiles(Arrays.asList("mappings\\employee-mapper.xml"));
		DestnationPerson destinationperson = dozerBeanMapper.map(sourcePerson, DestnationPerson.class);
		System.out.println(destinationperson);

	}

}
