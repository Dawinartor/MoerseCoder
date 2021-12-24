package MoerseCode;

public class Alphabet {

    // erstelle von jedem Buchstaben eine Klasse
    Letter the_A = new Letter(".-", 'A');
    Letter the_B = new Letter("-...", 'B');
    Letter the_C = new Letter("-.-.", 'C');
    Letter the_D = new Letter("-..", 'D');
    Letter the_E = new Letter(".", 'E');
    Letter the_F = new Letter("..-.", 'F');
    Letter the_G = new Letter("--.", 'G');
    Letter the_H = new Letter("....", 'H');
    Letter the_I = new Letter("..", 'I');
    Letter the_J = new Letter(".---", 'J');
    Letter the_K = new Letter("-.-", 'K');
    Letter the_L = new Letter(".-..", 'L');
    Letter the_M = new Letter("--", 'M');
    Letter the_N = new Letter("-.", 'N');
    Letter the_O = new Letter("---", 'O');
    Letter the_P = new Letter(".--.", 'P');
    Letter the_Q = new Letter("--.-", 'Q');
    Letter the_R = new Letter(".-.", 'R');
    Letter the_S = new Letter("...", 'S');
    Letter the_T = new Letter("-", 'T');
    Letter the_U = new Letter("..-", 'U');
    Letter the_V = new Letter("...-", 'V');
    Letter the_W = new Letter(".--", 'W');
    Letter the_X = new Letter("-..-", 'X');
    Letter the_Y = new Letter("-.--", 'Y');
    Letter the_Z = new Letter("--..", 'Z');
    // erstelle Array buchstabenliste
    Letter letterList[] = {
        the_A, the_B, the_C, the_D, the_E,
        the_F, the_G, the_H, the_I, the_J,
        the_K, the_L, the_M, the_N, the_O,
        the_P, the_Q, the_R, the_S, the_T,
        the_U, the_V, the_W, the_X, the_Y,
        the_Z
    };

    public String translateToMorse(String word) {

        String translationToMorse;

        for (int i = 0 ; i < word.length() ; i++) {
            for (int j = 0 ; j < 26 ; j++) {
                //Überprüfung wann der Buchstabe der letterList entspricht.
                if(word.equals(letterList[j])) {
                    //Der entsprechende Morsecode des Buchstaben wird in den String gespeichert.
                    translationToMorse.append(letterList[j].getMauserCode());
                }
            }
        }
        return translationToMorse;
    }

    public String translateToNormal(String morseWord) {

        String translationToNormal;

        for(int i = 0 ; i < morseWord.length() ; i++) {
            for(int j = 0 ; j < 26 ; j++) {
                //Wann entspricht der Buchstabe 
                if(morseWord.equals(letterList[j])) {
                    //Der Entsprechende Buchstabe des Morsecodes wird in den String gepushed.
                    translationToNormal.push(letterList[j].name);
                }
            }
        }

        return translationToNormal;
    }
    
}
