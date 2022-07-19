package com.test.main.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name="Address101") 
public class Address 
{
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)  
    private long addId;
	private long empId;
	private String streetName;
	private String city;
	private String pinCode;
	
	@Enumerated(value=EnumType.STRING)
    private AddressType addressType;

	public long getAddId() {
		return addId;
	}

	public void setAddId(long addId) {
		this.addId = addId;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public AddressType getAddressType() {
		return addressType;
	}

	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}

	@Override
	public String toString() {
		return "Address [addId=" + addId + ", empId=" + empId + ", streetName=" + streetName + ", city=" + city
				+ ", pinCode=" + pinCode + ", addressType=" + addressType + "]";
	}
}
