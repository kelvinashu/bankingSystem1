package za.co.bankingsystem.entities;

import java.util.Random;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "card")
public class Card {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "card_number")
	private long cardNumber;
	@Column(name = "pin")
	private int pin;
	@Column(name = "card_type")
	private String cardType;
	@OneToOne(cascade = CascadeType.ALL)
	private Account account;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Card() {
		super();
		String generateCardNumber = String.valueOf(new Random().nextLong()).substring(1, 14);
		this.cardNumber = Long.parseLong(generateCardNumber);
	}

	public Card(long cardNumber, int pin, String cardType) {
		super();
		this.cardNumber = cardNumber;
		this.pin = pin;
		this.cardType = cardType;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	@Override
	public String toString() {
		return "Card [cardNumber=" + cardNumber + ", pin=" + pin + ", cardType=" + cardType + ", account=" + account
				+ "]";
	}

}
