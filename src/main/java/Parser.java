import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Parser {
    File fisier;
    public Parser (String name){
        this.fisier = new File(name);
    }
    public ArrayList<Regula> citireFisier () throws IOException {
        BufferedReader buf = new BufferedReader(new FileReader(fisier));
        String line;
        Concluzie concluzie;
        ArrayList<Regula> Reguli = new ArrayList<>();
        int contor = 0;
        HashMap <String,Boolean> mapofpremisses;
        while ((line= buf.readLine()) != null){
            mapofpremisses = new HashMap<>();
            String[] split = line.split(",");
            concluzie = new Concluzie( split[split.length - 1], false );
            contor += 1;
            for (int i = 0; i < split.length - 1; i ++){
                mapofpremisses.put(split[i], false);
            }
            Regula r = new Regula(contor,mapofpremisses,concluzie);
            Reguli.add(r);
        }
        return Reguli;
    }
}
