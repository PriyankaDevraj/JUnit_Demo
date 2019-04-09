package junitexample;

public class Calculate {
	
	//Tested with assertEquals
	public int sum(String summand) {
		
		int finalSum = 0;
		
		for(String s : summand.split("\\+")) {
			
			finalSum+=Integer.valueOf(s);
		}
		
		return finalSum;
	}
	
	public String[] converToIntArr() {
		String[] arrOfInt = {"Apple","Mangoes","Pears"};
		return arrOfInt;
	}

	
}
