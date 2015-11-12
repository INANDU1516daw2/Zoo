package PracticaZoo;

public class Principal {
    
    public static void main(String[] args) {
        
        Mamifer mamifer_1 = new Mamifer();
        Mamifer mamifer_2 = new Mamifer();
        
        mamifer_1.setID("M001");
        mamifer_2.setID("M002");
        mamifer_1.setNom("manolo");
        
        System.out.println(mamifer_1);
        System.out.println(mamifer_1.getNom());
        System.out.println("son iguals? " + mamifer_1.equals(mamifer_2));
        System.out.println("es vertebrat? " + mamifer_1.isVertebrat());
        System.out.println("es femeni? " + mamifer_1.isFemeni());
        
        Mamifer mamifer_3 = new Mamifer();
        mamifer_3.reproduir(mamifer_1.getID(), mamifer_2.getID(), "MF03");
        
        System.out.println(mamifer_3);
        
        
    }
    
}
