package com.alian.fullstack;


class Myname
{
	String a="Rajanikanth";
	String b="Kore";
	
	String add()
	{
		String c=a + b;
		return c;
	}
	
	class MyProfile{
		
	}
}



public class HelloWorld {

	public static void main(String[] args) {
		
		 Myname myname= new Myname();
		 
		String result=myname.add();
		 System.out.println(result);

	}

}
