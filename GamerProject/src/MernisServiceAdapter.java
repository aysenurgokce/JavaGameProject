import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy kpspublicsoapproxy = new KPSPublicSoapProxy();
		try {
			return kpspublicsoapproxy.TCKimlikNoDogrula(customer.identityId,customer.firstName,customer.lastName,customer.dateOfBirt);	
			}catch (Exception e) {
				System.out.println("Not a valid identity id.");
			}
		return false;
	}

}
