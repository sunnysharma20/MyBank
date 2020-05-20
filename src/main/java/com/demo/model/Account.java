package com.demo.model;

public class Account {

	private String Id;
	private String Name;
	private String Address;
	private String Balance;

	public String getId() {
		return Id;
	}

	public void setId(String Id) {
		this.Id = Id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getBalance() {
		return Balance;
	}

	public void setBalance(String balance) {
		Balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [Id=" + Id + ", Name=" + Name + "]";
	}

}