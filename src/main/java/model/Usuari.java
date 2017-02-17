package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jgarcias on 31/01/17.
 */
public class Usuari {
    private String nom;
    private String cognom;
    private String idUsuari;
    private List<Fixatge> fixatges = new ArrayList<Fixatge>();

    public Usuari(String nom,String cognom,String idUsuari) {
        this.nom = nom;
        this.cognom = cognom;
        this.idUsuari = idUsuari;
    }


    public Usuari() {

    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public String getIdUsuari() {
        return idUsuari;
    }

    public void setIdUsuari(String idUsuari) {
        this.idUsuari = idUsuari;
    }

    public List<Fixatge> getFixatges() {
        return fixatges;
    }

    public void setFixatges(List<Fixatge> fixatges) {
        this.fixatges = fixatges;
    }
}