package com.nit.pack1;

public class Trainer {

	int tId;
	String tName;
	double basicSalary;
	double hraper;
	double daper;
	int batchCount;
	double perkBatch;


	public Trainer(int tId, String tName, double basicSalary, double hraper, double daper, int batchCount,
			double perkBatch) {
		super();
		this.tId = tId;
		this.tName = tName;
		this.basicSalary = basicSalary;
		this.hraper = hraper;
		this.daper = daper;
		this.batchCount = batchCount;
		this.perkBatch = perkBatch;
	}




	public double calcualteGrossSalary()
	{
		return basicSalary+hraper+daper+batchCount*perkBatch;
	}
}
