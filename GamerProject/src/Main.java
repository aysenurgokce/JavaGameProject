
public class Main {

	public static void main(String[] args) {
		Customer customer=new Customer(1234545415," Ayþenur ", " GÖKÇE " ,1999);
		GamerManager gameManager =new GamerManager(new CustomerCheckManager());
		gameManager.add(customer);
		gameManager.delete(customer);
		gameManager.update(customer);
		
		GameCampaignManager campaignManager = new GameCampaignManager();
		campaignManager.addCamping(new Campaign(1 , " 200 tl üzeri %30 indirim " ));
		campaignManager.deleteCamping(new Campaign (2 , " %50 indirim "));
		campaignManager.updateCamping(new Campaign (3, " bir alana ikincisi 1 tl"));
		
		GameSalesManager gameSalesManager =new GameSalesManager();
		gameSalesManager.addSales(new Customer(1234545415," Ayþenur ", " GÖKÇE " ,1999), new Sales(1 , "GAME ", 23),new Campaign(1,"130 tl üzeri %30 indirim "));
		

	}

}
