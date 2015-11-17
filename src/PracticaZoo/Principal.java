package PracticaZoo;
 
 public class Principal {
     
     public static void main(String[] args) {
         
         Mamifer mamifer_1 = new Mamifer();
         mamifer_1.setNom("Manolo");
         mamifer_1.setRaça("goril·la");
         mamifer_1.setAlimentacio("hervívor");
         System.out.println(mamifer_1);
         
         Peix  peix_1 = new Peix();
         peix_1.setNom("Fishy");
         System.out.println(peix_1);
         
         Reptil reptil_1 = new Reptil();
         reptil_1.setNom("Dragon");
         reptil_1.setAlimentacio("omnívor");
         System.out.println(reptil_1);
         
         Au au_1 = new Au();
         au_1.setNom("Birdy");
         System.out.println(au_1);
         
         Artropode artropode_1 = new Artropode();
         artropode_1.setNom("Bicho");
         System.out.println(artropode_1);
         
         Amfibi amfibi_1 = new Amfibi();
         amfibi_1.setNom("Ranita");
         System.out.println(amfibi_1);
         
         
         
//        System.out.println(mamifer_1);
//        System.out.println(mamifer_1.getNom());
//        System.out.println("son iguals? " + mamifer_1.equals(mamifer_2));
//        System.out.println("es vertebrat? " + mamifer_1.isVertebrat());
//        System.out.println("es femeni? " + mamifer_1.isFemeni());
//        
//        Mamifer mamifer_3 = new Mamifer();
//        mamifer_3.reproduir(mamifer_1.getID(), mamifer_2.getID(), "MF03");
//        
//        System.out.println(mamifer_3);
        
         
         Encarregat Morote = new Encarregat("Morote","333",10,1800);
         System.out.println(Morote);
         
         
         Encarregat Grau = new Encarregat("Marta","666",13,1600);
         System.out.println(Grau);
         
         Grau.vacunar(Grau.getID(),Grau.getNom(),mamifer_1.getID(),mamifer_1.getNom());
         Grau.vacunar(Grau.getID(),Grau.getNom(),reptil_1.getID(),reptil_1.getNom());
         Grau.tractar(Grau.getID(),Grau.getNom(),peix_1.getID(),peix_1.getNom());
         Grau.tractar(Grau.getID(),Grau.getNom(),au_1.getID(),au_1.getNom());
         
         Morote.netejar(Morote.getID(),Morote.getNom(),au_1.getID(),au_1.getNom());
         Morote.netejar(Morote.getID(),Morote.getNom(),reptil_1.getID(),reptil_1.getNom());
         Morote.alimentar(Morote.getID(),Morote.getNom(),reptil_1.getID(),reptil_1.getNom(),reptil_1.getAlimentacio());
         Morote.alimentar(Morote.getID(),Morote.getNom(),mamifer_1.getID(),mamifer_1.getNom(),mamifer_1.getAlimentacio());
                
         
             
     }
 }