package za.co.bankingsystem.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transaction")
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "transaction_id")
	private int transaction_id;
	@Column(name = "transaction_type")
	private String transactionType;
	@Column(name = "transaction_balance")
	private double transactionBalance;
	@Column(name = "transaction_date_time")
	private LocalDateTime transactionDateTime;

	public Transaction() {
		super();
	}

	public Transaction(int transaction_id, String transactionType, double transactionBalance,
			LocalDateTime transactionDateTime) {
		super();
		this.transaction_id = transaction_id;
		this.transactionType = transactionType;
		this.transactionBalance = transactionBalance;
		this.transactionDateTime = transactionDateTime;
	}

	public int getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public double getTransactionBalance() {
		return transactionBalance;
	}

	public void setTransactionBalance(double transactionBalance) {
		this.transactionBalance = transactionBalance;
	}

	public LocalDateTime getTransactionDateTime() {
		return transactionDateTime;
	}

	public void setTransactionDateTime(LocalDateTime transactionDateTime) {
		this.transactionDateTime = transactionDateTime;
	}

	
	@Override
	public String toString() {
		return "Transaction [transaction_id=" + transaction_id + ", transactionType=" + transactionType
				+ ", transactionBalance=" + transactionBalance + ", transactionDateTime=" + transactionDateTime + "]";
	}

}
