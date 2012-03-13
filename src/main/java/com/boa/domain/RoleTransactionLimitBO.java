package main.java.com.boa.domain;
// default package
// Generated Mar 9, 2012 2:46:44 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;

/**
 * RoleTransactionLimit generated by hbm2java
 */
public class RoleTransactionLimitBO implements java.io.Serializable {

	private RoleTransactionLimitIdBO id;
	private TransactionsBO transactions;
	private RolesBO roles;
	private LimitsBO limits;
	private BigDecimal limitAmount;
	private String limitAmountDescription;

	public RoleTransactionLimitBO() {
	}

	public RoleTransactionLimitBO(RoleTransactionLimitIdBO id,
			TransactionsBO transactions, RolesBO roles, LimitsBO limits) {
		this.id = id;
		this.transactions = transactions;
		this.roles = roles;
		this.limits = limits;
	}

	public RoleTransactionLimitBO(RoleTransactionLimitIdBO id,
			TransactionsBO transactions, RolesBO roles, LimitsBO limits,
			BigDecimal limitAmount, String limitAmountDescription) {
		this.id = id;
		this.transactions = transactions;
		this.roles = roles;
		this.limits = limits;
		this.limitAmount = limitAmount;
		this.limitAmountDescription = limitAmountDescription;
	}

	public RoleTransactionLimitIdBO getId() {
		return this.id;
	}

	public void setId(RoleTransactionLimitIdBO id) {
		this.id = id;
	}

	public TransactionsBO getTransactions() {
		return this.transactions;
	}

	public void setTransactions(TransactionsBO transactions) {
		this.transactions = transactions;
	}

	public RolesBO getRoles() {
		return this.roles;
	}

	public void setRoles(RolesBO roles) {
		this.roles = roles;
	}

	public LimitsBO getLimits() {
		return this.limits;
	}

	public void setLimits(LimitsBO limits) {
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
