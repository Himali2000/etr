package section_three;

public class MoneyTransferService {

	// Since both the classes are in same package, no need to import the CurrencyConverter in this class
	// Instead, one can just make an object reference to it.
	CurrencyConverter cc = new CurrencyConverter();
	
	double compute_transfer_amount(int countryIndex, double quantity_of_USD) {
		return cc.compute_transfer_amount(countryIndex, quantity_of_USD);
	}
	
	double compute_transfer_fee (int countryIndex, double quantity_of_USD) { 
		return 0.02 * compute_transfer_amount(countryIndex, quantity_of_USD);
	}
	
	public static void main(String[] args) {
	
		MoneyTransferService transferService = new MoneyTransferService();

		double transferAmount = transferService.compute_transfer_amount(0, 1000);
        double transferFee = transferService.compute_transfer_fee(0, 1000);

        System.out.println("Transfer Amount: " + transferAmount);
        System.out.println("Transfer Fee: " + transferFee);
		
	}

}
