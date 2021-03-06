package PracticaZoo;

/**
 * @author Ingemar Andrade
 * @author Marta Grau
 * @author Albert Morote
 * @version 1.0
 */

/**
 * Interfície anomenada Cuidador
 */

public interface Cuidador {
    
    /**
     * Es neteja a un animal
     * @param ID_encarregat
     * @param nom_encarregat
     * @param ID_animal
     * @param nom_animal 
     */
    public void netejar(String ID_encarregat, String nom_encarregat, String ID_animal, String nom_animal, String seccio);
    
    
    /**
     * S'alimenta a un animal segons el tipus d'aliment
     * @param ID_encarregat
     * @param nom_encarregat
     * @param ID_animal
     * @param nom_animal
     * @param tipus_aliment 
     */
    public void alimentar(String ID_encarregat, String nom_encarregat, String ID_animal, String nom_animal, String tipus_aliment);
    
}
