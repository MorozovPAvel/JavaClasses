import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scan_a = new Scanner(System.in);
        Scanner scan_b = new Scanner(System.in);
        Scanner scan_c = new Scanner(System.in);

        // параметры в конструкторе
        Calcul cal = new Calcul(scan_a.nextInt(), scan_b.nextLine(), scan_c.nextInt());
        cal.res();

        //вариант для пустого конструктора
        Calcul cal1 = new Calcul();
        cal1.res(scan_a.nextInt(), scan_b.nextLine(), scan_c.nextInt());


    }
}
class Calcul{
    private int a;
    private int b;
    private String c;


    // пустой конструктор с методом
    public Calcul(){}

    void res (int first, String mathAction, int second){
        this.a = first;
        this.b = second;
        this.c = mathAction;

        switch (c){
            case "+" : System.out.println(a+b);
                break;
            case "-" : System.out.println(a-b);
                break;
            case "*" : System.out.println(a*b);
                break;
            case "/" : System.out.println(a/b);
                break;
        }
    }



    // конструктор 2 с методом
    public Calcul(int first, String mathAction, int second){
        this.a = first;
        this.b = second;
        this.c = mathAction;
    }

    void res (){
        switch (c){
            case "+" : System.out.println(a+b);
                break;
            case "-" : System.out.println(a-b);
                break;
            case "*" : System.out.println(a*b);
                break;
            case "/" : System.out.println(a/b);
                break;
        }
    }

}