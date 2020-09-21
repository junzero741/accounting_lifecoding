
public class AccountingApp {

	public static void main(String[] args) {
		
		
		
		double valueOfSupply = Double.parseDouble(args[0]);		//°ø±Þ°¡
		double vatRate = 0.1;
		double expenseRate = 0.3;
		
		double Total = valueOfSupply + valueOfSupply*vatRate;
		double vat = valueOfSupply*vatRate;
		double Expense = valueOfSupply*expenseRate;
		double Income = valueOfSupply - Expense;
		double Dividend1 = (Income*0.5);
		double Dividend2 = (Income*0.3);
		double Dividend3 = (Income*0.2);
		
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
