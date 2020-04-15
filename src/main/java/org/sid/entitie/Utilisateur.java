package org.sid.entitie;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Utilisateur implements Serializable {

	//mes differentes proprietes
	@Id @GeneratedValue
	public long id;
	public String firstname;
	public String lastname;
	public String email;
	public String login;
	public String password;
	public int isadmin;
	public String avatar;
	
	//mes constructeurs
	
	//avec parametres
	public Utilisateur(String firstname, String lastname, String email, String login, String password, int isadmin,
			String avatar) {
		super();
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.login = login;
		this.password = password;
		this.isadmin = isadmin;
		this.avatar = avatar;
	}


	//sans parametres
	
	
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getIsadmin() {
		return isadmin;
	}


	public void setIsadmin(int isadmin) {
		this.isadmin = isadmin;
	}


	public String getAvatar() {
		return avatar;
	}


	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	
	//getters and setters
	
	
	
}
