import java.io.*;
import java.util.ArrayList;

public class Parser2 {
    ArrayList<String> intrebari = new ArrayList<String>();
    ArrayList<String> raspunsuri = new ArrayList<String>();
    ArrayList<Integer> numere = new ArrayList<Integer>();
    File fisier;

    public ArrayList<String> getIntrebari() {
        return intrebari;
    }

    public ArrayList<String> getRaspunsuri() {
        return raspunsuri;
    }

    public ArrayList<Integer> getNumere() {
        return numere;
    }

    public Parser2 (String name){
        this.fisier = new File(name);
    }
    public void citireIntrebari() throws IOException {
        BufferedReader buf = new BufferedReader(new FileReader(fisier));
        String line;
        String [] split;
        while ((line= buf.readLine()) != null){
            System.out.println(line);
            split=line.split(",");
            intrebari.add(split[0]);
            int nr = Integer.parseInt(split[1]);
            numere.add(nr);

            for(int i=0;i<nr;i++) {
                line=buf.readLine();
                System.out.println(line);
                raspunsuri.add(line);
            }
        }
    }
    public String toString()
    {
        String s="";
        s=s+getIntrebari()+"\n";
        s=s+getNumere()+"\n";
        s=s+getRaspunsuri()+"\n";
        return s;
    }
}
