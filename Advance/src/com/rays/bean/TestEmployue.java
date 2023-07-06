package com.rays.bean;

import java.util.Iterator;
import java.util.List;


public class TestEmployue {
	
	private static final Iterator i = null;

	public static void main(String[] args) throws Exception {
		testfindById();
		//testAdd();
		//testsearch();
		
	}

	private static void testfindById() throws Exception {
		EmployeModel Model = new EmployeModel();
		EmployeBean bean = Model.findById(1);
		
		if (bean != null) {
			System.out.println(bean.getId());
			
			
		}else {
			System.out.println("Does not exist");
		}
		
		
	}


	private static void testsearch() throws Exception {
		EmployeModel md = new EmployeModel();
		List l = md.search();
		Iterator i = l.iterator();
		
		while (i.hasNext())
			System.out.println(i.next());
			
		{
			EmployeBean bn = (EmployeBean)i.next();
			System.out.println(" " +bn.getId());
			System.out.println(" " +bn.getName());
			System.out.println(" " +bn.getSalary());
		}
	    }
	
	private static void testAdd() throws Exception {
		EmployeBean bn = new EmployeBean();
		bn.setId(8);
		bn.setName("siva");
		bn.setSalary(700);
		
		EmployeModel md = new EmployeModel();
		md.Add(bn);
		
	}
	

}
