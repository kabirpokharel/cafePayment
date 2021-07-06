package cafePayment;

public class AmexPayment implements PaymentType{

	@Override
	public float paymentSurcharge(float charge, float surchargeRate) {
		// TODO Auto-generated method stub
		return (charge * (surchargeRate/100));
	}

	
	
}
