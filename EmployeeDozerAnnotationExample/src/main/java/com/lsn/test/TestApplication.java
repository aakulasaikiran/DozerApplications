package com.lsn.test;

import java.util.ArrayList;
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
		sourcePerson.setSname("Aakulasaikiran");

		SourceAddress sourceAddress = new SourceAddress("Aakulasaikiran", "3", "chelgal", "jagtial", "telanagan",
				505455);
		List al = new ArrayList<>();
		 al.add(sourceAddress);
		sourcePerson.setSpresntaddress(al);
		DestnationPerson dperson = new DozerBeanMapper().map(sourcePerson, DestnationPerson.class);
		System.out.println("DestinationObject : " + dperson);

	}

}
