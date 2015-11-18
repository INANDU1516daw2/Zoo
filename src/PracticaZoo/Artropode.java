package PracticaZoo;
/**
 * Creacio de la classe Artropode que hereta de Animal
 * 
 */
public class Artropode extends Animal {
    
    /**
     * Constructor amb parametres
     * @param nom
     * @param raça
     * @param ID
     * @param ID_pare
     * @param ID_mare
     * @param edat
     * @param femeni
     * @param pes
     * @param esp_vida
     * @param vertebrat
     * @param alimentacio
     * @param reproduccio
     * @param ecosistema
     * @param vacunacio
     * @param seccio 
     */
    public Artropode (String nom,String raça,String ID,String ID_pare,String ID_mare,int edat, boolean femeni,float pes,int esp_vida,boolean vertebrat,String alimentacio,String reproduccio,String ecosistema,String vacunacio,String seccio){
        this.nom = nom;
        this.raça = raça;
        this.ID = ID;
        this.ID_pare = ID_pare;
        this.ID_mare = ID_mare; 
        this.edat = edat;
        this.femeni = femeni;
        this.pes = pes;
        this.esp_vida = esp_vida;
        this.vertebrat = vertebrat;
        this.alimentacio = alimentacio;
        this.reproduccio = reproduccio;
        this.ecosistema = ecosistema;
        this.vacunacio = vacunacio;
        this.seccio = seccio;
    }
    
    /**
     * Constructor per defecte, amb valors per defecte
     */
    public Artropode(){
        this.nom = "no-catalogat";
        this.raça = "no-catalogat";
        this.ID = "AR00";
        this.ID_pare = "AR00";
        this.ID_mare = "AR00"; 
        this.edat = 0;
        this.femeni = true;
        this.pes = 0;
        this.esp_vida = 0;
        this.vertebrat = false;
        this.alimentacio = "no-catalogat";
        this.reproduccio = "no-catalogat";
        this.ecosistema = "Terrestre";
        this.vacunacio = "no-catalogat";
        this.seccio = "no-catalogat";
    }
    
    /**
     * @see Animal
     */
    @Override
    public void reproduir (String ID_pare, String ID_mare, String ID_fill) {
        setID_pare(ID_pare);
        setID_mare(ID_mare);
        setID(ID_fill);
    }
    
    /**
     * Reimplementacio de la cadena toString()
     */
    @Override
    public String toString() {
        return "Artropode {Nom: " + getNom() + " | Raça: "+ getRaça() +" ID: "+ getID() +" ID_Mare: "+ getID_mare() +
                " ID_Pare: "+getID_pare()+" Edat: "+ getEdat() +". Femeni: "+ isFemeni() +
                " Pes: "+ getPes() +" Esp_Vida: "+ getEsp_vida() +" Alimentació: "+ getAlimentacio() +
                " \n\tReproducció: "+ getReproduccio() +" Ecosistema: "+ getEcosistema() +" Vacunació: "
                + getVacunacio() +" Secció: "+ getSeccio() +"}";
    }
    /**
     * Comprovacio si dos objectes son iguals
     * @param obj
     * 
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        //son de la mateixa classe els 2 objectes ?
        if (getClass() != obj.getClass()) {
            return false;
        }
        //LOWCASTING 
        final Artropode other = (Artropode) obj;
        //tenen el mateix nom ?
        if(ID == other.ID) {
            return true;
        }else{
            return false;
        }
    }
    /**
     * Agafa nom
     * @return nom 
     */
    public String getNom() {
        return nom;
    }
    /**
     * Defineix nom
     * @param nom 
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    /**
     * Agafa raça
     * @return raça 
     */
    public String getRaça() {
        return raça;
    }
    /**
     * Defineix raça
     * @param raça 
     */
    public void setRaça(String raça) {
        this.raça = raça;
    }
    /**
     * Agafa ID
     * @return ID 
     */
    public String getID() {
        return ID;
    }
    /**
     * Defineix ID
     * @param ID 
     */
    public void setID(String ID) {
        this.ID = ID;
    }
    /**
     * Agafa ID_pare
     * @return ID_pare 
     */
    public String getID_pare() {
        return ID_pare;
    }
    /**
     * Defineix ID_pare
     * @param ID_pare 
     */
    public void setID_pare(String ID_pare) {
        this.ID_pare = ID_pare;
    }
    /**
     * Agafa ID_mare
     * @return ID_mare 
     */
    public String getID_mare() {
        return ID_mare;
    }
    /**
     * Defineix ID_mare
     * @param ID_mare 
     */
    public void setID_mare(String ID_mare) {
        this.ID_mare = ID_mare;
    }
    /**
     * Agafa edat
     * @return edat 
     */
    public int getEdat() {
        return edat;
    }
    /**
     * Defineix edat
     * @param edat 
     */
    public void setEdat(int edat) {
        this.edat = edat;
    }
    /**
     * Agafa femeni
     * @return femeni 
     */
    public boolean isFemeni() {
        return femeni;
    }
    /**
     * Defineix femeni
     * @param femeni 
     */
    public void setFemeni(boolean femeni) {
        this.femeni = femeni;
    }
    /**
     * Agafa pes
     * @return pes 
     */
    public float getPes() {
        return pes;
    }
    /**
     * Defineix pes
     * @param pes 
     */
    public void setPes(float pes) {
        this.pes = pes;
    }
    /**
     * Agafa esp_vida
     * @return esp_vida 
     */
    public int getEsp_vida() {
        return esp_vida;
    }
    /**
     * Defineix esp_vida
     * @param esp_vida 
     */
    public void setEsp_vida(int esp_vida) {
        this.esp_vida = esp_vida;
    }
    /**
     * Agafa vertebrat
     * @return vertebrat 
     */
    public boolean isVertebrat() {
        return vertebrat;
    }
    /**
     * Defineix vertebrat
     * @param vertebrat 
     */
    public void setVertebrat(boolean vertebrat) {
        this.vertebrat = vertebrat;
    }
    /**
     * Agafa alimentacio
     * @return alimentacio 
     */
    public String getAlimentacio() {
        return alimentacio;
    }
    /**
     * Defineix alimentacio
     * @param alimentacio 
     */
    public void setAlimentacio(String alimentacio) {
        this.alimentacio = alimentacio;
    }
    /**
     * Agafa reproduccio
     * @return reproduccio 
     */
    public String getReproduccio() {
        return reproduccio;
    }
    /**
     * Defineix reproduccio
     * @param reproduccio 
     */
    public void setReproduccio(String reproduccio) {
        this.reproduccio = reproduccio;
    }
    /**
     * Agafa ecosistema
     * @return ecosistema 
     */
    public String getEcosistema() {
        return ecosistema;
    }
    /**
     * Defineix ecosistema
     * @param ecosistema 
     */
    public void setEcosistema(String ecosistema) {
        this.ecosistema = ecosistema;
    }
    /**
     * Agafa vacunacio
     * @return vacunacio 
     */
    public String getVacunacio() {
        return vacunacio;
    }
   /**
     * Defineix vacunacio
     * @param vacunacio 
     */
    public void setVacunacio(String vacunacio) {
        this.vacunacio = vacunacio;
    }
    /**
     * Agafa seccio
     * @return seccio 
     */
    public String getSeccio() {
        return seccio;
    }
    /**
     * Defineix seccio
     * @param seccio 
     */
    public void setSeccio(String seccio) {
        this.seccio = seccio;
    }
}
    
    