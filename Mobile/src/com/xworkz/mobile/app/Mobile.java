package com.xworkz.mobile.app;

public class Mobile {
	int age=18; //instance var
	static String college;//static var
	public void student()
	{
		String name="Divya";//local var
		System.out.println("name is:"+name);//implicit
	}
	 Mobile()
	{
		 public static int  Mobile() {
		System.out.println("mobile");
	}
	
	}
	public static void sleep(long phno) {                   //parameter var
		System.out.println("phno is:"+phno);
		
	}
	public static void main(String[] args) {                   
		Mobile obj=new Mobile();
		obj.student();

		Mobile.sleep(4536782812l);
		
		Mobile mobile = new Mobile();
		mobile.Mobile();
	}
	private void Mobile() {
		// TODO Auto-generated method stub
		
	}
	

}
