import java.util.*;

public class selectionSort{

    public static void printArray(int[] a){
        Arrays.stream(a).forEach(System.out::print);
    }
    public static void sort(int a[]){
        int min =0;
        int index=0;
        for(int i = 0 ; i<a.length; i++){
            min=a[i];
            for(int j=i+1; j<a.length;j++){
                if(a[j]<min){
                    min=a[j];
                    index=j;
                }
            }
            if(min==a[i]) continue;
            a[index]=a[i];
            a[i]=min;
            printArray(a);
        }
        System.out.println("Sorted array is: ");
        printArray(a);
    }

    public static void main(String ...args){
        int[] toSort ={5,2,4,6,1,3};
        sort(toSort);
    }
}