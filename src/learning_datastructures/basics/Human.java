package basics;

public class Human {

   private String name;
   private int age;
   private int height;
   private String eyeColor;

   Human(String name, int age, int height, String eyeColor){
      this.name = name;
      this.age = age;
      this.height = height;
      this.eyeColor = eyeColor;
   }

   void  speak(){
      System.out.println("Hello, my name is " + name + " my age is " + age + " my height is " + height + " my eye color is " + eyeColor);
   }

   public void eat(){
      System.out.println("i am eating");
   }
}
