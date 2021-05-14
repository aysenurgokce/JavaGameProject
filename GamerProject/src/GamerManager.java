

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
			System.out.println("geçersiz oyuncu");
		}
	}
	
	@Override
	public void update(Customer customer) {
		System.out.println("Oyuncu bilgileri güncellendi : " + customer.firstName);
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Oyuncu kayýtý silindi : " + customer.firstName);
		
	}

}
