package com.sapient.Week7.springintro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyJavaContainer {
	
	@Bean
	public EmployeePojo f1()
	{
		EmployeePojo e=new EmployeePojo();
		e.setCity("chandigarh");
		e.setId(1);
		e.setName("rohan");
		return e;
	}
	@Bean
	public EmployeeMAp f2()
	{
		EmployeeMAp e1=new EmployeeMAp();
		EmployeePojo e=new EmployeePojo();
		e.setCity("chandigarh");
		e.setId(1);
		e.setName("rohan");
		e1.addEmployee(1, e);
		return e1;
	}

}
