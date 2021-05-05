import java.util.Scanner;

public class Uwuifier {

    public static void main(String[] args){
        Scanner uwu = new Scanner(System.in);
        System.out.println("e-entew tewxt to uwufy >-<");

        //TODO: Find a better way to do this other than this long code
        String uwuText = uwu.nextLine();
        uwuText = uwuText.toLowerCase().replace('l', 'w').replaceAll('r', 'w').replace('v', 'f').replaceAll("i", "i-i").replaceAll("d", "d-d").replaceAll("n", "n-n") + " >~<";

        System.out.println(uwuText);
    }

}
