package com.example.learn_springboot.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="list")
public class ListBean implements Serializable
{

	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    String ITEM;
    int NUM;
    int PRICE;
    String ORDERED;

    public ListBean() {
    }

    public ListBean(String ITEM, int NUM, int PRICE, String ORDERED) {
        this.ITEM = ITEM;
        this.NUM = NUM;
        this.PRICE = PRICE;
        this.ORDERED = ORDERED;
    }

    public String getITEM() {
        return this.ITEM;
    }

    public void setITEM(String ITEM) {
        this.ITEM = ITEM;
    }

    public int getNUM() {
        return this.NUM;
    }

    public void setNUM(int NUM) {
        this.NUM = NUM;
    }

    public int getPRICE() {
        return this.PRICE;
    }

    public void setPRICE(int PRICE) {
        this.PRICE = PRICE;
    }

    public String getORDERED() {
        return this.ORDERED;
    }

    public void setORDERED(String ORDERED) {
        this.ORDERED = ORDERED;
    }

    public ListBean ITEM(String ITEM) {
        this.ITEM = ITEM;
        return this;
    }

    public ListBean NUM(int NUM) {
        this.NUM = NUM;
        return this;
    }

    public ListBean PRICE(int PRICE) {
        this.PRICE = PRICE;
        return this;
    }

    public ListBean ORDERED(String ORDERED) {
        this.ORDERED = ORDERED;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ListBean)) {
            return false;
        }
        ListBean listBean = (ListBean) o;
        return Objects.equals(ITEM, listBean.ITEM) && NUM == listBean.NUM && PRICE == listBean.PRICE && Objects.equals(ORDERED, listBean.ORDERED);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ITEM, NUM, PRICE, ORDERED);
    }

    @Override
    public String toString() {
        return "{" +
            " ITEM='" + getITEM() + "'" +
            ", NUM='" + getNUM() + "'" +
            ", PRICE='" + getPRICE() + "'" +
            ", ORDERED='" + getORDERED() + "'" +
            "}";
    }

}