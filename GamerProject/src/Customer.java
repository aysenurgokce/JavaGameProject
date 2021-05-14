
public class Customer {
	public long identityId;
	 public String firstName;
	 public String lastName;
	 public int dateOfBirt;
	public Customer(long identityId, String firstName, String lastName, int dateOfBirt) {
		super();
		this.identityId = identityId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirt = dateOfBirt;
	}
	public long getIdentityId() {
		return identityId;
	}
	public void setIdentityId(long identityId) {
		this.identityId = identityId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getDateOfBirt() {
		return dateOfBirt;
	}
	public void setDateOfBirt(int dateOfBirt) {
		this.dateOfBirt = dateOfBirt;
	}
}
