
public class GameCampaignManager implements GameCampaign{

	@Override
	public void addCamping(Campaign campaign) {
		System.out.println("Kampanya eklenmi�tir :" + campaign.getName());
		
	}

	@Override
	public void deleteCamping(Campaign campaign) {
		System.out.println("Kampanya silinmi�tir :" + campaign.getName());
		
	}

	@Override
	public void updateCamping(Campaign campaign) {
		System.out.println("Kampanya g�ncellenmi�tir :" + campaign.getName());
		
	}

}
