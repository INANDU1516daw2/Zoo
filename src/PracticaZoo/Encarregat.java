package PracticaZoo;

public class Encarregat extends Empleat implements Veterinari, Cuidador {
    
    public Encarregat(String nom, String ID, int seccio, double sou) {
        this.nom = nom;
        this.ID = ID;
        this.seccio = seccio;
        this.sou = sou;
    }

    public Encarregat() {
        nom = "desconegut";
        ID = "desconeguda";
        seccio = 0;
        sou = 648.99;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getSeccio() {
        return seccio;
    }

    public void setSeccio(int seccio) {
        this.seccio = seccio;
    }

    public double getSou() {
        return sou;
    }

    public void setSou(double sou) {
        this.sou = sou;
    }

    @Override
    public void vacunar(String nom_animal) {
        System.out.println("S'ha cavunat a " + nom_animal);
    }

    @Override
    public void tractar() {
    }

    @Override
    public void Netejar() {
    }

    @Override
    public void Alimentar() {
        System.out.println("S'ha alimentat al animal");
    }

    @Override
    public String toString() {
        return "Encarregat{" + "nom: " + nom + '}';
    }
    

}
