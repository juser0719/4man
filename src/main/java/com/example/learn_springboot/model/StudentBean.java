package com.example.learn_springboot.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
public class StudentBean implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	Long id;
	String name;
	String passportNumber;

	public StudentBean() {
	}

	public StudentBean(Long id, String name, String passportNumber) {
		this.id = id;
		this.name = name;
		this.passportNumber = passportNumber;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassportNumber() {
		return this.passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public StudentBean id(Long id) {
		this.id = id;
		return this;
	}

	public StudentBean name(String name) {
		this.name = name;
		return this;
	}

	public StudentBean passportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof StudentBean)) {
			return false;
		}
		StudentBean studentBean = (StudentBean) o;
		return Objects.equals(id, studentBean.id) && Objects.equals(name, studentBean.name) && Objects.equals(passportNumber, studentBean.passportNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, passportNumber);
	}

	@Override
	public String toString() {
		return "{" +
			" id='" + getId() + "'" +
			", name='" + getName() + "'" +
			", passportNumber='" + getPassportNumber() + "'" +
			"}";
	}
	
}