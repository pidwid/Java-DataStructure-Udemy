package learning_datastructures.ds.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class selection {
    public static void main(String[] args) {
        int x;
        System.out.println("enter number of elements");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        int[] arr = new int[x];
        System.out.println("enter elements");
        for(int i= 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i< arr.length-1; i++){
            int largest = 0;
            int j;
            for(j =1; j<arr.length-i;j++){
                if(arr[j] > arr[largest]){
                    largest = j;
                }
            }
            if(arr[j-1] != arr[largest]){
              int temp = 0;
              temp = arr[j-1];
              arr[j-1] = arr[largest];
              arr[largest] = temp;
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
