package com.intercom.cib.model;

import javax.persistence.*;



@Entity
@Table(name="customers")

public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer ID;
    public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCif() {
		return cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}
	@Column(name="f_name")
	private String f_name;
    @Column(name="l_name")
	private String l_name;
    @Column(name="email")
	private String email;
    @Column(name="phone")
	private String phone;
    @Column(name="cif")
	private String cif;
	
	
	
	

}
