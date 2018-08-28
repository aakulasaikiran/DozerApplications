package com.example.howtodoinjava.dozer.api;

import org.dozer.DozerBeanMapper;
import org.dozer.loader.api.BeanMappingBuilder;
import org.dozer.loader.api.TypeMappingOptions;

public class BeanMappingBuilderExample {

	public static void main(String[] args) {

		// bean mapping
		BeanMappingBuilder beanMappingBuilder = new BeanMappingBuilder() {
			@Override
			protected void configure() {

				//String dateFormat = "MM/dd/yyyy HH:mm";
				//String dateFormat="dd/mm/yy";
				//String dateFormat="YYYY/MM/DD";
				//String dateFormat="MM/D/YYYY";
				String dateFormat="DD/MM/YYYY";
				mapping(SourceObject.class, DestinationObject.class, TypeMappingOptions.wildcard(true),
						TypeMappingOptions.dateFormat(dateFormat)).fields("date", "date");
			}
		};

		// Example
		DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
		dozerBeanMapper.addMapping(beanMappingBuilder);

		SourceObject src = new SourceObject();
		//src.setDate("10/08/2018 11:45");
		src.setDate("10/08/2018");
		DestinationObject dest = dozerBeanMapper.map(src, DestinationObject.class);

		System.out.println("DestinationObject : " + dest);
	}
}
