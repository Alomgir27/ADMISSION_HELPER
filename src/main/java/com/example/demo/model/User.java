package com.example.demo.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.JoinColumn;

@Entity
@Table(name =  "user", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;

    @Column(name = "roll")
    private Long roll;
	
    @Column(name = "registrationNumber")
    private String registration_number;

	@Column(name = "name")
	private String name;
	
	@Column(name = "userName")
	private String userName;
	
    @Column(name = "email")
	private String email;
	
	private String password;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(
			name = "users_roles",
			joinColumns = @JoinColumn(
		            name = "user_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(
				            name = "role_id", referencedColumnName = "id"))
	
	private Collection<Role> roles;
	
	public User() {
		
	}
	
	public User(Long roll, String registration_number, String name, String userName, String email, String password, Collection<Role> roles) {
        super();
        this.roll = roll;
        this.registration_number = registration_number;
        this.name = name;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.roles = roles;
        System.out.println("9");

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoll() {
        return roll;
    }

    public void setRoll(Long roll) {
        this.roll = roll;
    }

    public String getRegistrationNumber() {
        return registration_number;
    }

    public void setRegistration(String registration_number) {
        this.registration_number = registration_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }
	

}