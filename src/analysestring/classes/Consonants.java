package analysestring.classes;

import analysestring.intrf.Analyse;

public class Consonants implements Analyse {

    public int analyse(String str){          // Подсчёт согласных букв
        int summ = 0;
        char[] strArr = str.toLowerCase().toCharArray();

        for (char ch : strArr) {
            switch (ch){
                case 'a' : break;
                case 'e' : break;
                case 'i' : break;
                case 'o' : break;
                case 'u' : break;
                case 'y' : break;
                default : summ += 1;
            }
        }
        return summ;
    }
}
