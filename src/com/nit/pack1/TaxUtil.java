package com.nit.pack1;

public class TaxUtil {
	
	public double calculateTax(Employee e)
	{
		double grossSalary = e.calcualteGrossSalary();
		System.out.println("Gross Salary : "+grossSalary);
		double tax=0;
		
		if(grossSalary>=50000)
			tax=grossSalary*0.20;
		else
			tax=grossSalary*0.05;
		
		return tax;
	}
	public double calculateTax(Manager m)
	{
		double grossSalary = m.calcualteGrossSalary();
		System.out.println("Gross Salary : "+grossSalary);
		double tax=0;
		
		if(grossSalary>=50000)
			tax=grossSalary*0.20;
		else
			tax=grossSalary*0.05;
		
		return tax;
	}
	public double calculateTax(Sourcing s)
	{
		return 0;
	}
	public double calculateTax(Trainer e)
	{
		return 0;
	}

}
