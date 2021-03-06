package MoerseCode;
import java.util.Scanner;

public class Menu {
    private String input;
    private int decision;
    String translation;
    Alphabet ab = new Alphabet();

    public void welcome(){
        Scanner scan = new Scanner(System.in);

        System.out.println("\t\t\t\tMorsecode ├╝bersetzer");
        System.out.print("\n(1) Von Morse zu Normal\n(2) Von normal zu Morse\n=> ");
        decision = scan.nextInt();
    }

    //Je nachdem welche Entscheidung vom User getroffen wird, wird der String ├╝bersetzt.
    public void elaborate(){

        switch(decision){
            case 1: 
                System.out.print("Bitte geben sie ihr Wort ein :"); giveString();
                translation = ab.translateToNormal(input);
                break;

            case 2:
                System.out.print("Bitte geben sie ihr Morse-Code ein :"); giveString();
                translation = ab.translateToNormal(input);
                break;

            default :
                System.out.println("Diese Option existiert nicht");
        }
    }

    //Eingabe des zu codierenden Wortes.
    public void giveString(){
        Scanner scan = new Scanner(System.in);
        input = scan.nextLine();

    }

    public void output(){
        System.out.println("-> " + translation);
    }

    
    
}
