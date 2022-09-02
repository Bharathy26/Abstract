package com.common;

public class Members2 extends Bharathy {

	public  Members2(String name) {
		this("merwin",28);
		System.out.println("name is:"+name );
	}
	public Members2(String name,int empid) {
		this(27,"raghul");
		System.out.println("name is:"+name+"\t"+"emp id is:"+ empid );
	}
	public Members2(int empid,String name) {
		this("sekar",6380477737l);
		System.out.println("emp id is:"+empid+"\t"+"name is:"+name );
	}
	public Members2(String name,long phone) {
		this("gopi", 28,877658898);
		System.out.println("name is:"+name+"\t"+"plone numberis:"+ phone);
	}
	public Members2(String name,int empid,long phone) {
		this(43, 76657678, "bnggg");
		System.out.println("name is:"+name+"\t"+"emp id is:"+ 26+"\t"+"plone numberis:"+ 6380477737l );
	}
	public Members2(int empid, long phone,String name){
		System.out.println("emp id is:"+empid+"\t"+"plone numberis:"+phone+"\t"+"name is:"+name);
	}
	
}

