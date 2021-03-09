package analysestring.classes;

import analysestring.intrf.Analyse;

public class Vowels implements Analyse {

    public int analyse(String str){          // Подсчёт гласных букв
        int summ = 0;
        char[] strArr = str.toLowerCase().toCharArray();

        for (char ch : strArr) {
            switch (ch){
                case 'a' :
                    summ += 1;
                    break;
                case 'e' :
                    summ += 1;
                    break;
                case 'i' :
                    summ += 1;
                    break;
                case 'o' :
                    summ += 1;
                    break;
                case 'u' :
                    summ += 1;
                    break;
                case 'y' :
                    summ += 1;
                    break;
            }
        }
        return summ;
    }
}
