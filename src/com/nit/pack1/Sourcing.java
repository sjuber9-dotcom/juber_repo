package com.nit.pack1;

public class Sourcing {
	
	int sId;
	String sName;
	double basicSalary;
	double hraper;
	double daper;
	int envTarget;
	int envReached;
	double pathForEnv;
	
	public Sourcing(int sId, String sName, double basicSalary, double hraper, double daper, int envTarget,
			int envReached, double pathForEnv) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.basicSalary = basicSalary;
		this.hraper = hraper;
		this.daper = daper;
		this.envTarget = envTarget;
		this.envReached = envReached;
		this.pathForEnv = pathForEnv;
	}



	public double calcualteGrossSalary()
	{
		return basicSalary+hraper+daper+(((envReached/envTarget)*100)*pathForEnv);
	}

}
