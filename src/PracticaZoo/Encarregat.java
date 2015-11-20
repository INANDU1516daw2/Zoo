package PracticaZoo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.ArrayList;
/**
 * Creció de la classe Encarregat que hereta de Empleat i implementa les interfícies Cuidador i Veterinari
 */
public class Encarregat extends Empleat implements Veterinari, Cuidador {
    /**
     * Constructor amb paràmetres
     * @param nom
     * @param ID
     * @param seccio
     * @param sou 
     */
    public Encarregat(String nom, String ID, int seccio, double sou) {
        this.nom = nom;
        this.ID = ID;
        this.seccio = seccio;
        this.sou = sou;
    }
    
    /**
     * Constructor per defecte, amb valors per defecte
     */
    public Encarregat() {
        nom = "desconegut";
        ID = "desconeguda";
        seccio = 0;
        sou = 648.99;
    }
    
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        //son de la mateixa classe els 2 objectes ?
        if (getClass() != obj.getClass()) {
            return false;
        }
        //LOWCASTING
        final Encarregat other = (Encarregat) obj;
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
     * Agafa seccio
     * @return seccio 
     */
    public int getSeccio() {
        return seccio;
    }

    /**
     * Defineix seccio
     * @param seccio 
     */
    public void setSeccio(int seccio) {
        this.seccio = seccio;
    }

    /**
     * Agafa sou
     * @return sou 
     */
    public double getSou() {
        return sou;
    }

    /**
     * Defineix sou
     * @param sou 
     */
    public void setSou(double sou) {
        this.sou = sou;
    }

    
    /**
     * El objecte encarregat vacuna al objecte mamífer si la vacuna pasada com argument està continguda en la llista vacunes
     * @param encarregat
     * @param mamifer
     * @param vacunacio 
     */
    
    @Override
    public void vacunar_mamifer (Encarregat encarregat, Mamifer mamifer, String vacunacio) {
        ArrayList <String> vacunas_mamifer = new ArrayList <>();
        vacunas_mamifer.add("rabia");
        vacunas_mamifer.add("mixomatosis");
        vacunas_mamifer.add("hepatitis");
        
        Date data = new Date();
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(data);
        
        boolean vacuna_permesa = false;
        
        for(String vacuna : vacunas_mamifer){
            if(vacunacio.equals(vacuna)){
                vacuna_permesa = true;
                System.out.println("Encarregat "+encarregat.getID()+" de nom "+encarregat.getNom()+
                        " ha vacunat a " +mamifer.getID()+" de nom "+mamifer.getNom()+" amb anti-"+vacunacio+
                        " en el dia "+gc.get(Calendar.DAY_OF_MONTH) +" en mes "+gc.get(Calendar.MONTH)+
                        " de "+gc.get(Calendar.YEAR) + " a las "+gc.get(Calendar.HOUR_OF_DAY)+":"+gc.get(Calendar.MINUTE)+":"
                        +gc.get(Calendar.SECOND));
                break;
            }              
        }
        if(vacuna_permesa == false){
            System.out.println("Vacuna " + vacunacio + " no permesa en mamifers");
        }
    }
    
    
    /**
     * El objecte encarregat vacuna al objecte au si la vacuna pasada com argument està continguda en la llista vacunes
     * @param encargat
     * @param au
     * @param vacunacio 
     */
    @Override
    public void vacunar_au (Encarregat encarregat, Au au, String vacunacio) {
        ArrayList <String> llista_vacunas_aus = new ArrayList <>();
        llista_vacunas_aus.add("eimerias");
        llista_vacunas_aus.add("salmonela");
        
        Date data = new Date();
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(data);
        
        boolean vacuna_permesa = false;
        for(String e : llista_vacunas_aus){
            if(vacunacio.equals(e)){
                vacuna_permesa = true;
                System.out.println("Encarregat "+encarregat.getID()+" de nom "+encarregat.getNom()+
                        " ha vacunat a " +au.getID()+" de nom "+au.getNom()+" amb anti-"+vacunacio+
                        " en el dia "+gc.get(Calendar.DAY_OF_MONTH) +" en mes "+gc.get(Calendar.MONTH)+
                        " de "+gc.get(Calendar.YEAR) + " a las "+gc.get(Calendar.HOUR_OF_DAY)+":"+gc.get(Calendar.MINUTE)+":"
                        +gc.get(Calendar.SECOND));
                break;
            }
            if(vacuna_permesa == false){
                 System.out.println("Vacuna " + vacunacio + " no permesa en aus");
            }
        }
    }

    /**
     * @see Veterinari
     */
    
    @Override
    public void tractar(String ID_encarregat, String nom_encarregat, String ID_animal, String nom_animal) {
        System.out.println("Encarregat "+ID_encarregat+" de nom "+nom_encarregat+" ha tractat a " + ID_animal+" de nom "+nom_animal);
    }

    /**
     * @see Veterinari
     */
    @Override
    public void netejar(String ID_encarregat, String nom_encarregat, String ID_animal, String nom_animal) {
                System.out.println("Encarregat "+ID_encarregat+" de nom "+nom_encarregat+" ha netejat a " + ID_animal+" de nom "+nom_animal);
    }

    /**
     * El objecte encarregat alimenta al objecte animal si el tipus de menjar esta permès
     * @param ID_encarregat
     * @param nom_encarregat
     * @param ID_animal
     * @param nom_animal
     * @param tipus_aliment 
     */
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
