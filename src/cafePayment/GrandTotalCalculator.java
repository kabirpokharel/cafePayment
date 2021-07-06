package cafePayment;

import java.util.ArrayList;

public class GrandTotalCalculator {
	private ArrayList<IndividualSale> salesData = new ArrayList<IndividualSale>();
	private float totalSales = 0; 
	private float totalSurcharge = 0;
	private int totalDeliveryCharge = 0;
	private float grandToal = 0;
	
	public GrandTotalCalculator(ArrayList<IndividualSale> salesData) {
		super();
		this.salesData = salesData;
		System.out.println("\n ############ SUMMARY ##############");
		 for (IndividualSale item: salesData) {
             System.out.println("\nSales id: " + item.getSalesId());
             System.out.println("Sales charge: $" + item.getCharge());
             System.out.println("Payment Type: " + item.getPaymentType());
             System.out.println("Payment surcharge surcharge: $" + item.getPaymentSurcharge());
             System.out.println("Delivery charge: $" + item.getDeliveryCharge());
             System.out.println("Sales Total: $" + item.getSalesTotal() + "\n");
             
            totalSales += item.getCharge(); 
         	totalSurcharge += item.getPaymentSurcharge();
         	totalDeliveryCharge += item.getDeliveryCharge();
         	grandToal += item.getSalesTotal();
             
         }
	}

	public ArrayList<IndividualSale> getSalesData() {
		return salesData;
	}

	public float getTotalSales() {
		return totalSales;
	}

	public float getTotalSurcharge() {
		return totalSurcharge;
	}

	public int getTotalDeliveryCharge() {
		return totalDeliveryCharge;
	}

	public float getGrandToal() {
		return grandToal;
	}
	
	
}
