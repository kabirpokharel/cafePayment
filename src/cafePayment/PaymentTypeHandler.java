package cafePayment;

import java.util.Scanner;
import java.util.ArrayList;

public class PaymentTypeHandler {
	private float surcharge = 0;
	private String paymentType = "";
	private boolean continueLoop = false;
	
	Scanner scan = new Scanner(System.in);
	
	public void paymentMethodType(float charge) {
		do{
			continueLoop = false;
			System.out.println("Please Enter: **1 (Master card)  **2 (Visa card)  **3 (Amex card)  **4 (Gift card) **5 (Cash)");
			int paymentTypeId = scan.nextInt();
			switch(paymentTypeId) {
			  case 1:
				  paymentType = "Master card";
				  surcharge = new MasterVisaPayment().paymentSurcharge(charge,(float) 1.5);
			    break;
			  case 2:
				  paymentType = "Visa card";
				  surcharge = new MasterVisaPayment().paymentSurcharge(charge,(float) 1.5);
			    break;
			  case 3:
				  paymentType = "Amex card";
				  surcharge = new AmexPayment().paymentSurcharge(charge,(float) 3.0);
			    break;
			  case 4:
				  paymentType = "Gift card";
				  surcharge = new ChargeLessPayment().paymentSurcharge(charge,(float) 1.0);
			    break;
			  case 5:
				  paymentType = "Cash";
				  surcharge = new ChargeLessPayment().paymentSurcharge(charge,(float) 1.0);
			    break;
			  default:
				  System.out.println("Invalid entry !!!");
				  continueLoop = true;
			}
		}while(continueLoop);
		
	}

	public String getPaymentType() {
		return paymentType;
	}

	public float getPaymentSurcharge() {
		return surcharge;
	}
	
	
	
}





