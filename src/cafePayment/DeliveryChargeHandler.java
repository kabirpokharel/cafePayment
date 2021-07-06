package cafePayment;

public class DeliveryChargeHandler {
	private int deliveryCharge = 0;
	
	public int deliveryChargeCalc(float charge) {
		if(charge >0 && charge <= 50) {
			deliveryCharge = 10;
		}
		else if(50 < charge && charge <= 100) {
			deliveryCharge = 5;
		}
		else {
			deliveryCharge = 0;
		}
		return deliveryCharge;
	}
	

}