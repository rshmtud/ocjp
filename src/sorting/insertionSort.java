import java.util.Scanner;

public class insertionSort{
    public static void printArray(int[] a){
        for(int i =0 ; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void sort(int[]a){
        //Insertion sort
        for (int j=1; j<a.length;j++)
        {   int key = a[j];
            for(int k = j-1;k>=0 && a[k]>key ;k--){
                System.out.print("\ncomparing "+ a[k] + "and "+ key + " a[j]="+a[j]);
                    a[k+1] = a[k];
                    a[k]=key;
                printArray(a);
            }
        }
    }

    public void sortDescending(int[]){
        
    }

    public static int[] inputIntArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of input");
        int elementSize = sc.nextInt();
        int toSort[] = new int[elementSize];
        System.out.println("Enter the elements");
        for(int i =0 ; i<elementSize; i++){
            toSort[i] = sc.nextInt();
        }
        sc.close();
        return toSort;
    }
    public static void main(String ...args){
        //input numbers to be sorted
        int[] toSort ={5,2,4,6,1,3};

//        int[] toSort = inputIntArray();
        //elements are
        for(int i =0 ; i<toSort.length; i++){
            System.out.print(toSort[i] + " ");
        }

        System.out.println("\nSorted array is:");
        sort(toSort);
    }
}