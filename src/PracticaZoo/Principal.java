package PracticaZoo;

import java.util.ArrayList;

 /**
  * 
  * @author Albert Morote
  * @author Marta Grau
  * @author Ingemar Andrade
  */
 public class Principal {
     
     public static void main(String[] args) {
        /**
        * Reproducció animals diferent raça: surgeix fill amb raça aleatoria entre raça pare o mare
        */
         
        //Mamifer pare raça gat
        Mamifer mamifer_1 = new Mamifer();
        mamifer_1.setID("MP01");
        mamifer_1.setRaça("gat");
        
        //Mamifer mare raça gos
        Mamifer mamifer_2 = new Mamifer();
        mamifer_2.setID("MM02");
        mamifer_2.setRaça("gos");
        
        Animal mamifer_3 = new Mamifer();
        mamifer_3.reproduir(mamifer_1.getID(), mamifer_1.getRaça(), mamifer_2.getID(), mamifer_2.getRaça(), "MF03");
        
        System.out.println("");
        
        Animal au_1 = new Au();
        Animal amfibi_1 = new Amfibi();
        Animal artropode_1 = new Artropode();
        Animal peix_1 = new Peix();
        Animal reptil_1 = new Reptil();
        
        ArrayList <Animal> llistaAnimals = new ArrayList <Animal>();
        
        llistaAnimals.add(mamifer_3);
        llistaAnimals.add(au_1);
        llistaAnimals.add(amfibi_1);
        llistaAnimals.add(artropode_1);
        llistaAnimals.add(peix_1);
        llistaAnimals.add(reptil_1);

        
        /* Polimorfisme, la llista conté objectes tipus Animal, pero el metode toString
         * es diferent per a cada tipus de animal que sobreescriu el metode de la classe pare
        */
        for(Animal e : llistaAnimals){
            System.out.println(e.toString()); 
        }
        
        System.out.println("");
        
        Encarregat Morote = new Encarregat("Morote","42",10,1800);
        
        for(Animal e : llistaAnimals){
            Morote.netejar(Morote.getID(), Morote.getNom(), e.getID() , e.getNom(), e.getSeccio());
        }
        
        System.out.println("");
        
        
        Encarregat Grau = new Encarregat("Marta","666",13,1600);
         
        Grau.vacunar_mamifer(Grau, mamifer_1, "colesterol");
        Grau.vacunar_mamifer(Grau, mamifer_1, "rabia");

     }
 }