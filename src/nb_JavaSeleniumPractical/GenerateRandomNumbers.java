package nb_JavaSeleniumPractical;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GenerateRandomNumbers {

	
	// Question 1 of Practical 1: Generate 500 random numbers and print the nth smallest number in a programming language of your choice. 
		// (Ask user for the Nth smallest number)
	
	
	 
	public static void main(String[] args) {
	
        int[] randomNumbers = new int[500];
        Random random = new Random();

        System.out.println("Here are all the 500 randomly generated numbers. \n");
        // Generate 500 random numbers
        for (int i = 0; i < 500; i++) {
            randomNumbers[i] = random.nextInt(1000);
            System.out.println(randomNumbers[i]);
        }

        // Sort the array
        Arrays.sort(randomNumbers);

        // Ask user for the value of N
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nHello user, please ask me whatever Nth smallest number you desire among those 500 numbers above: ");
        int num = scanner.nextInt();

        // Check if N is within a valid range
        if (num < 1 || num > 500) {
            System.out.println("N should be between 1 and 500.");
        } 
        else {
            int nthSmallest = randomNumbers[num - 1];
            System.out.println("\nThe " + num + "th smallest number is: " + nthSmallest + "\n");
        }
    	scanner.close();
    }

}
	
	
	/*
	  // Another possible alternative in solving this question.
	   
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Hey user, ask me for whatever Nth smallest number?");
		int nthvalue = scanner.nextInt();
		
		
		int start = 1;
        int end = 1000;
        int counter = 500;
        Random random = new Random(); 

        int smallest;
//        int greatest;
        int randomInt ;

        int numbers [] = new int[counter];

        randomInt = random.nextInt(end-start) + start;
        numbers [1] = randomInt;

        smallest = randomInt;
//        greatest = randomInt;

        for(int i=0; nthvalue < counter; nthvalue++) {

            numbers[nthvalue] = random.nextInt(end-start) + start;
            
            smallest = Math.min(smallest,numbers[nthvalue]);
 //           greatest = Math.max(greatest,numbers[nthvalue]);
        }
        
        System.out.println("Random numbers: " + Arrays.toString(numbers) + "\n");
        System.out.println("The user asked Nth Smallest number is: " + smallest + "\n");
//        System.out.println("The user asked Nth Greatest number is: " + greatest + "\n");	
		
        scanner.close();
	}	
}
	*/

	/* 
	 // Another similar example:
	  
	public static void main(String[] args) {
				
		int startcounter = 1;
		int n = 0;
		int endCounter = 500;
		int arraysize = endCounter - startcounter;
		int numbers[] = new int[arraysize + 1];
		Random rnum = new Random();
		System.out.println("Random Numbers are as follows:=============>\n");
		for (int counter = startcounter; counter <= endCounter; counter++) {
			int c = n++;
			int num = rnum.nextInt(500);
			numbers[c] = num;
			System.out.println(numbers[c]);

		}
		
		int smallest = numbers[0];
		int biggest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > biggest)
				biggest = numbers[i];
			else if (numbers[i] < smallest)
				smallest = numbers[i];
		}
		System.out.println("Largest Number is : " + biggest);
		System.out.println("Smallest Number is : " + smallest);
	}			
}
	 */



