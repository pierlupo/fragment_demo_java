package com.exercice1.model;

public class Contact {

    private int id;
    private String prnm;

    private String nm;

    private String phon;


    public Contact(String prnm, String nm, String phon) {
        this.prnm = prnm;
        this.nm = nm;
        this.phon = phon;
    }

    public Contact(int id, String prnm, String nm, String phone) {
        this.id = id;
        this.prnm = prnm;
        this.nm = nm;
        this.phon = phon;
    }

    public int getId() {
        return id;
    }

    public String getPrnm() {
        return prnm;
    }

    public String getNm() {
        return nm;
    }

    public String getPhon() {
        return phon;
    }


    public void setFirstname(String prnm) {
        this.prnm = prnm;
    }

    public void setLastname(String nm) {
        this.nm = nm;
    }

    public void setPhone(String phon) {
        this.phon = phon;
    }
}
