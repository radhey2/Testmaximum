package javapractice;

public class TestmaximumUc1point2 {
	static int findMaximum(int arr[], int low, int high)
    {
       int max = arr[low];
       int i;
       for (i = low; i <= high; i++)
       {
           if (arr[i] > max)
              max = arr[i];
       }
       return max;
    }
      
    // main function
    public static void main (String[] args) 
    {
        int arr[] = {100, 300, 40};
        int n = arr.length;
        System.out.println("The maximum element is "+ 
                            findMaximum(arr, 0, n-1));
    }
}

