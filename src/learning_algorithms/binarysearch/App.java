package learning_algorithms.binarysearch;
//Divide and Conquer 
public class App {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8};
        System.out.println(binarySearch(a,7));
    }
    /**
     * Pseudo Code
     * intial = 0, last = array.length -1
     * while(initial <= last) do
     *     set mid = (initial+last)/2   ---integer only
     *      if array[mid] == value, return mid
     *      if array[mid] > value  set last = mid-1,
     *      else set initial = mid + 1
     * return -1 
     */ 
    public static int binarySearch(int a[] /**Only Sorted Array */, int x /**value to be searched */){
        int initial = 0, last = a.length -1;
        while(initial <= last){
            int mid = (initial + last) / 2;
            if(a[mid] == x){
                return mid;
            }else if(a[mid] > x){
                last = mid -1;
            }else{
                initial = mid + 1;
            }
        }
    return -1;
    }
}