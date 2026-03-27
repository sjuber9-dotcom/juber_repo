package com.nit.pack1;

public class Main {

	public static void main(String[] args) {
		TaxUtil t=new TaxUtil();
	
		
	int ch=Integer.parseInt(IO.readln("Press 1 : Employee\nPress 2 : Manager\nPress 3 : Trainer\npress 4 : Sourcing"));
	
	switch(ch)
	{
	case 1:
	{
		IO.println("Employee :");
		Employee e1=new Employee(101, "Raj", 60000, 7464, 7464);
		double tax = t.calculateTax(e1);
		System.out.println("Tax : "+tax);
	}
	break;
	
	case 2:
	{
		IO.println("Manager :");
		Manager m1=new Manager(102, "Rahul", 80000, 633, 7468, 7455);
		double tax = t.calculateTax(m1);
		System.out.println("Tax : "+tax);
	
	}
	break;
	
	case 3:
	{
		
	}
	break;
	
	case 4:
	{
		
	}
	break;
	}
		
		
		

	}

}
