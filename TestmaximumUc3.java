package javapractice;

public class TestmaximumUc3 {
    // Function to find the biggest of three numbers
    static String biggestOfThree(String s1, String s2, String s3)
    {
         
      
        // Comparing all 3 numbers
        if (s1.length() > s2.length() && s1.length() > s3.length()) 
        	return s1;
        

        // Comparing 2nd no with 1st and 3rd no
        else if 
        	(s2.length() > s1.length() && s2.length() > s3.length())
        	return s2;
        
        else
        	
            // Returning 3rd no, Its sure it is greatest
            return s3;
    }
 
    // Main driver function
    public static void main(String[] args)
    {
        String  largest;

        String s1 ="Apple";
        String s2 ="Banana";
        String s3 ="peach";
        // Considering random integers three numbers
    
        // Calling the function in main() body
        largest = biggestOfThree(s1, s2, s3);
 
        // Printing the largest number
        System.out.println(largest
                           + " is the largest String.");
    }

}
