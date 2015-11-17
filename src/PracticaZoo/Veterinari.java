package PracticaZoo;

public interface Veterinari {
    
    public void vacunar_mamifer (Encarregat encargat, Mamifer mamifer, String vacunacio);
    public void vacunar_au (Encarregat encargat, Au au, String vacunacio);
    public void tractar(String ID_encarregat, String nom_encarregat, String ID_animal, String nom_animal);
    
}
