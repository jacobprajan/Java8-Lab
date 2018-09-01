package com.bifunction2;

public class TimeSheet {

	private Integer empNo;
	private Integer days;

	public TimeSheet(Integer empNo, Integer days) {
		this.empNo = empNo;
		this.days = days;
	}

	public Integer getEmpNo() {
		return empNo;
	}

	public Integer getDays() {
		return days;
	}

	@Override
	public String toString() {
		return "TimeSheet [empNo=" + empNo + ", days=" + days + "]";
	}

}
