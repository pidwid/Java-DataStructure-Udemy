package learning_datastructures.ds.stack;

public class App {
    public static void main(String[] args) {
        System.out.println(reverseString("hello how are you?"));
    }
        public static String reverseString(String str){
        Stack stack = new Stack(str.length());
        for (int i = 0; i< str.length(); i++){
         stack.push(str.charAt(i));
        }
            StringBuilder reversed = new StringBuilder();
            while (!stack.isEmpty()){
                reversed.append(stack.pop());
            }

        return reversed.toString();
    }

}
