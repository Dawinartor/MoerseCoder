package MoerseCode;
import MoerseCode.Alphabet;

public class Main {

    public static void main(String[] args) {
        Alphabet newA = new Alphabet();
        String ret = newA.translateToMorse("Hallo");
        System.out.println(ret);

    }  

}

