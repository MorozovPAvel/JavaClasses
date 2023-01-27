package src;

public class TestClass {
    public static void main(String[] args) {
        sayName("Pavel");
    }

    public static void sayName(String name){
        System.out.println(name);
        System.out.println("Hello World");
        System.out.println(seyHEllo());
    }

    public static String seyHEllo(){
        return "Hello World";
    }
}
