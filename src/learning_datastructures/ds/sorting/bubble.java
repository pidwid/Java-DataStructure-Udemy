package learning_datastructures.ds.sorting;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class bubble {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int x = sc.nextInt();

        int[] arr = new int[x];
        System.out.println("Please enter values");
        for(int i = 0; i< arr.length; i++){
           arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length-1; i++){
            for (int j=0;j<arr.length -1 -i;j++){
                if(arr[j] > arr[j+1]){
                    int temp;
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }

    }
}
