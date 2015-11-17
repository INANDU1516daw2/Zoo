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
    public void vacunar(String ID_encarregat, String nom_encarregat, String ID_animal, String nom_animal) {
        System.out.println("Encarregat "+ID_encarregat+" de nom "+nom_encarregat+" ha vacunat a " + ID_animal+" de nom "+nom_animal);
    }

    @Override
    public void tractar(String ID_encarregat, String nom_encarregat, String ID_animal, String nom_animal) {
        System.out.println("Encarregat "+ID_encarregat+" de nom "+nom_encarregat+" ha tractat a " + ID_animal+" de nom "+nom_animal);
    }

    @Override
    public void netejar(String ID_encarregat, String nom_encarregat, String ID_animal, String nom_animal) {
                System.out.println("Encarregat "+ID_encarregat+" de nom "+nom_encarregat+" ha netejat a " + ID_animal+" de nom "+nom_animal);

    }

    @Override
    public void alimentar(String ID_encarregat, String nom_encarregat, String ID_animal, String nom_animal, String tipus_aliment) {
        System.out.print("Encarregat "+ID_encarregat+" de nom "+nom_encarregat+" ha alimentat a " + ID_animal+" de nom "+nom_animal);
        if(tipus_aliment == "hervívor"){
            System.out.println(" amb herba");
        }
        else if(tipus_aliment == "carnívor"){
            System.out.println(" amb carn");
        }
        else if(tipus_aliment == "omnívor"){
            System.out.println(" amb carn i herba");
        }
        else{
            System.out.println(" {tipus de menjar no permitit}");
        }
    }

    @Override
    public String toString() {
        return "Encarregat{" + "nom: " + nom + '}';
    }
    

}
