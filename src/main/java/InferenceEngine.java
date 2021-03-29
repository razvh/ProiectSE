import java.io.IOException;
import java.util.ArrayList;

public class InferenceEngine {
    ArrayList<Regula> Reguli;
    ArrayList<Integer> ID;

    public String getConcluzie() {
        return concluzie;
    }

    String concluzie;
    public InferenceEngine(String fisier) throws IOException {
        Parser p = new Parser(fisier);
        Reguli = p.citireFisier();
        ID = new ArrayList<>();
    }
    public void afisare (){
        for (Regula r : Reguli){
            System.out.println(r.getPremisses());
            System.out.println(r.getConclusion());
            System.out.println();
        }
    }
    public void inference(String s){
        for (Regula r : Reguli){
            if (r.getPremisses().containsKey(s)){
                    r.getPremisses().put(s,true);
            }
        }
        for (Regula r : Reguli){
                if(r.isTrue() && !ID.contains(r.getId())){ // Daca premisele sunt adevarate si nu le-am mai parcurs
                    ID.add(r.getId()); // Adaugam regula la cele parcurse
                    concluzie = r.getConclusion().getS(); // Salvam concluzia regulii
                    r.getConclusion().setFlag(true); // O setam pe true
                    inference(concluzie); // Reapelam pentru concluzia aceea
                }
        }
    }
}
