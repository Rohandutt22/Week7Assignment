package com.sapient.Week7.springintro;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class JavaContainerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context =  new AnnotationConfigApplicationContext(MyJavaContainer.class);
  EmployeePojo emp=(EmployeePojo) context.getBean(EmployeePojo.class);
  System.out.println(emp);
  EmployeeMAp m=(EmployeeMAp)context.getBean(EmployeeMAp.class);
  
  //System.out.println(m);
  m.addEmployee(1, emp);
  Scanner s=new Scanner(System.in);
  System.out.println("enter the id of the employee");
  int id=s.nextInt();
  System.out.println(m.getEmployee(id));
  s.close();
	}

}
