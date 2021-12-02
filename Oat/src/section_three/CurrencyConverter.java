package section_three;

public class CurrencyConverter {
	
	double[] exchageRate = new double[] {63.0, 3.0, 3.0, 595.5, 18.0, 107.0, 2.0};

	void set_exchangeRate(double[] list) {
		exchageRate = list;
	}
	
	void update_exchangeRate(int countryIndex, double newVal) {
		exchageRate[countryIndex] = newVal;
	}
	
	double get_exchangeRate(int countryIndex) {
		return exchageRate[countryIndex];
	}
	
	double compute_transfer_amount(int countryIndex, double quantity_of_USD) {
		return quantity_of_USD * exchageRate[countryIndex];
	}
	
	// Instance method
	public void print_currencies() {
		
		System.out.println("Rupee: " + exchageRate[0]);
		System.out.println("Dirham: " + exchageRate[1]);
		System.out.println("Brazilian: " + exchageRate[2]);
		System.out.println("Chilean Peso: " + exchageRate[3]);
		System.out.println("Mexican Peso: " + exchageRate[4]);
		System.out.println("Yen: " + exchageRate[5]);
		System.out.println("Austratian Dollar: " + exchageRate[exchageRate.length-1]);

	}

	/*
	public static void main(String[] args) {
		
		double[] rate = {63, 3, 3, 595, 18, 107, 2};
		
		// An object to call instance method
		CurrencyConverter cc = new CurrencyConverter();
		
		cc.set_exchangeRate(rate);
		cc.print_currencies();
		
	}
	*/
}
