package sn.sidyahmedmar.examen;

import java.time.*;


public abstract class Employe implements IService{
    private int  id;
    private  String nomComplet;
    private LocalDate birthDate;
    private int ageEmp;


    public  Employe () {

    }

    public  Employe (int id, String nomComplet) {
        this.nomComplet = nomComplet;
        this.id = id;

    }

    public int getId() {
        return id;
    }

    public String getNomComlpet() {
        return nomComplet;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomComplet(String nomCompet) {
        this.nomComplet = nomCompet;
    }

    public String affiche() {
        return "ID: "+id+" Prenom et NOM: "+nomComplet;
    }

    public boolean isEmbauche() {
        if (this instanceof  Embauche) {
            return  true;
        }
        return  false;
    }

    public  boolean isJouurnalier() {
        if (this instanceof  Journalier) {
            return  true;
        }
        return  false;
    }
    

        public int calculateAge(LocalDate birthDate, LocalDate currentDate) {
            if ((birthDate != null) && (currentDate != null)) {
                return ageEmp=Period.between(birthDate, currentDate).getYears();
            } else {
                return 0;
            }
    }
}
