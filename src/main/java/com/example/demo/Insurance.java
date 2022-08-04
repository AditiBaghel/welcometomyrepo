package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="insurance")
public class Insurance {
	public Insurance(int policy_id, String policyHolders, String address, String location, String nominee,
			Long totalAmount, String toBePaid) {
		super();
		this.policy_id = policy_id;
		this.policyHolders = policyHolders;
		this.address = address;
		this.location = location;
		this.nominee = nominee;
		this.totalAmount = totalAmount;
		this.toBePaid = toBePaid;
	}
	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Insurance [policy_id=" + policy_id + ", policyHolders=" + policyHolders + ", address=" + address
				+ ", location=" + location + ", nominee=" + nominee + ", totalAmount=" + totalAmount + ", toBePaid="
				+ toBePaid + "]";
	}
	public int getPolicy_id() {
		return policy_id;
	}
	public void setPolicy_id(int policy_id) {
		this.policy_id = policy_id;
	}
	public String getPolicyHolders() {
		return policyHolders;
	}
	public void setPolicyHolders(String policyHolders) {
		this.policyHolders = policyHolders;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getNominee() {
		return nominee;
	}
	public void setNominee(String nominee) {
		this.nominee = nominee;
	}
	public Long getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getToBePaid() {
		return toBePaid;
	}
	public void setToBePaid(String toBePaid) {
		this.toBePaid = toBePaid;
	}

	@Id
	int policy_id; 
	
	@Column(name="policy_holder")
	String policyHolders;
	
	@Column(name="address")
	String address;
	
	@Column(name="location")
	String location;
	
	@Column(name="nominee")
	String nominee;
	
	@Column(name="total_amount")
	Long totalAmount;
	
	@Column(name="to_be_paid")
	String toBePaid;
	
	
	
	
	
    
	
//Amout	montly/Quartely/half yearly/yearly.

}
