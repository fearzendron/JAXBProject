package br.com.contractlast.model;

import java.util.Arrays;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "People", propOrder = { "firstName", "lastName", "birthDate", "parents", "rg", "cpf" })
public class People {

	private String firstName;

	private String lastName;

	private Date birthDate;

	private People[] parents;

	private String rg;

	private String cpf;

	public People() {

	}

	public People(String firstName, String lastName, Date birthDate, String rg, String cpf) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.rg = rg;
		this.cpf = cpf;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public People[] getParents() {
		return parents;
	}

	public void setParents(People[] parents) {
		this.parents = parents;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	@Override
	public String toString() {
		return "People [firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate + ", parents="
				+ Arrays.toString(parents) + ", rg=" + rg + ", cpf=" + cpf + "]";
	}

}
