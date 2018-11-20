package com.service.mayuri;

public class CalculateTestCases {
public static void main(String args[]) {
	DifferenceDateCalculate differenceDateCalculate=new DifferenceDateCalculate();
	TestDate testDate[]=new TestDate[2];
	testDate[0]=new TestDate(new MyClass (20,11,2018), new MyClass(20,11,2018),0);
	testDate[1]=new TestDate(new MyClass (20,11,2018), new MyClass(27,11,2018),7);
	for(int index=0; index<testDate.length; index++) {
		int calculateDiff= differenceDateCalculate.getDate(testDate[index].getStartDate(), testDate[index].getEndDate());
		
		if(calculateDiff==testDate[index].getActualDifference()) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
	}
} 
}
