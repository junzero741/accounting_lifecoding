
public class AccountingArrayApp {

	public static void main(String[] args) {
		
		
		
		double valueOfSupply = Double.parseDouble(args[0]);		//���ް�
		double vatRate = 0.1;
		double expenseRate = 0.3;
		
		double Total = valueOfSupply + valueOfSupply*vatRate;
		double vat = valueOfSupply*vatRate;
		double Expense = valueOfSupply*expenseRate;
		double Income = valueOfSupply - Expense;
		
		
		double[] DividendRates = new double[3];			//double �� �����ͷ� �̷���� �迭�̴�   �׸��� 
		DividendRates[0] = 0.5;
		DividendRates[1] = 0.3;
		DividendRates[2] = 0.2;
		
		
		double Dividend1 = (Income*DividendRates[0]);
		double Dividend2 = (Income*DividendRates[1]);
		double Dividend3 = (Income*DividendRates[2]);
		
		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT: " + vat);
		System.out.println("Total : "+ Total );
		System.out.println("Expense : "+ Expense );
		System.out.println("Income : "+ Income);
		System.out.println("Dividend1 : "+  Dividend1 );
		System.out.println("Dividend2 : "+  Dividend2 );
		System.out.println("Dividend3 : "+  Dividend3 );
		
	}

}
