package lab3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class lab3work{
    
    static double mean(int[] array){
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        double mean=(double)sum/(double)array.length;
        return mean;
    }

    static double median(int[] array){
        Arrays.sort(array);
        int n=array.length;
        if (n % 2 != 0)
            return (double)array[n / 2];
 
        return (double)(array[(n - 1) / 2] + array[n / 2]) / 2.0;
    }
    
    static int mode(int[] array) {
        int maxValue = 0, maxCount = 0, i, j;
  
        for (i = 0; i < array.length; ++i) {
           int count = 0;
           for (j = 0; j < array.length; ++j) {
              if (array[j] == array[i])
              ++count;
           }
  
           if (count > maxCount) {
              maxCount = count;
              maxValue = array[i];
           }
        }
        return maxValue;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of array elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter array element:");
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(mean(arr));
        System.out.println(median(arr));
        System.out.println(mode(arr));
    }
    
}
