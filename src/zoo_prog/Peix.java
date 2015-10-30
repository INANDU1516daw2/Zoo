package zoo_prog;

public class Peix extends Animal {

    public Peix(String nom, String ID, int edat, int esp_vida, String tipus_aliment) {
        super(nom, ID, edat, esp_vida, tipus_aliment);
    }

    public Peix() {
    }

    @Override
    public boolean isVertebrat() {
        vertebrat = true;
        return vertebrat;
    }

    public void setVertebrat(boolean vertebrat) {
        this.vertebrat = vertebrat;
    }
    
    @Override
    public String toString() {
        return "Animal{" + "nom=" + getNom() + ", ID=" + getID() + ", edat=" + getEdat() + ", esp_vida=" + getEsp_vida() + ", vertebrat=" + isVertebrat() + ", tipus_aliment=" + getTipus_aliment() + '}';
    }
    
}
