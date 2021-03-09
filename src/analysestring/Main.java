package analysestring;

import java.util.Scanner;
import analysestring.classes.Consonants;
import analysestring.classes.Vowels;

public class Main {
    public static void main(String[] args) {
        Scanner sys = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String str = sys.next();

        Vowels vow = new Vowels();
        Consonants cons = new Consonants();

        System.out.println("Количество гласных букв в строке: " + vow.analyse(str));
        System.out.println("Количество согласных букв в строке: " + cons.analyse(str));
    }
}