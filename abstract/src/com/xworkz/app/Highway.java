package com.xworkz.app;

public abstract class Highway {

	public void transport()
	{
		System.out.println("invoking transport in highway");
	}
	public boolean travel()
	{
		System.out.println("invoking travel in highway");
		return true;
	}
	public boolean connectivity()
	{
		System.out.println("invoking connectivity in highway");
		return true;
	}
	public void trade()
	{
		System.out.println("invoking trade in highway");
	}
	public boolean tourism()
	{
		System.out.println("invoking tourism in highway");
		return true;
	}
	public abstract boolean urbenDevelopement();
	public abstract boolean publicService();
	public abstract boolean economicGrowth();
	public abstract boolean interConnection();
	public abstract boolean safety();

}
