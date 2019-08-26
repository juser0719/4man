package com.example.learn_springboot.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CIP_ORGANIZATION")
public class OrganizationBean implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private String ORGANIZATION_SEQ;
	private String NAME;
	private String TELEPHONE;
	private Integer ORDER_NUMBER;

	public OrganizationBean() {
	}

	public OrganizationBean(String ORGANIZATION_SEQ, String NAME, String TELEPHONE, Integer ORDER_NUMBER) {
		this.ORGANIZATION_SEQ = ORGANIZATION_SEQ;
		this.NAME = NAME;
		this.TELEPHONE = TELEPHONE;
		this.ORDER_NUMBER = ORDER_NUMBER;
	}

	public String getORGANIZATION_SEQ() {
		return this.ORGANIZATION_SEQ;
	}

	public void setORGANIZATION_SEQ(String ORGANIZATION_SEQ) {
		this.ORGANIZATION_SEQ = ORGANIZATION_SEQ;
	}

	public String getNAME() {
		return this.NAME;
	}

	public void setNAME(String NAME) {
		this.NAME = NAME;
	}

	public String getTELEPHONE() {
		return this.TELEPHONE;
	}

	public void setTELEPHONE(String TELEPHONE) {
		this.TELEPHONE = TELEPHONE;
	}

	public Integer getORDER_NUMBER() {
		return this.ORDER_NUMBER;
	}

	public void setORDER_NUMBER(Integer ORDER_NUMBER) {
		this.ORDER_NUMBER = ORDER_NUMBER;
	}

	public OrganizationBean ORGANIZATION_SEQ(String ORGANIZATION_SEQ) {
		this.ORGANIZATION_SEQ = ORGANIZATION_SEQ;
		return this;
	}

	public OrganizationBean NAME(String NAME) {
		this.NAME = NAME;
		return this;
	}

	public OrganizationBean TELEPHONE(String TELEPHONE) {
		this.TELEPHONE = TELEPHONE;
		return this;
	}

	public OrganizationBean ORDER_NUMBER(Integer ORDER_NUMBER) {
		this.ORDER_NUMBER = ORDER_NUMBER;
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof OrganizationBean)) {
			return false;
		}
		OrganizationBean organizationBean = (OrganizationBean) o;
		return Objects.equals(ORGANIZATION_SEQ, organizationBean.ORGANIZATION_SEQ) && Objects.equals(NAME, organizationBean.NAME) && Objects.equals(TELEPHONE, organizationBean.TELEPHONE) && Objects.equals(ORDER_NUMBER, organizationBean.ORDER_NUMBER);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ORGANIZATION_SEQ, NAME, TELEPHONE, ORDER_NUMBER);
	}

	@Override
	public String toString() {
		return "{" +
			" ORGANIZATION_SEQ='" + getORGANIZATION_SEQ() + "'" +
			", NAME='" + getNAME() + "'" +
			", TELEPHONE='" + getTELEPHONE() + "'" +
			", ORDER_NUMBER='" + getORDER_NUMBER() + "'" +
			"}";
	}

}