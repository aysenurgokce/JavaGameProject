
public class GameSalesManager implements GameSales{

	@Override
	public void addSales(Customer customer, Sales sales ,Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyasý " + sales.getName() + " adlý satýþa uygulanmýþtýr.");
		System.out.println(sales.getName() + " adlý oyunun satýþý " + customer.firstName + " adlý oyuncuya uygulanmýþtýr.");
	}

}
