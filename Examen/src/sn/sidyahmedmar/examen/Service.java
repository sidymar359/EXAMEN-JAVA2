package sn.sidyahmedmar.examen;

public class Service implements IService {

    private  String libelle;
    private int id;
    private int ageRetraite;

    public  Service () {

    }

    public  Service (String libelle, int id, int ageRetraite) {
        this.libelle = libelle;
        this.id = id;
        this.ageRetraite = ageRetraite;
    }

    public String getLibelle() {
        return libelle;
    }

    public int getId() {
        return id;
    }
    
    public int getAgeRetraite() {
        return ageRetraite;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }


    @Override
    public String affiche() {
        return "ID " + id + " Libelle " + libelle;
    }

    public boolean compare(int id) {
        return  this.id == id;
    }

    public boolean compare(String libelle) {
        return  this.libelle == libelle;
    }
    public boolean compared(int ageEmp) {
    	return this.ageRetraite > ageEmp;
    }
}
