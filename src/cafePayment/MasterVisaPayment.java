package cafePayment;

public class MasterVisaPayment implements PaymentType{

	@Override
	public float paymentSurcharge(float charge, float surchargeRate) {
		// TODO Auto-generated method stub
		return (charge * (surchargeRate/100));
	}}
