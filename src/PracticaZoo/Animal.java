package PracticaZoo;

/**
 * Creació de la classe diferida Animal
 */
public abstract class Animal {

protected String nom;
protected String raça;
protected String ID;
protected String ID_pare;
protected String ID_mare; 
protected int edat;
protected boolean femeni;
protected float pes;
protected int esp_vida;
protected boolean vertebrat;
protected String alimentacio;
protected String reproduccio;
protected String ecosistema;
protected String vacunacio;
protected String seccio;

/**
 * Passem 3 ID i les guarda amb un set
 * @param ID_pare
 * @param ID_mare
 * @param ID 
 */
public abstract void reproduir(String ID_pare, String raça_p, String ID_mare, String raça_m, String ID_fill);

/**
 * Diu si l'objecte té l'atribut boolean vertebrat FALSE o TRUE.
 */
public abstract boolean isVertebrat();

}
