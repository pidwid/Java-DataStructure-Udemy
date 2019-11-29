package learning_algorithms.linearsearch;

public class App{
    public static void main(String[] args) {
        
    }

    public static int linearsearch(int a[], int x){
        for(int i = 0; i< a.length; i++){
            if(a[i] == x){
                return i;
            }
        }return -1;
    }
}