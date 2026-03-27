package com.nit.pack1;

public class Employee {
	
	int eId;
	String eName;
	double basicSalary;
	double hreper;
	double daper;



	public Employee(int eId, String eName, double basicSalary, double hreper, double daper) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.basicSalary = basicSalary;
		this.hreper = hreper;
		this.daper = daper;
	}

	public double calcualteGrossSalary()
	{
		return basicSalary+hreper+daper;
	}

}
