package MoerseCode;
import Letters.*;

public class Alphabet {

    // erstelle von jedem Buchstaben eine Klasse
    Letter the_A = new A(".-", 'A');
    Letter the_B = new B("-...", 'B');
    Letter the_C = new C("-.-.", 'C');
    Letter the_D = new D("-..", 'D');
    Letter the_E = new E(".", 'E');
    Letter the_F = new F("..-.", 'F');
    Letter the_G = new G("--.", 'G');
    Letter the_H = new H("....", 'H');
    Letter the_I = new I("..", 'I');
    Letter the_J = new J(".---", 'J');
    Letter the_K = new K("-.-", 'K');
    Letter the_L = new L(".-..", 'L');
    Letter the_M = new M("--", 'M');
    Letter the_N = new N("-.", 'N');
    Letter the_O = new O("---", 'O');
    Letter the_P = new P(".--.", 'P');
    Letter the_Q = new Q("--.-", 'Q');
    Letter the_R = new R(".-.", 'R');
    Letter the_S = new S("...", 'S');
    Letter the_T = new T("-", 'T');
    Letter the_U = new U("..-", 'U');
    Letter the_V = new V("...-", 'V');
    Letter the_W = new W(".--", 'W');
    Letter the_X = new X("-..-", 'X');
    Letter the_Y = new Y("-.--", 'Y');
    Letter the_Z = new Z("--..", 'Z');
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
                    translationToMorse.push(letterList[j].morseCode);
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
