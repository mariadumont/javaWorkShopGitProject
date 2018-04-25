/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/
package main.workshopgitproject.classes;

import java.util.Date;
import java.util.HashSet;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Invoice.
 * 
 * @author alu20482156n
 */
public class Invoice {
	/**
	 * Description of the property applyDiscount.
	 */
	private boolean applyDiscount = false;

	/**
	 * Description of the property clients.
	 */
	public Client clients = null;

	/**
	 * Description of the property datePurchase.
	 */
	private Date datePurchase = null;

	/**
	 * Description of the property totalAmount.
	 */
	private double totalAmount = 0D;

	/**
	 * Description of the property identifier.
	 */
	private int identifier = 0;

	/**
	 * Description of the property invoiceLines.
	 */
	public HashSet<InvoiceLine> invoiceLines = new HashSet<InvoiceLine>();

	// Start of user code (user defined attributes for Invoice)

	// End of user code

	/**
	 * The constructor.
	 */
	public Invoice() {
		// Start of user code constructor for Invoice)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Invoice)

	// End of user code
	/**
	 * Returns applyDiscount.
	 * @return applyDiscount 
	 */
	public boolean getApplyDiscount() {
		return this.applyDiscount;
	}

	/**
	 * Sets a value to attribute applyDiscount. 
	 * @param newApplyDiscount 
	 */
	public void setApplyDiscount(boolean newApplyDiscount) {
		this.applyDiscount = newApplyDiscount;
	}

	/**
	 * Returns clients.
	 * @return clients 
	 */
	public Client getClients() {
		return this.clients;
	}

	/**
	 * Sets a value to attribute clients. 
	 * @param newClients 
	 */
	public void setClients(Client newClients) {
		this.clients = newClients;
	}

	/**
	 * Returns datePurchase.
	 * @return datePurchase 
	 */
	public Date getDatePurchase() {
		return this.datePurchase;
	}

	/**
	 * Sets a value to attribute datePurchase. 
	 * @param newDatePurchase 
	 */
	public void setDatePurchase(Date newDatePurchase) {
		this.datePurchase = newDatePurchase;
	}

	/**
	 * Returns totalAmount.
	 * @return totalAmount 
	 */
	public double getTotalAmount() {
		return this.totalAmount;
	}

	/**
	 * Sets a value to attribute totalAmount. 
	 * @param newTotalAmount 
	 */
	public void setTotalAmount(double newTotalAmount) {
		this.totalAmount = newTotalAmount;
	}

	/**
	 * Returns identifier.
	 * @return identifier 
	 */
	public int getIdentifier() {
		return this.identifier;
	}

	/**
	 * Sets a value to attribute identifier. 
	 * @param newIdentifier 
	 */
	public void setIdentifier(int newIdentifier) {
		this.identifier = newIdentifier;
	}

	/**
	 * Returns invoiceLines.
	 * @return invoiceLines 
	 */
	public HashSet<InvoiceLine> getInvoiceLines() {
		return this.invoiceLines;
	}
	
	private void calculateTotalInvoiceAmount() {
		double amount=0;
		for(InvoiceLine ivl  : invoiceLines) {
			amount+=ivl.getInvoiceLineAmount();
		}
		this.totalAmount=amount;
	}

}
