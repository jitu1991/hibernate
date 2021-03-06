package com.test.hibernate.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table(name="Vehicle_16")
public class Vehicle16 {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int vehicleId;
	private String vehicleName;
	@ManyToMany(mappedBy="listOfVehicles")
	private Collection<UserDetails16> userList = new ArrayList<UserDetails16>();
	
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public Collection<UserDetails16> getUserList() {
		return userList;
	}
	public void setUserList(Collection<UserDetails16> userList) {
		this.userList = userList;
	}
}
