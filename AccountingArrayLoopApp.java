
public class AccountingArrayLoopApp {

	public static void main(String[] args) {
		
		
		
		double valueOfSupply = Double.parseDouble(args[0]);		//공급가
		double vatRate = 0.1;
		double expenseRate = 0.3;
		
		double Total = valueOfSupply + valueOfSupply*vatRate;
		double vat = valueOfSupply*vatRate;
		double Expense = valueOfSupply*expenseRate;
		double Income = valueOfSupply - Expense;
		
		
		
		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT: " + vat);
		System.out.println("Total : "+ Total );
		System.out.println("Expense : "+ Expense );
		System.out.println("Income : "+ Income);
		
		double[] DividendRates = new double[3];			//double 형 데이터로 이루어진 배열이다   그리고 
		DividendRates[0] = 0.5;
		DividendRates[1] = 0.3;
		DividendRates[2] = 0.2;
		

		
		int i = 0;
		while(i < DividendRates.length) {
			System.out.println("Dividend : " +  (Income*DividendRates[i]) );
			i = i + 1;
		}
	}

}
