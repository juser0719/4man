package com.example.learn_springboot.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="costom_info")
public class FinalBean implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private String ID;
	private String PASS;
    private String TEL;
    private String ADDRESS;
	private Integer ITEM;
    private String LIST;
    private Integer PRICE;
    

    public FinalBean() {
    }

    public FinalBean(String ID, String PASS, String TEL, String ADDRESS, Integer ITEM, String LIST, Integer PRICE) {
        this.ID = ID;
        this.PASS = PASS;
        this.TEL = TEL;
        this.ADDRESS = ADDRESS;
        this.ITEM = ITEM;
        this.LIST = LIST;
        this.PRICE = PRICE;
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

    public String getTEL() {
        return this.TEL;
    }

    public void setTEL(String TEL) {
        this.TEL = TEL;
    }

    public String getADDRESS() {
        return this.ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public Integer getITEM() {
        return this.ITEM;
    }

    public void setITEM(Integer ITEM) {
        this.ITEM = ITEM;
    }

    public String getLIST() {
        return this.LIST;
    }

    public void setLIST(String LIST) {
        this.LIST = LIST;
    }

    public Integer getPRICE() {
        return this.PRICE;
    }

    public void setPRICE(Integer PRICE) {
        this.PRICE = PRICE;
    }

    public FinalBean ID(String ID) {
        this.ID = ID;
        return this;
    }

    public FinalBean PASS(String PASS) {
        this.PASS = PASS;
        return this;
    }

    public FinalBean TEL(String TEL) {
        this.TEL = TEL;
        return this;
    }

    public FinalBean ADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
        return this;
    }

    public FinalBean ITEM(Integer ITEM) {
        this.ITEM = ITEM;
        return this;
    }

    public FinalBean LIST(String LIST) {
        this.LIST = LIST;
        return this;
    }

    public FinalBean PRICE(Integer PRICE) {
        this.PRICE = PRICE;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof FinalBean)) {
            return false;
        }
        FinalBean finalBean = (FinalBean) o;
        return Objects.equals(ID, finalBean.ID) && Objects.equals(PASS, finalBean.PASS) && Objects.equals(TEL, finalBean.TEL) && Objects.equals(ADDRESS, finalBean.ADDRESS) && Objects.equals(ITEM, finalBean.ITEM) && Objects.equals(LIST, finalBean.LIST) && Objects.equals(PRICE, finalBean.PRICE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, PASS, TEL, ADDRESS, ITEM, LIST, PRICE);
    }

    @Override
    public String toString() {
        return "{" +
            " ID='" + getID() + "'" +
            ", PASS='" + getPASS() + "'" +
            ", TEL='" + getTEL() + "'" +
            ", ADDRESS='" + getADDRESS() + "'" +
            ", ITEM='" + getITEM() + "'" +
            ", LIST='" + getLIST() + "'" +
            ", PRICE='" + getPRICE() + "'" +
            "}";
    }
}
