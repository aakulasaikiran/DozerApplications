package com.lsn.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.dozer.DozerBeanMapper;
import org.dozer.loader.api.BeanMappingBuilder;
import org.dozer.loader.api.TypeMappingOptions;

public class TestApplication {

	public static void main(String[] args) {

		// bean mapping
		BeanMappingBuilder beanMappingBuilder = new BeanMappingBuilder() {
			@Override
			protected void configure() {

				String pattern = "yyyy-MM-dd";
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

				String date1 = simpleDateFormat.format(new Date());
				System.out.println(date1);
				
				
				
				
				
				
				/*
				//String dateFormat = "DD/MM/YYYY HH:mm";
				Date dateFormat1 = new Date(2323223232L);
				DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
				 String strDate = dateFormat.format(dateFormat1);*/
				mapping(SourceObject.class, DestinationObject.class, TypeMappingOptions.wildcard(true)
					,TypeMappingOptions.dateFormat(pattern)).fields("date", "date");
			
			
			}
		};

		// Example
		DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
		dozerBeanMapper.addMapping(beanMappingBuilder);

		SourceObject src = new SourceObject();
		src.setDate(new Date());

		DestinationObject dest = dozerBeanMapper.map(src, DestinationObject.class);

		System.out.println("DestinationObject : " + dest);
	}
}
