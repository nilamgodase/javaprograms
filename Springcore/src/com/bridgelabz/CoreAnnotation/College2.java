package com.bridgelabz.CoreAnnotation;

public class College2 {
	private Principal principal;
	
	public College2(Principal principal) {
		this.principal = principal;
	}

	public void test()
	{
		principal.principalInfo();
		System.out.println("method is tested");
	}

}
