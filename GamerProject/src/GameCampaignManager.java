
public class GameCampaignManager implements GameCampaign{

	@Override
	public void addCamping(Campaign campaign) {
		System.out.println("Kampanya eklenmiştir :" + campaign.getName());
		
	}

	@Override
	public void deleteCamping(Campaign campaign) {
		System.out.println("Kampanya silinmiştir :" + campaign.getName());
		
	}

	@Override
	public void updateCamping(Campaign campaign) {
		System.out.println("Kampanya güncellenmiştir :" + campaign.getName());
		
	}

}
