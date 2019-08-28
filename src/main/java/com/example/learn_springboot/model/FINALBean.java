package com.example.learn_springboot.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOM")
public class FINALBean implements Serializable{

	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    String ID;
    String PASS;
    String NAME;
    String EMAIL;
    int PHONE1;
    int PHONE2;
    int PHONE3;
    String ADDRESS;

    public FINALBean() {
    }

    public FINALBean(String ID, String PASS, String NAME, String EMAIL, int PHONE1, int PHONE2, int PHONE3, String ADDRESS) {
        this.ID = ID;
        this.PASS = PASS;
        this.NAME = NAME;
        this.EMAIL = EMAIL;
        this.PHONE1 = PHONE1;
        this.PHONE2 = PHONE2;
        this.PHONE3 = PHONE3;
        this.ADDRESS = ADDRESS;
    }

    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPASS() {
        return this.PASS;
    }

    public void setPASS(String PASS) {
        this.PASS = PASS;
    }

    public String getNAME() {
        return this.NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getEMAIL() {
        return this.EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public int getPHONE1() {
        return this.PHONE1;
    }

    public void setPHONE1(int PHONE1) {
        this.PHONE1 = PHONE1;
    }

    public int getPHONE2() {
        return this.PHONE2;
    }

    public void setPHONE2(int PHONE2) {
        this.PHONE2 = PHONE2;
    }

    public int getPHONE3() {
        return this.PHONE3;
    }

    public void setPHONE3(int PHONE3) {
        this.PHONE3 = PHONE3;
    }

    public String getADDRESS() {
        return this.ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public FINALBean ID(String ID) {
        this.ID = ID;
        return this;
    }

    public FINALBean PASS(String PASS) {
        this.PASS = PASS;
        return this;
    }

    public FINALBean NAME(String NAME) {
        this.NAME = NAME;
        return this;
    }

    public FINALBean EMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
        return this;
    }

    public FINALBean PHONE1(int PHONE1) {
        this.PHONE1 = PHONE1;
        return this;
    }

    public FINALBean PHONE2(int PHONE2) {
        this.PHONE2 = PHONE2;
        return this;
    }

    public FINALBean PHONE3(int PHONE3) {
        this.PHONE3 = PHONE3;
        return this;
    }

    public FINALBean ADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof FINALBean)) {
            return false;
        }
        FINALBean fINALBean = (FINALBean) o;
        return Objects.equals(ID, fINALBean.ID) && Objects.equals(PASS, fINALBean.PASS) && Objects.equals(NAME, fINALBean.NAME) && Objects.equals(EMAIL, fINALBean.EMAIL) && PHONE1 == fINALBean.PHONE1 && PHONE2 == fINALBean.PHONE2 && PHONE3 == fINALBean.PHONE3 && Objects.equals(ADDRESS, fINALBean.ADDRESS);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, PASS, NAME, EMAIL, PHONE1, PHONE2, PHONE3, ADDRESS);
    }

    @Override
    public String toString() {
        return "{" +
            " ID='" + getID() + "'" +
            ", PASS='" + getPASS() + "'" +
            ", NAME='" + getNAME() + "'" +
            ", EMAIL='" + getEMAIL() + "'" +
            ", PHONE1='" + getPHONE1() + "'" +
            ", PHONE2='" + getPHONE2() + "'" +
            ", PHONE3='" + getPHONE3() + "'" +
            ", ADDRESS='" + getADDRESS() + "'" +
            "}";
    }

}