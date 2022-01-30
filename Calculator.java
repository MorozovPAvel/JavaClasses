import java.util.Scanner;
// калькулятор для консоли
public class Calculator {
    public static void main(String[] args) {
        /*
        Вводим параметры:
        первое число -> математическое действие -> второе число
         */
        Scanner scan_a = new Scanner(System.in);
        Scanner scan_b = new Scanner(System.in);
        Scanner scan_c = new Scanner(System.in);

        //вызов калькулятора
        Calcul cal1 = new Calcul();
        cal1.result(scan_a.nextInt(), scan_b.nextLine(), scan_c.nextInt());


    }
}
class Calcul{
    private int a;
    private int b;
    private String c;


    public void result (int first, String mathAction, int second){
        this.a = first;
        this.b = second;
        this.c = mathAction;

        switch (c){
            case "+" : System.out.println("= " + (a+b));
                break;
            case "-" : System.out.println("= " + (a-b));
                break;
            case "*" : System.out.println("= " + (a*b));
                break;
            case "/" : System.out.println("= " + (a/b));
                break;
        }
    }
}