package com.xworkz.inheritance;

public class RiverStarter {
 public static void main(String [] args) {
	// River river=new River();
	 
	 
	 krishnaRiver ref=new krishnaRiver();

	 kaveriRiver ref1=new kaveriRiver();	 
	 
	 if (ref1 instanceof kaveriRiver)
	 {
	kaveriRiver ka=(kaveriRiver)ref1;
	
	
	    System.out.println(ka.destination);
		System.out.println(ka.length);
		System.out.println(ka.origin);
		System.out.println(ka.name);
		
		System.out.println(ka.taste);
	 }
	 
	 if(ref instanceof krishnaRiver)
	 {
	krishnaRiver ma=(krishnaRiver)ref;
	
	
	    System.out.println(ma.destination);
		System.out.println(ma.length);
		System.out.println(ma.origin);
		System.out.println(ma.name);
		
	 System.out.println(ma.thirthaYathrey);
 }
	 
	 
	 Object[] renu=new Object[2];
	 renu[0]=ref1;
	 renu[1]=ref;
	 for(int i=0;i<renu.length;i++)
	 {
		if(renu[i] instanceof kaveriRiver)
		{
			kaveriRiver ref3=(kaveriRiver)renu[i];
			System.out.println(ref3.taste);
		}
		
		if(renu[i] instanceof krishnaRiver)
		{
			krishnaRiver ref3=(krishnaRiver)renu[i];
			System.out.println(ref3.thirthaYathrey);
		}
	 }
	 
}
}