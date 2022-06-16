package com.constructor.org;

public class StdName {
	// attributes
	private String studetName;

	// constructor
	public StdName() {
	
		studetName="unknown";
	}

	// creating another constructor
	public StdName(String name) {
		this.studetName = name;
	
	}
	

	public static void main(String[] args) {
		StdName name = new StdName();
		StdName name2=new StdName("Kumar");
		System.out.println(name.studetName);
		System.out.println(name2.studetName);

	}

}
