
public class GameCampaignManager implements GameCampaign{

	@Override
	public void addCamping(Campaign campaign) {
		System.out.println("Kampanya eklenmiþtir :" + campaign.getName());
		
	}

	@Override
	public void deleteCamping(Campaign campaign) {
		System.out.println("Kampanya silinmiþtir :" + campaign.getName());
		
	}

	@Override
	public void updateCamping(Campaign campaign) {
		System.out.println("Kampanya güncellenmiþtir :" + campaign.getName());
		
	}

}
