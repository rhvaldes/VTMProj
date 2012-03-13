package main.java.com.boa.domain;
// default package
// Generated Mar 9, 2012 2:46:44 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;

/**
 * RoleTransactionLimit generated by hbm2java
 */
public class RoleTransactionLimit implements java.io.Serializable {

	private RoleTransactionLimitId id;
	private Transactions transactions;
	private Roles roles;
	private Limits limits;
	private BigDecimal limitAmount;
	private String limitAmountDescription;

	public RoleTransactionLimit() {
	}

	public RoleTransactionLimit(RoleTransactionLimitId id,
			Transactions transactions, Roles roles, Limits limits) {
		this.id = id;
		this.transactions = transactions;
		this.roles = roles;
		this.limits = limits;
	}

	public RoleTransactionLimit(RoleTransactionLimitId id,
			Transactions transactions, Roles roles, Limits limits,
			BigDecimal limitAmount, String limitAmountDescription) {
		this.id = id;
		this.transactions = transactions;
		this.roles = roles;
		this.limits = limits;
		this.limitAmount = limitAmount;
		this.limitAmountDescription = limitAmountDescription;
	}

	public RoleTransactionLimitId getId() {
		return this.id;
	}

	public void setId(RoleTransactionLimitId id) {
		this.id = id;
	}

	public Transactions getTransactions() {
		return this.transactions;
	}

	public void setTransactions(Transactions transactions) {
		this.transactions = transactions;
	}

	public Roles getRoles() {
		return this.roles;
	}

	public void setRoles(Roles roles) {
		this.roles = roles;
	}

	public Limits getLimits() {
		return this.limits;
	}

	public void setLimits(Limits limits) {
		this.limits = limits;
	}

	public BigDecimal getLimitAmount() {
		return this.limitAmount;
	}

	public void setLimitAmount(BigDecimal limitAmount) {
		this.limitAmount = limitAmount;
	}

	public String getLimitAmountDescription() {
		return this.limitAmountDescription;
	}

	public void setLimitAmountDescription(String limitAmountDescription) {
		this.limitAmountDescription = limitAmountDescription;
	}

}