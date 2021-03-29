import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws IOException {
       /* Scanner sc = new Scanner (System.in);
        InferenceEngine e = new InferenceEngine();
        String s;
        e.afisare();
        int x=5;
        while (x > 0) {
            System.out.println("Dati Marca masinii");
            s = sc.nextLine();
            e.inference(s);
            e.afisare();
            x--;
        }
        System.out.println(e.getConcluzie());*/
        Parser2 parser2 = new Parser2("intrebari.txt");
        parser2.citireIntrebari();
        System.out.println(parser2);
    }
}
