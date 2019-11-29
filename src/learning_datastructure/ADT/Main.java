package learning_datastructure.ADT;
public class Main{
    public static void main(String[] args) {
        Counter count = new Counter("count");
        count.increment();
        System.out.println(count.getCurrentValue());

    }

}