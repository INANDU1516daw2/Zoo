package PracticaZoo;

public class Peix extends Animal {

    public Peix(String nom,String ID,String ID_pare,String ID_mare,int edat,
            boolean femeni,float pes,int esp_vida,boolean vertebrat,String alimentacio,
            String reproduccio,String ecosistema,String vacunacio,String seccio){
    }
    
    public Peix(){
        this.nom = "no-catalogat";
        this.ID = "P000";
        this.ID_pare = "P000";
        this.ID_mare = "P000"; 
        this.edat = 0;
        this.femeni = true;
        this.pes = 0;
        this.esp_vida = 0;
        this.vertebrat = true;
        this.alimentacio = "no-catalogat";
        this.reproduccio = "no-catalogat";
        this.ecosistema = "Aquàtic";
        this.vacunacio = "no-catalogat";
        this.seccio = "no-catalogat";
    }
    
    @Override
    public void reproduir (String ID_pare, String ID_mare, String ID_fill) {
        setID_pare(ID_pare);
        setID_mare(ID_mare);
        setID(ID_fill);
    }

    @Override
    public String toString() {
        return "Peix {Nom: " + getNom() + " ID: "+ getID() +" ID_Mare: "+ getID_mare() +
                " ID_Pare: "+getID_pare()+" Edat: "+ getEdat() +". Femeni: "+ isFemeni() +
                " Pes: "+ getPes() +" Esp_Vida: "+ getEsp_vida() +" Alimentació: "+ getAlimentacio() +
                " \n\tReproducció: "+ getReproduccio() +" Ecosistema: "+ getEcosistema() +" Vacunació: "
                + getVacunacio() +" Secció: "+ getSeccio() +"}";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        //son de la mateixa classe els 2 objectes ?
        if (getClass() != obj.getClass()) {
            return false;
        }
        //LOWCASTING Empleat a obj
        final Mamifer other = (Mamifer) obj;
        //tenen el mateix nom ?
        if(ID == other.ID) {
            return true;
        }else{
            return false;
        }
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

    public String getID_pare() {
        return ID_pare;
    }

    public void setID_pare(String ID_pare) {
        this.ID_pare = ID_pare;
    }

    public String getID_mare() {
        return ID_mare;
    }

    public void setID_mare(String ID_mare) {
        this.ID_mare = ID_mare;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public boolean isFemeni() {
        return femeni;
    }

    public void setFemeni(boolean femeni) {
        this.femeni = femeni;
    }

    public float getPes() {
        return pes;
    }

    public void setPes(float pes) {
        this.pes = pes;
    }

    public int getEsp_vida() {
        return esp_vida;
    }

    public void setEsp_vida(int esp_vida) {
        this.esp_vida = esp_vida;
    }

    public boolean isVertebrat() {
        return vertebrat;
    }

    public void setVertebrat(boolean vertebrat) {
        this.vertebrat = vertebrat;
    }

    public String getAlimentacio() {
        return alimentacio;
    }

    public void setAlimentacio(String alimentacio) {
        this.alimentacio = alimentacio;
    }

    public String getReproduccio() {
        return reproduccio;
    }

    public void setReproduccio(String reproduccio) {
        this.reproduccio = reproduccio;
    }

    public String getEcosistema() {
        return ecosistema;
    }

    public void setEcosistema(String ecosistema) {
        this.ecosistema = ecosistema;
    }

    public String getVacunacio() {
        return vacunacio;
    }

    public void setVacunacio(String vacunacio) {
        this.vacunacio = vacunacio;
    }

    public String getSeccio() {
        return seccio;
    }

    public void setSeccio(String seccio) {
        this.seccio = seccio;
    }
     
}
    
    