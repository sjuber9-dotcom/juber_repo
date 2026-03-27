package com.nit.pack1;

public class Manager {

	int mId;
	String mName;
	double basicSalary;
	double hraper;
	double daper;
	double ProjectAl;
	

	public Manager(int mId, String mName, double basicSalary, double hraper, double daper, double projectAl) {
		super();
		this.mId = mId;
		this.mName = mName;
		this.basicSalary = basicSalary;
		this.hraper = hraper;
		this.daper = daper;
		ProjectAl = projectAl;
	}




	public double calcualteGrossSalary()
	{
		return basicSalary+hraper+daper+ProjectAl;
	}
}
