package com.xworkz.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="address_table")

	public class Address {

		@Id
		@Column(name="adress_id")
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer addressId;
	    private String street;
	    private String city;
	    private String state;
	    private Integer pincode;
	    
	    @OneToOne(mappedBy="address")
	    private Employee employee;
	    
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public Integer getPincode() {
			return pincode;
		}
		public void setPincode(Integer pincode) {
			this.pincode = pincode;
		}
		
		public void setEmployee(Employee employee) {
			this.employee = employee;
		}
		
		public Employee getEmployee() {
			return employee;
		}
		@Override
		public String toString() {
			return "Address [street=" + street + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
		}	

}
