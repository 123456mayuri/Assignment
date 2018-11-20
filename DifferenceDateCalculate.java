package com.service.mayuri;

public class DifferenceDateCalculate {

	public int getDate(MyClass startDate, MyClass endDate) {
		//return endDate.getDd()-startDate.getDd();
		static final int JAN = 31;
		static final int FEB = 28;
		static final int MAR = 31;
		static final int APR = 30;
		static final int MAY = 31;
		static final int JUN = 30;
		static final int JUL = 31;
		static final int AUG = 31;
		static final int SEP = 30;
		static final int OCT = 31;
		static final int NOV = 30;
		static final int DEC = 31;

		int[] months = { JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC };
		if(sameDate(startDate==endDate)&& sameMonth(startDate==endDate)&& sameYear(startDate==endDate)) {
			return true;
		}
		else if(sameMonth(endDate==startDate)&& sameYear(endDate== startDate)) {
			return endDate.getDd()-startDate.getDd();
		}
		else if(sameYear(endDate==startDate)) {
			return 0;
		}
	}
	
	private boolean sameDate(MyClass endDate, MyClass startDate ) {
		return endDate.getDd()==startDate.getDd();
		
	}
	private boolean sameMonth(MyClass endDate, MyClass startDate ) {
		return endDate.getMm()==startDate.getMm();
		
	}
	
	private boolean sameYear(MyClass endDate, MyClass startDate ) {
		return endDate.getYyyy()==startDate.getYyyy();
		
	}
	
	
}
