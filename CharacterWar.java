public class CharacterWar {

    /*
    Война букв!
    2 команды символов, у каждого своя сила

    Состав левой команды:
        w - 4
        p - 3
        b - 2
        s - 1
    Состав правой команды:
        m - 4
        q - 3
        d - 2
        z - 1

    В качестве аргумента передается строка, и начинается война букв!
    В результате срожения в консоль выводится сообщение о команде победителе
     */

    public static void main(String[] args) {
        War war = new War();
        System.out.println(war.start("wpbafdfsdfsdfafd"));

    }
}
class War {

    public static String start(String str) {
        int countR = 0;
        int countL = 0;

        String[] res = str.split("");

        for(String c : res){
            switch (c){
                case "w" : countL = countL + 4;
                    break;
                case "p" : countL = countL + 3;
                    break;
                case "b" : countL = countL + 2;
                    break;
                case "s" : countL = countL + 1;
                    break;
                case "m" : countR = countR + 4;
                    break;
                case "q" : countR = countR + 3;
                    break;
                case "d" : countR = countR + 2;
                    break;
                case "z" : countR = countR + 1;
                    break;
            }
        }

        if (countL>countR){
            return "Left side wins!";
        }
        if (countL<countR) {
            return "Right side wins!";
        }

        return "Let's fight again!";

    }
}
