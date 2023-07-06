package com.rays.bean;

public class TestMarksheetBean {
	
	public static void main(String[] args) throws Exception {
	
		addDelete();
		//addUpdate();
		//addInsert();
		
		
	}
		private static void addDelete() throws Exception {
			MarksheetBean bn = new MarksheetBean();
			bn.setRollno(101);
			MarksheetModel mm = new MarksheetModel();
			mm.testDelete(bn);
		}
		
		private static void addUpdate() throws Exception {
			MarksheetBean bn = new MarksheetBean();
			bn.setRollno(102);
			bn.setName("deven");
			bn.setMarks(50);
			
			
			MarksheetModel mm = new MarksheetModel();
			mm.testupdate(bn);
			
	 }
		
		private static void addInsert() throws Exception {
			MarksheetBean bn = new MarksheetBean ();
			bn.setRollno(104);
			bn.setName("ritu");
			bn.setMarks(12);
			
			
			MarksheetModel mm = new MarksheetModel();
			mm.add(bn);
			
			
		}
	

	
	}


