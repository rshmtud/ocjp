// Java implementation of the above approach: 
import java.util.*;

class stringGeneration
{

        // Function to print the output
        static void printTheArray(int arr[], int n)
        {
                for (int i = 0; i < n; i++)
                {
                        System.out.print(arr[i]+" ");
                }
                System.out.println();
        }

        // Function to generate all binary strings
        static void generateAllBinaryStrings(int n,
                                             int arr[], int i)
        {
                System.out.println("i="+i);
                if (i == n)
                {
                        printTheArray(arr, n);
                        return;
                }

                // First assign "0" at ith position
                // and try for all other permutations
                // for remaining positions
//                System.out.println("Rec/ursive call for all i = 0 ");
                arr[i] = 0;
                generateAllBinaryStrings(n, arr, i + 1);

                // And then assign "1" at ith position
                // and try for all other permutations
                // for remaining positions
//                System.out.println("Recursive call for all i = 1, i = "+i);
                arr[i] = 1;
                generateAllBinaryStrings(n, arr, i + 1);
        }

        // Driver Code
        public static void main(String args[])
        {
                int n = 4;

                int[] arr = new int[n];

                // Print all binary strings
                generateAllBinaryStrings(n, arr, 0);
        }
}

// This code is contributed by 
// Surendra_Gangwar 
