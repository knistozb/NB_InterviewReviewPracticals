package nb_Debugging;

import java.util.Arrays;

public class Debugging_problems {

	
	// Question 33.1:
	public int add(int firstOperand1, int secondOperand1) {
		return firstOperand1 + secondOperand1;
	}
	
	/*
	// Question 33.2:
	public int subtr(String firstOperand2, int secondOperand2) {
		return (firstOperand2 - secondOperand2);
	}
	*/
	
	// Question 33.3:
	public int divide(int firstOperand3, int secondOperand3) {
		
		if(secondOperand3 != 0) {
			return (firstOperand3/secondOperand3);
		}
 		return firstOperand3/secondOperand3;
	}
	
	// Question 33.4:
	public int multiple(int firstOperand4, int secondOperand4) {
		return (firstOperand4*secondOperand4);
	}
	
	// Question 33.5:
	public int getMax(int[] values) {
		
		int max = 0;
		
		for(int i=0; i < values.length; i++) {
			if(values[i] > max) {
				max = values[i];
			}
		}
		
		return max;
	}
	
	
	public static void main(String[] args) {
		
		Debugging_problems debug = new Debugging_problems();
		
		// Question 33.1:
		int addResult = debug.add(5, 7);
		System.out.println("The final output of add method is: " + addResult);
		
		System.out.println("===== ======= ======= ======== ========== ===========");
		
		// Question 33.2:
//		int subtrResult = debug.subtr(5, 7);
//		System.out.println("The final output of subtr method is: " + subtrResult);

		System.out.println("===== ======= ======= ======== ========== ===========");

		// Question 33.3:
		int divideResult = debug.divide(10, 2);
		System.out.println("The final output of divide method is: " + divideResult);
		
		System.out.println("===== ======= ======= ======== ========== ===========");

		// Question 33.4:
		int multipleResult = debug.multiple(5,7);
		System.out.println("The final output of multiple method is: " + multipleResult);
	
		System.out.println("===== ======= ======= ======== ========== ===========");

		// Question 33.5:
		int[] values = {10,20,30,40,50, 0};
		System.out.println("The original array of values is: " + Arrays.toString(values));
		
		int maxResult = debug.getMax(values);
		System.out.println("The final output of getMax method is: " + maxResult);
		
		
	}
	
	
	
	
}
