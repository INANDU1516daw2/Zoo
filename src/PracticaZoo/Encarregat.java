package PracticaZoo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.ArrayList;

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
    public void vacunar_mamifer (Encarregat encargat, Mamifer mamifer, String vacunacio) {
        ArrayList <String> vacunas_mamifer = new ArrayList <>();
        vacunas_mamifer.add("rabia");
        vacunas_mamifer.add("mixomatosis");
        vacunas_mamifer.add("hepatitis");
        
        Date data = new Date();
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(data);
        
        for(String vacuna : vacunas_mamifer){
            if(vacunacio == vacuna){
                System.out.println("Encarregat "+encargat.getID()+" de nom "+encargat.getNom()+
                        " ha vacunat a " +mamifer.getID()+" de nom "+mamifer.getNom()+" amb anti-"+vacunacio+
                        " en el dia "+gc.get(Calendar.DAY_OF_MONTH) +" en mes "+gc.get(Calendar.MONTH)+
                        " de "+gc.get(Calendar.YEAR) + " a la "+gc.get(Calendar.HOUR_OF_DAY)+"h");
                break;
            }else{
                System.out.println("Vacuna " + vacunacio + " no permesa en mamifers");
                break;
            }
        }
    }
    
    
    //PREGUNTAR A SERGI
    @Override
    public void vacunar_au (Encarregat encargat, Au au, String vacunacio) {
        ArrayList <String> llista_vacunas_aus = new ArrayList <>();
        llista_vacunas_aus.add("gorombo");
        llista_vacunas_aus.add("salmonela");
        llista_vacunas_aus.add("eimerias");
        
        for(String e : llista_vacunas_aus){
            if(vacunacio.equals(e)){
                System.out.println("Encarregat "+encargat.getID()+" de nom "+encargat.getNom()+
                        " ha vacunat a " +au.getID()+" de nom "+au.getNom()+" amb anti-"+vacunacio);
                break;
            }
            else{
                System.out.println("Vacuna " + vacunacio + " no permesa en aus");
                break;
            }
        }
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
        return "\nEncarregat: { Nom: " + getNom() + " | ID: "+ getID() +" | Secció: "+ getID() +" | Sou: "+ getSou()+" }\n";
                
    }
    
    

}
