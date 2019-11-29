package basics;

public class Animals {
    private String name;
    private String color;
    private boolean hasFourLeg;
    private boolean haveTail;

    public Animals(String name, String color, boolean hasFourLeg, boolean haveTail) {
        this.name = name;
        this.color = color;
        this.hasFourLeg = hasFourLeg;
        this.haveTail = haveTail;
    }

    void makeNoise(){
        System.out.println("I dont follow orders");
    }

    void eat(){
        System.out.println("Eating");
    }

    void info(){
        System.out.println("Animal is " + name + " its " + color + " in color " + " it has four leg " + hasFourLeg + haveTail);
    }
}
