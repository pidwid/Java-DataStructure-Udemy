package ADT;

public class Counter {

    String name;
    int value;

    Counter(String str){
        this.name = str;
    }

    public void increment() {
        value++;
    }
    int getCurrentValue(){
        return  value;
    }
    public String toString(){
        return  name + ": " +value;
    }
}
