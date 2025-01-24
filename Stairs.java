// java Program for print the above pattern 
import java.util.Scanner;  // Import the Scanner class

class GFG {
    
	
	// Function definition 
	static void pattern(int n)
	{ 
		// for loop for rows 
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a character:");
        String meh = myObj.nextLine();  // Read user input

		for (int i = n; i > 0; i--) { 
	
			// conditional operator 
			int k; 
			if (i % 1 != 0) 
				k = i + 1; 
			else
				k = i; 
	
			// according to value of k carry 
			// out further operation 
			for (int j = 0; j < k; j++) 
				System.out.print(" "); 
			System.out.println(); 
		} 
	} 
	
	// Driver code 
	public static void main(String args[]) 
	{ 
		int n = 6; 
		pattern(n); 
	} 
} 


