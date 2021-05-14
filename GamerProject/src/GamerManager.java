

public class GamerManager implements Gamer{
	
	private ICustomerCheckService _customercheckservice;
	

	public GamerManager(ICustomerCheckService _customercheckservice) {
		this._customercheckservice = _customercheckservice;
	}

	@Override
	public void add(Customer customer) {
		if(_customercheckservice.CheckIfRealPerson(customer)) {
			
		System.out.println("Oyuncu eklendi :" + customer.firstName);
		}else {
			System.out.println("ge�ersiz oyuncu");
		}
	}
	
	@Override
	public void update(Customer customer) {
		System.out.println("Oyuncu bilgileri g�ncellendi : " + customer.firstName);
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Oyuncu kay�t� silindi : " + customer.firstName);
		
	}

}
