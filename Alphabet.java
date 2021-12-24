public class Alphabet {

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
