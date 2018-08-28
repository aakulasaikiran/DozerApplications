package com.lsn.custom;

import org.dozer.DozerBeanMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationTest {

	public static void main(String[] args) {
		SourceObject sourceClassForConverters = new SourceObject("Aakula Sai kiran");

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("custom-converter-spring-beans.xml");
		DozerBeanMapper beanMapper = (DozerBeanMapper) applicationContext.getBean("dozerBeanMapper");

		DestinationObject destinationClassForConverters = beanMapper.map(sourceClassForConverters,
				DestinationObject.class);

		System.out.println(destinationClassForConverters);

	}

}
