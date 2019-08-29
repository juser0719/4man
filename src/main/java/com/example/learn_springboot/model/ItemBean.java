package com.example.learn_springboot.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ITEM")
public class ItemBean implements Serializable
{

	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    String ITEM;
    int PRICE;
    int NUM;
    int OPTION1;
    int OPTION2;
    int OPTION3;
    int OPTION4; 

    public ItemBean() {
    }

    public ItemBean(String ITEM, int PRICE, int NUM, int OPTION1, int OPTION2, int OPTION3, int OPTION4) {
        this.ITEM = ITEM;
        this.PRICE = PRICE;
        this.NUM = NUM;
        this.OPTION1 = OPTION1;
        this.OPTION2 = OPTION2;
        this.OPTION3 = OPTION3;
        this.OPTION4 = OPTION4;
    }

    public String getITEM() {
        return this.ITEM;
    }

    public void setITEM(String ITEM) {
        this.ITEM = ITEM;
    }

    public int getPRICE() {
        return this.PRICE;
    }

    public void setPRICE(int PRICE) {
        this.PRICE = PRICE;
    }

    public int getNUM() {
        return this.NUM;
    }

    public void setNUM(int NUM) {
        this.NUM = NUM;
    }

    public int getOPTION1() {
        return this.OPTION1;
    }

    public void setOPTION1(int OPTION1) {
        this.OPTION1 = OPTION1;
    }

    public int getOPTION2() {
        return this.OPTION2;
    }

    public void setOPTION2(int OPTION2) {
        this.OPTION2 = OPTION2;
    }

    public int getOPTION3() {
        return this.OPTION3;
    }

    public void setOPTION3(int OPTION3) {
        this.OPTION3 = OPTION3;
    }

    public int getOPTION4() {
        return this.OPTION4;
    }

    public void setOPTION4(int OPTION4) {
        this.OPTION4 = OPTION4;
    }

    public ItemBean ITEM(String ITEM) {
        this.ITEM = ITEM;
        return this;
    }

    public ItemBean PRICE(int PRICE) {
        this.PRICE = PRICE;
        return this;
    }

    public ItemBean NUM(int NUM) {
        this.NUM = NUM;
        return this;
    }

    public ItemBean OPTION1(int OPTION1) {
        this.OPTION1 = OPTION1;
        return this;
    }

    public ItemBean OPTION2(int OPTION2) {
        this.OPTION2 = OPTION2;
        return this;
    }

    public ItemBean OPTION3(int OPTION3) {
        this.OPTION3 = OPTION3;
        return this;
    }

    public ItemBean OPTION4(int OPTION4) {
        this.OPTION4 = OPTION4;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ItemBean)) {
            return false;
        }
        ItemBean itemBean = (ItemBean) o;
        return Objects.equals(ITEM, itemBean.ITEM) && PRICE == itemBean.PRICE && NUM == itemBean.NUM && OPTION1 == itemBean.OPTION1 && OPTION2 == itemBean.OPTION2 && OPTION3 == itemBean.OPTION3 && OPTION4 == itemBean.OPTION4;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ITEM, PRICE, NUM, OPTION1, OPTION2, OPTION3, OPTION4);
    }

    @Override
    public String toString() {
        return "{" +
            " ITEM='" + getITEM() + "'" +
            ", PRICE='" + getPRICE() + "'" +
            ", NUM='" + getNUM() + "'" +
            ", OPTION1='" + getOPTION1() + "'" +
            ", OPTION2='" + getOPTION2() + "'" +
            ", OPTION3='" + getOPTION3() + "'" +
            ", OPTION4='" + getOPTION4() + "'" +
            "}";
    }

}