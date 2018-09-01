package com.lambda.collections;

public class Employee
{

	private int eNo;
		
	private String eName;

	public Employee( int eNo, String eName ) {
		super();
		this.eNo = eNo;
		this.eName = eName;
	}

	public int geteNo() {
		return eNo;
	}

	public void seteNo( int eNo ) {
		this.eNo = eNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName( String eName ) {
		this.eName = eName;
	}

	@Override
	public String toString() {
		return "Employee [eNo=" + eNo + ", eName=" + eName + "]";
	}

	
}
