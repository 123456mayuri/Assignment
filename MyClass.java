package com.service.mayuri;

public class MyClass {
 
	int dd;
	int mm;
	int yyyy;
	public MyClass(int dd, int mm, int yyyy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYyyy() {
		return yyyy;
	}
	public void setYyyy(int yyyy) {
		this.yyyy = yyyy;
	}
	@Override
	public String toString() {
		return "MyClass [dd=" + dd + ", mm=" + mm + ", yyyy=" + yyyy + "]";
	}
	
	
}
