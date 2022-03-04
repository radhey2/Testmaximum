package javapractice;

public class TestmaximumUc4 {
	static int biggestOfThree(int x, int y, int z, int q, int w)
    {
 
        // Comparing all 3 numbers
        if (x >= y && x >= z && x >= q && x >= w)
 
            // Returning 1st number if largest
            return x;
        else if (y >= x && y >= z && y >= q && y > w)
        	 
            // Return z if the above conditions are false
            return y;
        // Comparing 2nd no with 1st and 3rd no
        else if (q >= x && q >= y && q >= z && q >= w )
 
            // Return z if the above conditions are false
            return q;
        
        else if (z >= x && z >=y && z >= q && z >= w)
        	 
            // Return z if the above conditions are false
            return z;
        
      
 
            // Returning 3rd no, Its sure it is greatest
		return w;
    }
 
    // Main driver function
    public static void main(String[] args)
    {
        int a, b, c,d, e, largest;
 
        // Considering random integers three numbers
        a = 5;
        b = 10;
        c = 3;
        d = 15;
        e = 30;
        // Calling the function in main() body
        largest = biggestOfThree(a, b, c,d, e);
 
        // Printing the largest number
        System.out.println(largest
                           + " is the largest number.");
    }
}



