package com.service.mayuri;

public class TestDate {
MyClass startDate;
MyClass endDate;
int actualDifference;
public TestDate(MyClass startDate, MyClass endDate, int actualDifference) {
	super();
	this.startDate = startDate;
	this.endDate = endDate;
	this.actualDifference = actualDifference;
}
public MyClass getStartDate() {
	return startDate;
}
public void setStartDate(MyClass startDate) {
	this.startDate = startDate;
}
public MyClass getEndDate() {
	return endDate;
}
public void setEndDate(MyClass endDate) {
	this.endDate = endDate;
}
public int getActualDifference() {
	return actualDifference;
}
public void setActualDifference(int actualDifference) {
	this.actualDifference = actualDifference;
}



}
