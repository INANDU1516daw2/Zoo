package PracticaZoo;

//DONE
public abstract class Animal {

protected String nom;
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

public abstract void reproduir(String ID_pare, String ID_mare, String ID);

public abstract boolean isVertebrat();

}
