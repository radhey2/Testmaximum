package javapractice;

public class TestmaximumUc2point2 {
	 static double biggestOfThree(double x, double y, double z)
	    {
	 
	        // Comparing all 3 numbers
	        if (x >= y && x >= z)
	 
	            // Returning 1st number if largest
	            return x;
	 
	        // Comparing 2nd no with 1st and 3rd no
	        else if (y >= x && y >= z)
	 
	            // Return z if the above conditions are false
	            return y;
	 
	        else
	 
	            // Returning 3rd no, Its sure it is greatest
	            return z;
	    }
	 
	    // Main driver function
	    public static void main(String[] args)
	    {
	       double  largest;
	 
	        // Considering random integers three numbers
	        double a = 2.5;
	        double b= 20.5;
	        double c = 3.1;
	        // Calling the function in main() body
	        largest = biggestOfThree(a, b, c);
	 
	        // Printing the largest number
	        System.out.println(largest
	                           + " is the largest number.");
	    }
	}
