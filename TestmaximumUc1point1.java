package javapractice;

public class TestmaximumUc1point1 {
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
        int arr[] = {100, 30, 40, 50, 60, 70, 23, 20};
        int n = arr.length;
        System.out.println("The maximum element is "+ 
                            findMaximum(arr, 0, n-1));
    }
}

