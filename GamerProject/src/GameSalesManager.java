
public class GameSalesManager implements GameSales{

	@Override
	public void addSales(Customer customer, Sales sales ,Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyas� " + sales.getName() + " adl� sat��a uygulanm��t�r.");
		System.out.println(sales.getName() + " adl� oyunun sat��� " + customer.firstName + " adl� oyuncuya uygulanm��t�r.");
	}

}
