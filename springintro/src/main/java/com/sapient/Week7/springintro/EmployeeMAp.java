package com.sapient.Week7.springintro;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMAp {
   Map<Integer, EmployeePojo> mymap;
   public void setMymap(Map<Integer, EmployeePojo> mymap) {
	this.mymap = mymap;
}
EmployeeMAp()
   {
	   mymap= new HashMap<Integer, EmployeePojo>();
   }
   public void  addEmployee(int id,EmployeePojo e)
   {
	   mymap.put(id, e);
   }
   public EmployeePojo getEmployee(int id)
   {
	   if(mymap.containsKey(id))
		   return mymap.get(id);
	   else return null;
   }
}
