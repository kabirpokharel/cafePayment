package cafePayment;

import java.util.ArrayList;

public class IndividualSale {
	private int salesId; 
	private float charge;
	private String paymentType;
	private float paymentSurcharge;
	private int deliveryCharge;
	private float salesTotal;
	
	public IndividualSale(int salesId, float charge, String paymentType, float paymentSurcharge,
			int deliveryCharge) {
		super();
		this.salesId = salesId;
		this.charge = charge;
		this.paymentType = paymentType;
		this.paymentSurcharge = paymentSurcharge;
		this.deliveryCharge = deliveryCharge;
		this.salesTotal = charge + paymentSurcharge + deliveryCharge;
		
		 System.out.println("\nSales id: " + this.salesId);
         System.out.println("Sales charge: $" + this.charge);
         System.out.println("Payment Type: " + this.paymentType);
         System.out.println("Payment surcharge surcharge: $" + this.paymentSurcharge);
         System.out.println("Delivery charge: $" + this.deliveryCharge);
         System.out.println("Sales Total: $" + this.salesTotal + "\n");
	}

	public int getSalesId() {
		return salesId;
	}



	public float getCharge() {
		return charge;
	}


	public String getPaymentType() {
		return paymentType;
	}


	public float getPaymentSurcharge() {
		return paymentSurcharge;
	}

	public int getDeliveryCharge() {
		return deliveryCharge;
	}


	public float getSalesTotal() {
		return salesTotal;
	}


	@Override
	public String toString() {
		return "IndividualSale [salesId=" + salesId + ", charge=" + charge + ", paymentType=" + paymentType
				+ ", paymentSurcharge=" + paymentSurcharge + ", deliveryCharge=" + deliveryCharge + ", salesTotal="
				+ salesTotal + "]";
	}
	
}
