package org.zodiac.hibernate.entity;

import javax.persistence.*;

@Entity(name="account")
@Table(name="account")
public class Account {
	
	@Id
	@Column(name="acc_id")
	int accId;
	@Column(name="acc_type")
	String accType;
	@Column(name="balance")
	double balance;

	public Account() {
		super();
	}

	public Account(int accId, String accType, double balance) {
		super();
		this.accId = accId;
		this.accType = accType;
		this.balance = balance;
	}

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accId=" + accId + ", accType=" + accType + ", balance=" + balance + "]";
	}
}
