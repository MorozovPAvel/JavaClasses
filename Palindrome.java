public class Palindrome {
    public static void main(String[] args) {
        isPalindrome("123");
        isPalindrome("123321");
        isPalindrome("111");
        isPalindrome("рука");
    }

    public static void isPalindrome(String str){
        boolean result = false;                  // для результата
        StringBuffer s = new StringBuffer(str);
        String string = s.reverse().toString(); //переворачиваем, приводим к строке
        if(string.equals(str)){                 // сравниваем перевернутую и ту что пришла в параметры
            result = true;
        }
        System.out.println(result);
    }
}
