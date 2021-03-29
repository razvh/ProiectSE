import java.util.HashMap;


public class Regula {
    public int getId() {
        return id;
    }

    private final int id;

    public HashMap <String,Boolean> getPremisses() {
        return premisses;
    }

    private final HashMap <String,Boolean> premisses;

    public Concluzie getConclusion() {
        return conclusion;
    }

    private final Concluzie conclusion;
    public Regula(int id, HashMap <String,Boolean> premisses, Concluzie conclusion) {
        this.id = id;
        this.premisses = premisses;
        this.conclusion = conclusion;
    }
    public String toString (){
        return ("ID " + id + "\nPremise " + premisses + "\nConcluzie " + conclusion);
    }
    public boolean isTrue () {
        for (String i : premisses.keySet()){
            if (premisses.get(i).equals(false)){
                 return false;
            }
        }
        return true;
    }
}


