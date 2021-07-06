package cafePayment;

import java.util.ArrayList;
import java.util.Scanner;

public class TransactionCalculator {
	
	
	private ArrayList<IndividualSale> salesData = new ArrayList<IndividualSale>();
	Scanner scan = new Scanner(System.in);
	
	public void calculation() {
		int salesId = 0;
		float charge = 0;
		int deliveryCharge = 0;
		boolean continueLoop = true;
		while(continueLoop) {
			System.out.println("Enter sales amount or '0' for summary ");
			charge = scan.nextFloat();
			if(charge > 0){	
				salesId++;
				PaymentTypeHandler paymentDetail = new PaymentTypeHandler(); 
				paymentDetail.paymentMethodType(charge);
				String paymentType = paymentDetail.getPaymentType();
				float paymentSurcharge = paymentDetail.getPaymentSurcharge();
				deliveryCharge = new DeliveryChargeHandler().deliveryChargeCalc(charge);
				IndividualSale individualSaleObj = new IndividualSale(salesId,charge,paymentType,paymentSurcharge,deliveryCharge);
				salesData.add(individualSaleObj);
				}
			else if (charge == 0){
				if(salesId == 0) {
					System.out.println("\n******* No transaction yet *******\n");
				}else {
					GrandTotalCalculator grandTotalObj= new GrandTotalCalculator(salesData);
					 System.out.println("\n***** Grand total ******");
					 System.out.println("\nTotal no. of sales: " + salesId);                 
	                 System.out.println("Payment surcharge (Grand total): $" + grandTotalObj.getTotalSurcharge());
	                 System.out.println("Delivery charge (Grand total): $" + grandTotalObj.getTotalDeliveryCharge());
	                 System.out.println("Sales Total (Grand total): $" + grandTotalObj.getGrandToal() + "\n");
					continueLoop = false;
				}
			}else {
				System.out.println("\n***** Invalid entery, Enter 0 or more ******");
			}
				
		}	
	}
}
